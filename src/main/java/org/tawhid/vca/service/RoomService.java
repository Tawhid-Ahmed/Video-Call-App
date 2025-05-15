package org.tawhid.vca.service;


import org.springframework.stereotype.Service;
import org.tawhid.vca.model.Room;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RoomService {
    private final Map<String, Room> rooms = new ConcurrentHashMap<>();

    public Room getOrCreateRoom(String roomId) {
        return rooms.computeIfAbsent(roomId, Room::new);
    }
    public Optional<Room> getRoom(String roomId){
        return Optional.ofNullable(rooms.get(roomId));
    }
    public void removeRoom(String roomId){
        rooms.remove(roomId);
    }
    public void removeParticipant(String roomId,String userId)
    {
        Room room = getOrCreateRoom(roomId);
        room.addParticipant(userId);
    }
    public void removeParticipant(String roomId,UUID userId)
    {
        getRoom(roomId).map(Room::getParticipants)
                .orElse(Collections.emptySet());
    }
}
