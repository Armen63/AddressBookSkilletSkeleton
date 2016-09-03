package am.aca.AddressBookSkeleton.Comman.model;

/**
 * Created by Armen on 9/3/2016.
 */
public class Number {
    private String phoneNumber;
    private TypeNumber number;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    Number(String number){
        this.phoneNumber = number;
    }
}
