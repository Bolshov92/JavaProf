package com.prof.homework.game;

import com.prof.homework.game.Exception.ErrorMessage;
import com.prof.homework.game.Exception.NoResultException;
import com.prof.homework.game.participant.Participant;

import java.util.*;
import java.util.stream.Collectors;

public class Handler {
    private Map<String, Integer> results;
    private Map<String, List<? extends Participant>> teams;
    private Game game;

    public Handler() {
        this.teams = new HashMap<>();
        this.results = new HashMap<>();
        this.game = new Game();
    }

    public void addTeams(Map<String, ? extends List<? extends Participant>> teamsToAdd) {
        teams.putAll(teamsToAdd);
    }

    private void updateResults(String teamName, int result) {
        double points = 0;
        if (result == 1) {
            points = 1;
        } else if (result == 0) {
            points = 0.5;
        }
        results.put(teamName, results.getOrDefault(teamName, 0) + (int) points);
    }

    public void playMatches() {
        // Проводим матчи между всеми командами:
        for (String teamAName : teams.keySet()) {
            for (String teamBName : teams.keySet()) {
                if (!teamAName.equals(teamBName)) {
                    int result = game.playMatch(new Team<>(teamAName), new Team<>(teamBName));
                    updateResults(teamAName, result);
                    updateResults(teamBName, -result);
                }
            }
        }
    }

    // Найти команду с максимальными баллами:
    public String findTeamWithHighestScore() throws NoResultException {
        if (results.isEmpty()) {
            throw new NoResultException(ErrorMessage.NO_RESULT_EXCEPTION);
        }
        return results.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new NoResultException(ErrorMessage.NO_RESULT_EXCEPTION));
    }

    // Подсчет общего количества баллов:
    public void totalPoints() throws NoResultException {
        if (results.isEmpty()) {
            throw new NoResultException(ErrorMessage.NO_RESULT_EXCEPTION);
        }
        System.out.println("Total Points by Team : ");
        results.forEach((team, points) -> System.out.println(team + ": " + points));
    }

    //Список команд без баллов:
    public List<String> findTeamsWithoutPoints() throws NoResultException {
        if (results.isEmpty()) {
            throw new NoResultException(ErrorMessage.NO_RESULT_EXCEPTION);
        }

        return results.entrySet().stream()
                .filter(entry -> entry.getValue() == 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    //Средний возраст участников в каждой команде:
//    public Map<String, Double> averageAgePerTeam() throws NoResultException {
//        return teams.entrySet().stream()
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        entry -> {
//                            List<? extends Participant> participants = entry.getValue();
//                            if (participants.isEmpty() || participants.stream().allMatch(participant -> participant.getAge() == 0)) {
//                                throw new NoResultException(ErrorMessage.IMPOSIBLE_CALCULATE_AVERAGE_AGE);
//                            }
//                            return participants.stream()
//                                    .mapToDouble(Participant::getAge)
//                                    .average()
//                                    .orElse(0.0); // Возвращаем 0.0 в случае пустого списка или возраста всех участников равного 0
//                        }
//                ));
//    }

    //Команды с баллами выше среднего:
    public List<String> teamsWithScoresAboveAverage() {
        double averageScore = results.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        List<String> teamsAboveAverage = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() > averageScore) {
                teamsAboveAverage.add(entry.getKey() + ": " + entry.getValue() + " points");
            }
        }
        return teamsAboveAverage;
    }
    public void printTeamsWithScoresAboveAverage() {
        List<String> teams = teamsWithScoresAboveAverage();
        for (String teamInfo :teams) {
            System.out.println( "Teams with above average scores : " + teamInfo);
        }
    }


    //Сортировка команд по баллам:
    public List<String> sortTeamsByScore() {
        return results.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .map(entry -> entry.getKey() + " - " + entry.getValue() + " point")
                .collect(Collectors.toList());
    }
    public void printTeamsByScore() {
        List<String> sortedTeams = sortTeamsByScore();
        for (String teamInfo : sortedTeams) {
            System.out.println("Sorted for point : " + teamInfo);
        }
    }

    //Команды с определенной категорией участников: Вывести команды, где все участники принадлежат к одной категории
    public List<String> teamsWithParticipantsInCategory(String category) {
        return teams.entrySet().stream()
                .filter(entry -> entry.getValue().stream()
                        .allMatch(participant -> participant.getParticipantCategory().equals(category)))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    //Команды с победами над определенной командой: Определить команды, которые выиграли у заданной команды.
    public List<String> teamsWithWinsOver(String opponentTeam) {
        return results.entrySet().stream()
                .filter(entry -> entry.getValue() > 0 && game.playMatch(new Team<>(entry.getKey()), new Team<>(opponentTeam)) == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Самый молодой участник среди всех команд:
    public Participant findYoungestParticipant() {
        return teams.values().stream()
                .flatMap(List::stream)
                .min(Comparator.comparingInt(Participant::getAge))
                .orElse(null);
    }

    // Самая опытная команда: Определить команду с наибольшим суммарным возрастом участников.
    public String findMostExperiencedTeam() {
        return teams.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream()
                                .mapToInt(Participant::getAge)
                                .sum()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    // Команды с участниками в определенном возрастном диапазоне:
    public List<String> teamsWithParticipantsInAgeRange(int minAge, int maxAge) {
        return teams.entrySet().stream()
                .filter(entry -> entry.getValue().stream()
                        .anyMatch(participant -> participant.getAge() >= minAge && participant.getAge() <= maxAge))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // Имена участников по убыванию возраста:
    public List<String> participantNamesDescendingByAge() {
        return teams.values().stream()
                .flatMap(List::stream)
                .sorted(Comparator.comparingInt(Participant::getAge).reversed())
                .map(Participant::getName)
                .collect(Collectors.toList());
    }

    // Найти команду с наибольшим разбросом возрастов участников.
    public String findTeamWithLargestAgeSpread() {
        return teams.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> {
                            List<Integer> ages = entry.getValue().stream()
                                    .map(Participant::getAge)
                                    .collect(Collectors.toList());
                            return Collections.max(ages) - Collections.min(ages);
                        }
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    // Найти все пары команд, чьи участники имеют одинаковый суммарный возраст.
    public List<List<String>> findTeamsWithEqualSumAges() {
        List<List<String>> teamPairs = new ArrayList<>();

        for (Map.Entry<String, List<? extends Participant>> teamEntry1 : teams.entrySet()) {
            for (Map.Entry<String, List<? extends Participant>> teamEntry2 : teams.entrySet()) {
                if (!teamEntry1.getKey().equals(teamEntry2.getKey())) {
                    int sumAge1 = teamEntry1.getValue().stream().mapToInt(Participant::getAge).sum();
                    int sumAge2 = teamEntry2.getValue().stream().mapToInt(Participant::getAge).sum();
                    if (sumAge1 == sumAge2) {
                        List<String> pair = new ArrayList<>();
                        pair.add(teamEntry1.getKey());
                        pair.add(teamEntry2.getKey());
                        teamPairs.add(pair);
                    }
                }
            }
        }
        return teamPairs;
    }
}