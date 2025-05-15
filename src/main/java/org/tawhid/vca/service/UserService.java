package org.tawhid.vca.service;

import org.springframework.stereotype.Service;
import org.tawhid.vca.model.User;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public User createUser(String userName){
        String userId = UUID.randomUUID().toString();
        User user = new User(userId,userName);
        users.put(userId,user);
        return user;
    }

    public Optional<User> getUser(String userId){
        return Optional.ofNullable(users.get(userId));
    }
    public void removeUser(String userId){
        users.remove(userId);
    }

}
