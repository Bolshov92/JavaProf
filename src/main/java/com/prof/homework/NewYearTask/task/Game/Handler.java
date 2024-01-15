package com.prof.homework.NewYearTask.task.Game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;


public class Handler {
    private Map<String, List<? extends Participant>> teams;
    private Map<String, Integer> results;

    public Handler() {
        this.teams = new HashMap<>();
        this.results = new HashMap<>();
    }

    public void addTeams(Map<String, ? extends List<? extends Participant>> teamsToAdd) {
        teams.putAll(teamsToAdd);
    }

    public void addResult(String teamName, int score) {
        results.put(teamName, score);
    }

    public void playMatches() {
        for (Map.Entry<String, List<? extends Participant>> teamEntry : teams.entrySet()) {
            String teamName = teamEntry.getKey();
            List<? extends Participant> currentTeam = teamEntry.getValue();

            for (Map.Entry<String, List<? extends Participant>> opponentEntry : teams.entrySet()) {
                String opponentName = opponentEntry.getKey();
                List<? extends Participant> opponentTeam = opponentEntry.getValue();

                if (!teamName.equals(opponentName)) {
                    int matchResult = playMatch(currentTeam, opponentTeam, teamName, opponentName);

                    // Обновляем результаты для текущей команды
                    int currentScore = results.getOrDefault(teamName, 0);
                    results.put(teamName, currentScore + matchResult);

                    // Обновляем результаты для команды соперника
                    int opponentScore = results.getOrDefault(opponentName, 0);
                    results.put(opponentName, opponentScore - matchResult);
                }
            }
        }

        // Сортируем результаты
        List<Map.Entry<String, Integer>> sortedResults = new ArrayList<>(results.entrySet());
        sortedResults.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        // Выводим команду с максимальными баллами
        Map.Entry<String, Integer> maxEntry = sortedResults.get(0);
        String teamWithMaxScore = maxEntry.getKey();
        int maxScore = maxEntry.getValue();

        System.out.println("Team with the highest score: " + teamWithMaxScore + ", Score: " + maxScore);

        // Проверяем первую тройку
        Set<String> topThreeTeams = new HashSet<>();
        for (int i = 0; i < 3 && i < sortedResults.size(); i++) {
            topThreeTeams.add(sortedResults.get(i).getKey());
        }

        // Если первые три команды имеют одинаковые баллы, играем между собой
        if (topThreeTeams.size() == 3) {
            int firstThreeScore = sortedResults.get(0).getValue();
            for (int i = 3; i < sortedResults.size(); i++) {
                int currentScore = sortedResults.get(i).getValue();
                if (currentScore == firstThreeScore) {
                    topThreeTeams.add(sortedResults.get(i).getKey());
                } else {
                    break;
                }
            }
        }

        // Проводим матчи между тремя лучшими командами
        for (String teamNameA : topThreeTeams) {
            for (String teamNameB : topThreeTeams) {
                if (!teamNameA.equals(teamNameB)) {
                    List<? extends Participant> teamA = teams.get(teamNameA);
                    List<? extends Participant> teamB = teams.get(teamNameB);
                    playMatch(teamA, teamB, teamNameA, teamNameB);
                }
            }
        }
    }

    private int playMatch(List<? extends Participant> teamA, List<? extends Participant> teamB, String teamNameA, String teamNameB) {
        double randomResult = Math.random();
        if (randomResult < 0.33) {
            System.out.println("Match between " + teamNameA + " and " + teamNameB + ": Winner - " + teamNameA);
            return 1;
        } else if (randomResult < 0.66) {
            System.out.println("Match between " + teamNameA + " and " + teamNameB + ": It's a draw!");
            return 0;
        } else {
            System.out.println("Match between " + teamNameA + " and " + teamNameB + ": Winner - " + teamNameB);
            return -1;
        }
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

