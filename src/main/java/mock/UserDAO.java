package mock;

import domain.User;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mick on 15-5-2017.
 */
public class UserDAO {

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private List<User> users = new ArrayList<User>();

    public UserDAO(){
        this.users.add(new User("henk", "harry"));
        this.users.add(new User("karel", "harry"));
        this.users.add(new User("mark", "harry"));
        this.users.add(new User("kees", "harry"));
        this.users.add(new User("jasper", "harry"));
        this.users.add(new User("hein", "harry"));
    }

    public User createUser(User user){
        this.users.add(user);
        return user;
    }

    public void deleteUser(User user){
        this.users.remove(user);
    }

    public User updateUser(User user){
        int userIndex = 0;
        for (User u : users){
            if (u.getUsername().equals(user.getUsername())){
                userIndex = users.indexOf(u);
            }
        }
        this.users.set(userIndex, user);
        return this.users.get(userIndex);
    }

    public User getUser(String username){
        for (User u : users){
            if (u.getUsername().equalsIgnoreCase(username)){
                return u;
            }
        }
        return null;
    }


}
