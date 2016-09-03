package am.aca.AddressBookSkeleton.Repo;

import am.aca.AddressBookSkeleton.Comman.Exceptions.MyException;
import am.aca.AddressBookSkeleton.Comman.model.Address;
import am.aca.AddressBookSkeleton.Comman.model.User;

import java.util.Set;

/**
 * Created by Armen on 9/3/2016.
 */
public interface UserRepository {
    User addUser(User user);
    void deleteUser(Integer id) throws MyException;
    Address addAddress(Address address);
    User editUser(User user) throws MyException;
    Set<User> getUserList(String user);

}
