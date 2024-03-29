package com.example.boardgametimer.data.model;

import java.io.Serializable;
import java.util.Objects;

public class Game implements Serializable {

    private Long id;
    private String name;
    private int timeRound;
    private int timeGame;
    private int minPlayers;
    private int maxPlayers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game that = (Game) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Game(Long id, String name, int timeRound, int timeGame, int minPlayers, int maxPlayers) {
        this.id = id;
        this.name = name;
        this.timeRound = timeRound;
        this.timeGame = timeGame;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }

    public Game(String name, Integer minPlayers, Integer maxPlayers, Integer timeRound, Integer timeGame) {
        this.name = name;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.timeRound = timeRound;
        this.timeGame = timeGame;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeRound() {
        return timeRound;
    }

    public void setTimeRound(int timeRound) {
        this.timeRound = timeRound;
    }

    public int getTimeGame() {
        return timeGame;
    }

    public void setTimeGame(int timeGame) {
        this.timeGame = timeGame;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timeRound=" + timeRound +
                ", timeGame=" + timeGame +
                ", minPlayers=" + minPlayers +
                ", maxPlayers=" + maxPlayers +
                '}';
    }

}
