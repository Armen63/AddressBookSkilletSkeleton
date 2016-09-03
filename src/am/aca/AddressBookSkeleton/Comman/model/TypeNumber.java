package am.aca.AddressBookSkeleton.Comman.model;

/**
 * Created by Armen on 9/3/2016.
 */
public enum TypeNumber {
    HOME(1),
    PHONE(2),
    FAX(3);
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    TypeNumber(int id) {
        this.id = id;
    }

}