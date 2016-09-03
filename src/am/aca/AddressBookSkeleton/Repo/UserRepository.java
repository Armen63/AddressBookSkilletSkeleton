package am.aca.AddressBookSkeleton.Repo;

import am.aca.AddressBookSkeleton.Comman.Exceptions.UnCheckedException;
import am.aca.AddressBookSkeleton.Comman.model.Address;
import am.aca.AddressBookSkeleton.Comman.model.User;
import am.aca.AddressBookSkeleton.Comman.Exceptions.CheckedException;

/**
 * Created by Armen on 9/3/2016.
 */
public interface UserRepository {
    User addUser(User user);
    void deleteUser(Integer id) throws CheckedException;
    Address addAddress(Address address);
    User editUser(User user) throws UnCheckedException;

}
