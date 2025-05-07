package org.tawhid.vca.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Room {
    private int id;
    private Set<String> participants = new HashSet<>();

    public Room(int id){
        this.id = id;
    }
    public boolean addParticipant(String userID){
        return participants.add(userID);

    }
    public boolean removeParticipant(String userID){
        return participants.remove(userID);
    }
    public boolean isEmpty(){
        return participants.isEmpty();
    }
}
