package model;

import model.Player;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name =name;
        this.players = new ArrayList<>();
    }

    public String getname(){
        return name;
    }

    public List<Player>getPlayers(){
        return players;
    }

    public boolean addPlayer (Player player){
        if (players.size()<8){
            return players.add(player);

        }else{
            System.out.println("Team already has 8 players. Cannot add more");
            return false;
        }
    }

    public boolean removePlayer(String fullName){
         return players.removeIf(p->p.getFullName().equalsIgnoreCase(fullName));
    }

    @Override
    public String toString(){
        return "Team " + name + " (" + players.size() + " players)";
    }

    }


