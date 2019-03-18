package com.mikaelwall.bstats;

public class Player {

    private String name;
    private int gamesPlayed;
    private int fgMade;
    private int fgAttempted;
    private int blocks;
    private int steals;
    private int assists;

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
