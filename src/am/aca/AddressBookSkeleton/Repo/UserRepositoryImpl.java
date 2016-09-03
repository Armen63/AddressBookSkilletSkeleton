package am.aca.AddressBookSkeleton.Repo;

import am.aca.AddressBookSkeleton.Comman.model.Address;
import am.aca.AddressBookSkeleton.Comman.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

/**
 * Created by Armen on 9/3/2016.
 */
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User addUser(User user) {
        try{

            PrintWriter out = new PrintWriter(new FileWriter("User.txt", true));
            out.print(user.getUserName() + " ");
            out.println(user.getPassword() + " ");
            out.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
        return user;
    }

    @Override
    public void deleteUser(Integer id) throws CheckedException {

    }

    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public User editUser(User user) throws UnCheckedException {
        return null;
    }

    @Override
    public Set<User> getUserList(String user) {
        return null;
    }
}
