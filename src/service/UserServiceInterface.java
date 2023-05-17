package service;

import model.User;

public interface UserServiceInterface {
    void addUser(User user);
    User getUser(String userId);
}
