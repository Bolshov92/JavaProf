package com.prof.homework.NewYearTask.task.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Team<P extends Participant> {
    private String name;
    private List<P> participants = new ArrayList<>(100);

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<P> getParticipants() {
        return participants;
    }

    public void setParticipants(List<P> participants) {
        this.participants = participants;
    }

    public void addNewParticipant(P newParticipant) {
        participants.add(newParticipant);
    }

    public void addParticipant(P participant) {
    }
}