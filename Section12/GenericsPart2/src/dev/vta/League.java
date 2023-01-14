package dev.vta;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player> {
    private ArrayList<Team<T>> teams = new ArrayList<Team<T>>();
    private String name;

    public League(String name) {
        this.name = name;
    }

    public void addTeam(Team<T> team) {
        if (teams.contains(team)) {
            System.out.println("This team is already in the league");
            return;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " has joined the league");
            Collections.sort(teams);
        }
    }

    public void printTeams() {
        Collections.sort(teams);
        int index = 1;
        for (Team t : teams) {
            System.out.printf("%d - %s\n", index, t.getName());
            index++;
        }
    }
}
