package com.company.Zadanie3;

import java.util.ArrayList;

public class Game {
    private String gameName;
    private Player player;
    ArrayList<Player> players = new ArrayList();

    public Game(String name) {
        this.gameName = name;
    }

    public Player addPlayer(Player player) {
        players.add(player);
        for (Player p : players) {
            //    System.out.println(players);
        }
        return null;
    }

    public String displayPlayerList(){
        for (Player person: players){
            System.out.println(person.getName() +" "+person.getUsername() + " "+person.getPoints() );
        }
        return null;
    }


    public String winner() {
        for (int i = 0; i < players.size(); i++) {
            players.get(i);
            if (players.get(i).getPoints() > 100) {
                System.out.println("Zwycięzcą jest " + players.get(i).getName());
            }
            return null;
        }
        return null;
    }
}
