package com.prof.homework.game;

import com.github.javafaker.Faker;
import com.prof.homework.game.participant.Adult;
import com.prof.homework.game.participant.Participant;
import com.prof.homework.game.participant.Pupil;
import com.prof.homework.game.participant.Teenager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenerateTeam {
    private static final Faker FAKER = new Faker();

    public static <T extends Participant> Map<String, List<T>> generateTeam(int participantsPerTeam, Class<T> participantClass) {
        Map<String, List<T>> teamMap = new HashMap<>();
        for (int i = 0; i < 25; i++) {
            String teamName = FAKER.team().name();
            List<T> participants = generateParticipants(participantClass, participantsPerTeam);
            teamMap.put(teamName, participants);
        }
        return teamMap;
    }

    private static <T extends Participant> List<T> generateParticipants(Class<T> participantClass, int count) {
        List<T> participants = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            T participant = createParticipant(participantClass);
            participants.add(participant);
        }
        return participants;
    }

    private static <T extends Participant> T createParticipant(Class<T> participantClass) {
        String name = FAKER.name().name();
        int age = 0;
        String category = "";
        if (participantClass.equals(Adult.class)) {
            age = (int) (Math.random() * (60 - 18 + 1)) + 18; // Взрослые от 18 до 60 лет
            category = "Adult";
        } else if (participantClass.equals(Teenager.class)) {
            age = (int) (Math.random() * (17 - 13 + 1)) + 13; // Подростки от 13 до 17 лет
            category = "Teenager";
        } else if (participantClass.equals(Pupil.class)) {
            age = (int) (Math.random() * (12 - 6 + 1)) + 6; // Ученики от 6 до 12 лет
            category = "Pupil";
        }
        return instantiateParticipant(participantClass, name, age, category);
    }

    private static <T extends Participant> T instantiateParticipant(Class<T> participantClass, String name, int age, String category) {
        try {
            return participantClass.getDeclaredConstructor(String.class, int.class).newInstance(name, age);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static <T> void printTeams(Map<String, List<T>> teams) {
        for (Map.Entry<String, List<T>> entry : teams.entrySet()) {
            System.out.println("Team: " + entry.getKey());
            printParticipants(entry.getValue());
            System.out.println();
        }
    }

    private static <T> void printParticipants(List<T> participants) {
        for (T participant : participants) {
            System.out.println(participant.toString());
        }
    }
}