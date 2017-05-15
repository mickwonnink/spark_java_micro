package service;

import domain.User;
import mock.UserDAO;

import javax.ejb.Stateless;
import java.util.List;

/**
 * Created by Mick on 15-5-2017.
 */
public class UserService {


    private UserDAO userDAO = new UserDAO();

    // returns a list of all users
    public List<User> getAllUsers() { return userDAO.getUsers(); }
    // returns a single user by id
    public User getUser(String username) {
        return userDAO.getUser(username); }
    // creates a new user
    public User createUser(String name, String pass) { return userDAO.createUser(new User(name, pass)); }
    // updates an existing user
    public User updateUser(User user) { return userDAO.updateUser(user); }
}
