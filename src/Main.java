import model.Player;
import sevice.TeamService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeamService teamService = new TeamService();
        Scanner scanner = new Scanner(System.in);

        While (true){
            System.out.println("\n=== Football Registration Menu ===");
            System.out.println("1. Create Team");
            System.out.println("2. List Teams");
            System.out.println("3. Delete Team");
            System.out.println("4. Add Player to Team");
            System.out.println("5. List Players in Team");
            System.out.println("6. Remove Player from Team");
            System.out.println("0. Exit");
            System.out.println("choose");


            int  choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 ->{
                    System.out.print("Enter team name: ");
                    String teamName = scanner.nextLine();
                    teamService.createTeam(teamName);
                }
                case 2 ->teamService.listTeams();
                case 3 ->{
                    System.out.print("Enter team name to delete: ");
                    String teamName = scanner.nextLine();
                    teamService.deleteTeam(teamName);
                }

                case 4->{
                    System.out.print("Enter team name");
                    String teamName =scanner.nextLine();
                    System.out.print("Full Name: ");
                    String fullName =scanner.nextLine();
                    System.out.print("Current Level (100L, 200L):");
                    String level =scaner.nextLine();
                    System.out.print("Course of Study: ");
                    String course = scanner.nextLine();
                    System.out.print("Position: ");
                    String position = scanner.nextLine();


                    Player player = new Player(fullName,level, course,position);
                    teamService.addPlayerToTeam(teamName, player);
                }

                case 5->{
                    System.out.print("Enter team name: ");
                    String teamName = scanner.NextLine();
                    teamService.listPlayersInTeam(teamName);
                }
                case 6->{
                    System.out.print("Enter team name: ");
                    String teamName = scanner.nextLine();
                    System.out.print("Enter player name to remove: ");
                    String playerName =scanner.nextLine();
                    teamService.removePlayerFromTeam(teaName, playerName);
                }
                case 0-> {
                    System.out.println("Exiting....");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }
}
