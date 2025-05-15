package org.tawhid.vca.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private String id;
    private Set<String> participants = new HashSet<>();

    public Room(String id){
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
