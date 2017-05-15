package domain;

import java.util.List;

/**
 * Created by Mick on 15-5-2017.
 */
public class User {

    List<BlogItem> postedMessages;

    List<User> subscribers;
    List<User> subscribedTo;

    private String username;
    private String password;

    public User(){}

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public List<BlogItem> getPostedMessages() {
        return postedMessages;
    }

    public void setPostedMessages(List<BlogItem> postedMessages) {
        this.postedMessages = postedMessages;
    }

    public List<User> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<User> subscribers) {
        this.subscribers = subscribers;
    }

    public List<User> getSubscribedTo() {
        return subscribedTo;
    }

    public void setSubscribedTo(List<User> subscribedTo) {
        this.subscribedTo = subscribedTo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
