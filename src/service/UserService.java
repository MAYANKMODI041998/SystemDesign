package service;

import model.User;
import repository.UserServiceRepository;

public class UserService implements UserServiceInterface{

    UserServiceRepository userServiceRepository;

    public UserService() {
        this.userServiceRepository = new UserServiceRepository();
    }

    @Override
    public void addUser(User user) {
        userServiceRepository.addUser(user);
    }

    @Override
    public User getUser(String userId) {
        return userServiceRepository.getUser(userId);
    }
}
