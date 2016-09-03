package am.aca.AddressBookSkeleton.Repo;

import am.aca.AddressBookSkeleton.Comman.Exceptions.CheckedException;
import am.aca.AddressBookSkeleton.Comman.Exceptions.UnCheckedException;
import am.aca.AddressBookSkeleton.Comman.model.Address;
import am.aca.AddressBookSkeleton.Comman.model.User;

/**
 * Created by Armen on 9/3/2016.
 */
public class UserRepositoryImpl implements UserRepository {
    @Override
    public User addUser(User user) {
        return null;
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
}
