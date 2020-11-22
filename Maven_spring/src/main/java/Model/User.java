package Model;


import org.springframework.stereotype.Component;

import java.util.List;


@Component(value = "user")
public class User {
    private String username;
    private String password;
    private List<String> book;
    private User friend ;

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public User(User friend) {
        this.friend = friend;
    }

    public List<String> getBook() {
        return book;
    }

    public void setBook(List<String> book) {
        this.book = book;
    }

    public User(){}

    public User(String username, String password, List<String> book) {
        this.username = username;
        this.password = password;
        this.book = book;
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
