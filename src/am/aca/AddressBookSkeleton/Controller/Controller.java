package am.aca.AddressBookSkeleton.Controller;
import am.aca.AddressBookSkeleton.Comman.model.User;
import am.aca.AddressBookSkeleton.Repo.UserRepository;
import am.aca.AddressBookSkeleton.Repo.UserRepositoryImpl;
import am.aca.AddressBookSkeleton.resource.Statics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.getProperty;

/**
 * Created by Armen on 9/3/2016.
 */



    public class Controller {
    Statics variable = new Statics();
    UserRepository userRepo = new UserRepositoryImpl();
    List<User> userList = new ArrayList<>();
    static User signedInUser;


    public void executor() {
        Scanner input = new Scanner(System.in);
        String comman = new String();
        System.out.print(variable.writeSignUporSignIn);
        comman = input.nextLine();
        while(true) {
            switch (comman) {
                case "Sign Up":
                    signUp();
                    break;
                case "Sign In":
                    signIn();
                    break;
                case "Sign Out":
                    signOut();
                    break;
                case "Add Tel":
                    addTelNumber();
                    break;
                case "Show Tel":
                    showTelNumber();
                    break;
                case "Add Friend":
                    addFriend();
                    break;
                case "Del Friend":
                    deleteFriend();
                    break;
                case "Show Friend":
                    showFrendList();
                    break;
                case "Help":
                    System.out.println(variable.help);
                    break;
            }
        }
    }

    void validation() {

    }
   /* Set<User> getFriendList(String userid){
        return ;
    }*/

    public void signUp() {
    }

    public void signIn(){
            return;
    }

    public void signOut() {
        exit(404);
    }

    public void addTelNumber() {

    }

    public void showTelNumber() {

    }

    public void addFriend() {

    }

    public void deleteFriend() {

    }

    public void showFrendList() {

    }

    public void help() {

    }


}

