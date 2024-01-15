package com.prof.homework.NewYearTask.task.Game;

import com.github.javafaker.Faker;

import java.util.*;

public class GenerateTeam {
    public static final Faker FAKER = new Faker();

    public static <T extends Participant> Map<String, List<T>> genTeam(int participantsPerTeam, Class<T> participantClass) {
        Map<String, List<T>> mapTeam = new HashMap<>();
        for (int i = 0; i < 25; i++) {
            String teamName = FAKER.team().name();
            List<T> participants = genParticipant(participantClass, participantsPerTeam);
            mapTeam.put(teamName, participants);
        }
        return mapTeam;
    }

    public static <T extends Participant> List<T> genParticipant(Class<?> t, int participant) {
        List<T> list = new ArrayList<>();
        if (t.getName().contains("Adult")) {
            while (participant != 0) {
                list.add((T) new Adult(FAKER.name().name(), (int) (Math.random() * (18 + 1) + 18)));
                participant--;
            }
        } else if (t.getName().contains("Teenager")) {
            while (participant != 0) {
                list.add((T) new Teenager(FAKER.name().name(), (int) (Math.random() * (8 + 1) + 10)));
                participant--;
            }
        } else if (t.getName().contains("Pupil")) {
            while (participant != 0) {
                list.add((T) new Pupil(FAKER.name().name(), (int) (Math.random() * (3 + 1) + 5)));
                participant--;
            }
        }
        return list;
    }

    public static <T> void printTeams(Map<String, List<T>> teams) {
        for (Map.Entry<String, List<T>> e : teams.entrySet()) {
            System.out.println("Team : " + e.getKey());
            printParticipant(e.getValue());
            System.out.println();
        }
    }

    public static <T> void printParticipant(List<T> participants) {
        for (T participant : participants) {
            if (participant instanceof Participant) {
                ((Participant) participant).print();
            }
        }
    }
}

