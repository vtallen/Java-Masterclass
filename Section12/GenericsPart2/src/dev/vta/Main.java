package dev.vta;

public class Main {
    public static void main(String[] args) {
        // Team 1
        FootballPlayer tim = new FootballPlayer("tim");
        FootballPlayer bob = new FootballPlayer("bob");

        Team<FootballPlayer> team1 = new Team<>("Team 1");
        team1.addPlayer(tim);
        team1.addPlayer(bob);

        //Team 2
        FootballPlayer jeff = new FootballPlayer("jeff");
        FootballPlayer timmy = new FootballPlayer("timmy");

        Team<FootballPlayer> team2 = new Team<>("Team 2");
        team2.addPlayer(tim);
        team2.addPlayer(bob);

        League<FootballPlayer> footballPlayerLeague = new League<>("NFL");
        footballPlayerLeague.addTeam(team1);
        footballPlayerLeague.addTeam(team2);

        team2.matchResult(team1, 100, 10);

        footballPlayerLeague.printTeams();
    }
}
