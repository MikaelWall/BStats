package com.mikaelwall.bstats;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Player implements Serializable {

    private String name;
    private int gamesPlayed = 3;
    private int fgMade = 3;
    private int fgAttempted = 6;
    private int fgRatio = 100 * (fgMade/fgAttempted);
    private int blocks = 10;
    private int steals = 2;
    private int assists = 6;

    public Player(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void addGamesPlayed() {
        this.gamesPlayed++;
    }

    public int getFgMade() {
        return fgMade;
    }

    public void addFgMade() {
        this.fgMade++;
    }

    public int getFgAttempted() {
        return fgAttempted;
    }

    public void addFgAttempted() {
        this.fgAttempted++;
    }

    public int getFgRatio() {
        return fgRatio;
    }

    public void setFgRatio(int fgRatio) {
        this.fgRatio = fgRatio;
    }

    public int getBlocks() {
        return blocks;
    }

    public void addBlocks() {
        this.blocks++;
    }

    public int getSteals() {
        return steals;
    }

    public void addSteals() {
        this.steals++;
    }

    public int getAssists() {
        return assists;
    }

    public void addAssists() {
        this.assists++;
    }

    //Skapa en toString array för att visa i en lista?
}
