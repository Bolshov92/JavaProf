
package com.prof.homework.game;

import com.prof.homework.game.participant.Participant;

public class Game {

    public int playMatch(Team<Participant> teamA, Team<Participant> teamB) {
        double randomResult = Math.random();
        if (randomResult < 0.33) {
            System.out.println("Match between " + teamA.getName() + " and " + teamB.getName() + ": Winner - " + teamA.getName());
            return 1; // Победа teamA
        } else if (randomResult < 0.66) {
            System.out.println("Match between " + teamA.getName() + " and " + teamB.getName() + ": It's a draw!");
            return 0; // Ничья
        } else {
            System.out.println("Match between " + teamA.getName() + " and " + teamB.getName() + ": Winner - " + teamB.getName());
            return -1; // Победа teamB
        }
    }

}


