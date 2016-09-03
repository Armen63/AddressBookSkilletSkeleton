package am.aca.AddressBookSkeleton.Comman.model;

import java.lang.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Armen on 9/3/2016.
 */
public class User {
    String userName = new String();
    String password = new String();
    static int id;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    List<Number> phoneNumber = new ArrayList<>();
    private Set<User> friends = new HashSet<>();

    public User(){}
    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob)
            return true;
        if (ob == null || getClass() != ob.getClass())
            return false;
        User user = (User) ob;
        return userName != null ? userName.equals(user.userName) : user.userName == null
                && (password != null ? password.equals(user.password) : user.password == null);
    }
}
