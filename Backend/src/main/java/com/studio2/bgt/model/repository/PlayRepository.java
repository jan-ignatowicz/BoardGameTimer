package com.studio2.bgt.model.repository;

import com.studio2.bgt.model.helpers.PlayHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
public class PlayRepository {

    @Bean
    public Long playId() {
        return Long.parseLong("0");
    }

    @Resource(name = "playId")
    public Long playId = 0L;

    @Bean
    public Set<PlayHelper> playSession() {
        return new HashSet<>();
    }

    @Resource(name = "playSession")
    public Set<PlayHelper> playRepository;

    public Set<PlayHelper> findAllPlays() {
        return playRepository;
    }

    public PlayHelper findPlayById(Long id) {
        List<PlayHelper> foundPlay = playRepository.stream().filter(p -> p.getPlayId().equals(id)).collect(Collectors.toList());
        return foundPlay.get(0);
    }

    public void createPlay(PlayHelper play) {
        playRepository.add(play);
    }

    public void updatePlay(PlayHelper updatedPlay) {
        findPlayById(updatedPlay.getPlayId()).setGameId(updatedPlay.getGameId());
        findPlayById(updatedPlay.getPlayId()).setGameName(updatedPlay.getGameName());
        findPlayById(updatedPlay.getPlayId()).setTimeRound(updatedPlay.getTimeRound());
        findPlayById(updatedPlay.getPlayId()).setTimeGame(updatedPlay.getTimeGame());
        findPlayById(updatedPlay.getPlayId()).setMinPlayers(updatedPlay.getMinPlayers());
        findPlayById(updatedPlay.getPlayId()).setMaxPlayers(updatedPlay.getMaxPlayers());
        findPlayById(updatedPlay.getPlayId()).setFriends(updatedPlay.getFriends());
        findPlayById(updatedPlay.getPlayId()).setAccepted(updatedPlay.getAccepted());
        findPlayById(updatedPlay.getPlayId()).setPlayersTourA(updatedPlay.getPlayersTourA());
        findPlayById(updatedPlay.getPlayId()).setPlayersTourB(updatedPlay.getPlayersTourB());
        findPlayById(updatedPlay.getPlayId()).setRoundTimePlayers(updatedPlay.getRoundTimePlayers());
        findPlayById(updatedPlay.getPlayId()).setGameTimePlayers(updatedPlay.getGameTimePlayers());
    }

    public void deletePlay(Long id) {
        playRepository.remove(findPlayById(id));
    }

}
