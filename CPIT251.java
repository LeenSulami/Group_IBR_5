/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit251;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPIT251 {

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        Account user1_ = new Account("Sarah", "Naghi", "Sarh@hotmail.com", "0569211631", "Sarah", "Ss@12345678", 19);
        Account user2_ = new Account("Rawan", "Samer", "Rawan@hotmail.com", "0569211631", "RawanS", "Rr@12345678", 19);
        Account user3_ = new Account("Ragad", "Fahad", "Ragad@hotmail.com", "0569211631", "RagadFt", "Rr@12345678", 19);
        Account user4_ = new Account("Leen", "Saleh", "Leen@hotmail.com", "0569211631", "LeenS", "Ll@12345678", 19);
        accounts.add(user1_);
        accounts.add(user2_);
        accounts.add(user3_);
        accounts.add(user4_);

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Welcome in saudi guide system");
            System.out.println("----------------------------------");
            System.out.println("Choose a number");
            System.out.println("1- Log in");
            System.out.println("2- Register");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 1 or 2 : ");
            int number = input.nextInt();

            if (number == 1) {
                System.out.println("Log in page");
                System.out.print("Enter username: ");
                String username = input.next();
                int usernemeExists = SearchByusername(accounts, username);

                while (true) {

                    if (usernemeExists == -1) {
                        System.out.println("This username dose not exists");
                        System.out.print("Please try again: ");
                        username = input.next();
                        usernemeExists = SearchByusername(accounts, username);
                    } else {
                        break;
                    }
                }

                System.out.print("Enter password: ");
                String password = input.next();
                while (true) {
                    if (!accounts.get(usernemeExists).getPassword().equals(password)) {
                        System.out.println("Sorry! Wrong password, please try again");
                        password = input.next();
                    }
                    break;
                }

                System.out.println("      You’ve logged in successfully! ");
                System.out.println("      ————-to home page————");
                System.out.println("     - To view account information enter(1)");
                System.out.println("     - To view our menu enter(2)");
                System.out.println("     - To Exit (3)");

                System.out.println("");
                System.out.println("");
                int numberCh = input.nextInt();
                if (numberCh == 1) {
                    accounts.get(usernemeExists).AccountInformation();
                }
                else if(numberCh == 2) continue;
                else if(numberCh == 3) System.exit(0);

            } else if (number == 2) {

                System.out.println("-------- Registeration page ------- ");

                // 1-Fisrt name 
                System.out.print("Enter first name: ");
                String fname = input.next();
                Boolean ch = isValidFLname(fname);
                while (true) {
                    if (ch == false) {
                        System.out.println("Try again the first name must be letters only!");
                        System.out.print("Pleas enter first name: ");
                        fname = input.next();
                        ch = isValidFLname(fname);
                    } else {
                        break;
                    }
                }
                // 2-Fisrt name
                System.out.print("Enter last name: ");
                String lname = input.next();
                ch = isValidFLname(lname);
                while (true) {
                    if (ch == false) {
                        System.out.println("Try again the last name must be letters only!");
                        System.out.print("Pleas enter last name: ");
                        lname = input.next();
                        ch = isValidFLname(lname);
                    } else {
                        break;
                    }
                }

                // 3-Email
                System.out.print("Enter email: ");
                String Email = input.next();
                boolean isValidEmail = isValidEmail(accounts, Email);
                while (true) {
                    if (isValidEmail == false) {
                        System.out.println("Try again!");
                        System.out.print("Pleas enter email: ");
                        Email = input.next();
                        isValidEmail = isValidEmail(accounts, Email);
                    } else {
                        break;
                    }
                }

                // 4-Phone Number
                System.out.print("Enter phone number: ");
                String Phone = input.next();
                boolean isValidphonenumber = isValidphonenumber(Phone);
                while (true) {
                    if (isValidphonenumber == false) {
                        System.out.println("Try again! *phone number must be 10 digits and start withe 055 054 050 056 053 059");
                        System.out.print("Pleas enter phone number: ");
                        Phone = input.next();
                        isValidphonenumber = isValidphonenumber(Phone);
                    } else {
                        break;
                    }
                }

                //5- username
                System.out.print("Enter username : ");
                String username = input.next();
                boolean isValidUsername = isValidUsername(accounts, username);
                while (true) {
                    if (isValidUsername == false) {
                        System.out.print("Pleas enter username: ");
                        username = input.next();
                        isValidUsername = isValidUsername(accounts, username);
                    } else {
                        break;
                    }
                }

                //6- password
                System.out.print("Enter password : ");
                String password = input.next();
                boolean isValidPassword = isValidPassword(password);
                while (true) {
                    if (isValidPassword == false) {
                        System.out.print("Pleas enter password: ");
                        password = input.next();
                        isValidPassword = isValidPassword(password);
                    } else {
                        break;
                    }
                }

                //7- age
                System.out.print("Enter age : ");
                int age = input.nextInt();
                boolean isValidAge = isValidAge(age);

                // --------------------------------------------------------------------
                Account user = new Account(fname, lname, Email, Phone, username, password, age);
                accounts.add(user);
                System.out.println("");
                System.out.println("");
                System.out.println("-----------------------------------------------------");
                System.out.println("      Account has been successfully created!");
                System.out.println("      ———<Welcome to Saudi Guide>———");
                System.out.println("      - To view account information enter(1)");
                System.out.println("      - To view our menu enter(2)");
                System.out.println("-----------------------------------------------------");
                System.out.println("");
                System.out.println("");
                int numberCh = input.nextInt();
                if (numberCh == 1) {
                    user.AccountInformation();
                }
                System.out.println("Go to home page enter(1)");
                System.out.println("to Exit enter(2)");
                System.out.print("--->");
                numberCh = input.nextInt();
                if (numberCh == 1) continue;
                else if(numberCh ==2) System.exit(0);

            } else {
                System.out.print("wrong input, please enter 1 or 2: ");
                number = input.nextInt();
            }

        }
    }

    // Method 1- Check First and last name
    public static boolean isValidFLname(String str) {
        return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
    }
    // Method 2- Check Email

    public static boolean isValidEmail(ArrayList<Account> A, String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);

        boolean SearchByEmail = SearchByEmail(A, email);
        if (SearchByEmail) {
            System.out.println("Sorry, an account with this email already exists");

            return false;
        }

        return m.matches();
    }

    // Method 3- Check phone number
    public static boolean isValidphonenumber(String isValidphonenumber) {
        Pattern p = Pattern.compile("(05)?[0,5,3,9,4,6][0-9]{7}");
        java.util.regex.Matcher m = p.matcher(isValidphonenumber);
        return m.matches();
    }

    // Method 4- Check username
    public static boolean isValidUsername(ArrayList<Account> A, String name) {

        // check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);

        if (name == null) {
            return false;
        }
        // to find matching between given username and regular expression.
        Matcher m = p.matcher(name);

        int SearchByusername = SearchByusername(A, name);
        if (SearchByusername != -1) {
            System.out.println("Sorry this username already exists");
            System.out.println("You can try one of these examples ");
            System.out.println("1-" + name + "34er678");
            System.out.println("2-" + name + "987w23");
            System.out.println("3-" + name + "12dgs5");

            return false;
        }

        // Return if the username
        // matched the ReGex
        return m.matches();
    }

    // Method 5- password
    public static boolean isValidPassword(String password) {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 8) {
            System.out.println("Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            System.out.println("Password must have atleast one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            System.out.println("Password must have atleast one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers)) {
            System.out.println("Password must have atleast one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars)) {
            System.out.println("Password must have atleast one special character among @#$%");
            isValid = false;
        }
        return isValid;
    }

    // Method 6- check age
    public static boolean isValidAge(int age) {
        boolean valid = true;
        if (age >= 12) {
            valid = true;
        } else {
            System.out.println("Sorry, You are below the age limit, this website is suitable for 12+");

            valid = false;
        }
        return valid;
    }

// method 7- Search in array list 
    public static int SearchByusername(ArrayList<Account> A, String username) {
        int exists = -1;
        int searchListLength = A.size();
        for (int i = 0; i < searchListLength; i++) {
            if (A.get(i).getUsername().equalsIgnoreCase(username)) {
                exists = i;
            } else {
                exists = -1;
            }
        }
        return exists;
    }

// method 8- Search in array list 
    public static boolean SearchByEmail(ArrayList<Account> A, String Email) {
        boolean exists = true;
        int searchListLength = A.size();
        for (int i = 0; i < searchListLength; i++) {
            if (A.get(i).getEmail().equalsIgnoreCase(Email)) {
                exists = true;
            } else {
                exists = false;
            }
        }
        return exists;
    }

}
