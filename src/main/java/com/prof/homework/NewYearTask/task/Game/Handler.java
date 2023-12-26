package com.prof.homework.NewYearTask.task.Game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handler {
    private Map<String, List<? extends Participant>> teams;
    private Map<String, Integer> results;

    public Handler() {
        this.teams = new HashMap<>();
        this.results = new HashMap<>();
    }

    public void addTeam(String teamName, List<? extends Participant> participants) {
        teams.put(teamName, participants);
    }

    public void addResult(String teamName, int score) {
        results.put(teamName, score);
    }

    public void printTeams() {
        System.out.println("Teams : ");
        for (Map.Entry<String, List<? extends Participant>> entry : teams.entrySet()) {
            System.out.println("Team :  " + entry.getKey());
            printParticipants(entry.getValue());
            System.out.println();
        }
    }

    public void printResults() {
        System.out.println("Results : ");
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            System.out.println("Team : " + entry.getKey() + ", Score : " + entry.getValue());
        }
    }

    private void printParticipants(List<? extends Participant> participants) {
        for (Participant participant : participants) {
            participant.print();
        }
    }

}
