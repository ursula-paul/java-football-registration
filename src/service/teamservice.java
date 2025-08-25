package service;

import model.Team;
import model.Player;
import java.text.MessageFormat;
import java.util.*;

public class TeamService {
    private Map<String, Team> teams = new HashMap<>();

    //Create Team
    public void createTeam(String name){
        if (teams.containsKey(name)){
            System.out.println("Team  with this name already exists.");

        }else{
            teams.put(name,new Team(name));

            System.out.println(MessageFormat.format("Team {0} created ", name));
        }

    }

    //List Teams
    public void listTeams(){
        if (teams.isEmpty()){
            System.out.println("No teams registered");
        }else{
            teams.values().forEach(System.out::println);
        }
    }

    // Delete Team
    public void deleteTeam(String name){
        if(teams.remove(name) !=null){
            System.out.println(" Team  " + name + " deleted.");

        }else{
            System.out.println("Team not found. ");
        }
    }
    // Add Player to Team

   public void addPlayerToTeam(String teamName, Player player){
        Team team =teams.get(teamName);
        if (team != null){
            team.addPlayer(player);
        }else{
            System.out.println("Team not found");
        }
    }

    // Remove player from Team

    public void removePlayerFromTeam(String teamName, String playerName){
        Team team = teams.get(teamName);
        if (team !=null){
            if (team.removePlayer(playerName)){
                System.out.println("Player removed from " + teamName);
            }else{
                System.out.println("Player not found in " + teamName);
            }
        }else{
            System.out.print("Team not found. ");
        }
    }

    // List Players in a Team

    public void listPLayersInTeam(String teamName){
        Team team = teams.get(teamName);
        if (team != null){
            if(team.getPlayers().isEmpty()){
                System.out.println("No players in team " + teamName);
            }else{
                team.getPlayers().forEach(System.out:: println);
            }
        }else{
            System.out.println("Team not found");
        }
    }


}
