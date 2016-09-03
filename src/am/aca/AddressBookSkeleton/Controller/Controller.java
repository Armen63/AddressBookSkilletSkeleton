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

import static java.lang.System.getProperty;

/**
 * Created by Armen on 9/3/2016.
 */



    public class Controller {
    Statics variable = new Statics();
    UserRepository userRepo = new UserRepositoryImpl();
    static List<User> userList = new ArrayList<>();


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
        File file = new File("User.txt");
        Scanner input = new Scanner(System.in);
        String username,
                password,
                comman;
        System.out.println(variable.writeUsername);
        username = input.nextLine();
        System.out.println(variable.writePassword);
        password = input.nextLine();
        User user = new User(username,password);
        userRepo.addUser(user);

        System.out.println(variable.successfullyCreate);
        comman = input.nextLine();
        if(comman.equals(variable.SignIn))
            signIn();
        else if(comman.equals(variable.SignUp))
            signUp();
        else
            executor();
    }

    public void signIn(){
        boolean result = false;
        int count = 0;
        Scanner input = new Scanner(System.in);
        String username,
                password;
        System.out.println(variable.writeUsername);
        username = input.nextLine();

        System.out.println(variable.writePassword);
        password = input.nextLine();

        User user = new User(username, password);
        for(User otherUser:userList){
            result = true;
            if(otherUser.equals(user)){
                ///////////////////////////////
               // urishUser = otherUser;
                result = true;
                break;
            }
        }
        if(result){
            System.out.println(">>You are successfully logged in\n" +
                    ">>Now you can write down one of this commands 'Add Tel. Numb' or 'Show Tel. Numbers'");
        }
        else if(count < 3){
            System.out.println("Your username or password is incorrect");
            ++count;
            signIn(); //rec
        }
        else
            return;
    }

    public void signOut() {

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

