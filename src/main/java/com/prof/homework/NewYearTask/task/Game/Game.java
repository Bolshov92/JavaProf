package com.prof.homework.NewYearTask.task.Game;

import com.github.javafaker.Faker;

import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.prof.homework.NewYearTask.task.Game.GenerateTeam.printTeams;

public class Game {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Handler handler = new Handler();

        Map<String, List<Adult>> adultTeams = GenerateTeam.genTeam(4, Adult.class);
        Map<String, List<Teenager>> teenagerTeams = GenerateTeam.genTeam(4, Teenager.class);
        Map<String, List<Pupil>> pupilTeams = GenerateTeam.genTeam(4, Pupil.class);

        handler.addTeams(adultTeams);
        handler.addTeams(teenagerTeams);
        handler.addTeams(pupilTeams);

        handler.playMatches();

        handler.printTeams();
        handler.printResults();

    }
}