package com.company.Zadanie3;

public class Player {
    private String name, username;
    private int points;

    public Player (String name, String username){
        this.name = name;
        this.username = username;
        this.points = points;
    }

    public String fullName(){
        return this.name;
    }


    public String getName() {
        return name;
    }


    public String getUsername() {
        return username;
    }


    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
