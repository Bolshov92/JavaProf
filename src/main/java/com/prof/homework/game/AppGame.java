package com.prof.homework.game;


import com.prof.homework.game.participant.Adult;
import com.prof.homework.game.participant.Pupil;
import com.prof.homework.game.participant.Teenager;

import java.util.List;
import java.util.Map;

public class AppGame {
    public static void main(String[] args) {
        Handler handler = new Handler();
        Map<String, List<Adult>> adultTeams = GenerateTeam.generateTeam(4, Adult.class);
        Map<String, List<Teenager>> teenagerTeams = GenerateTeam.generateTeam(4, Teenager.class);
        Map<String, List<Pupil>> pupilTeams = GenerateTeam.generateTeam(4, Pupil.class);

        handler.addTeams(adultTeams);
        handler.addTeams(teenagerTeams);
        handler.addTeams(pupilTeams);

        handler.playMatches();
        System.out.println("Team with Highest Score : " + handler.findTeamWithHighestScore());
        System.out.println();
        handler.totalPoints();

        System.out.println(handler.findTeamsWithoutPoints());

        //  System.out.println(handler.averageAgePerTeam());

        //System.out.println(handler.teamsWithScoresAboveAverage());
        handler.printTeamsWithScoresAboveAverage();
        handler.printTeamsByScore();
        System.out.println();
        System.out.println();

        //handler.teamsWithParticipantsInCategory("Pupil");

        System.out.println(handler.teamsWithWinsOver("Pupil"));
        System.out.println();
        // System.out.println(handler.findYoungestParticipant());

        //  System.out.println(handler.findMostExperiencedTeam());
        // System.out.println(handler.teamsWithParticipantsInAgeRange(5,15));
        // System.out.println(handler.participantNamesDescendingByAge());
        //System.out.println(handler.findTeamWithLargestAgeSpread());
        //System.out.println(handler.findTeamsWithEqualSumAges());
        /**
         * where is // problem with age for every one. TODO
         */
    }
}
