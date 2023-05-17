package repository;

import model.User;

import java.util.HashMap;

public class UserServiceRepository {

    HashMap<String,User> userMap;

    public UserServiceRepository() {
        this.userMap = new HashMap<>();
    }

    public void addUser(User user) {
        userMap.put(user.getId(), user);
    }


    public User getUser(String userId) {
       return userMap.get(userId);
    }
}
