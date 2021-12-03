package cpit251;

import java.util.ArrayList;
import java.util.Scanner;


public class SaudiGuide {

    public static void main(String[] args) {
        Account A = new Account();
        // Create ArrayList from Account class and name it accounts
        ArrayList<Account> accounts = new ArrayList<>();
        // Users 
        Account user_1 = new Account("Sarah", "Naghi", "Sarh@hotmail.com", "0500000001", "Sarah", "Ss@12345678", 23);
        Account user_2 = new Account("Rawan", "Samer", "Rawan@hotmail.com", "0500000002", "RawanS", "Rr@12345678", 22);
        Account user_3 = new Account("Ragad", "Fahad", "Ragad@hotmail.com", "0500000003", "RagadFt", "Rr@12345678", 22);
        Account user_4 = new Account("Leen", "Saleh", "Leen@hotmail.com", "0500000004", "LeenS", "Ll@12345678", 23);
        // Inserting users into the accounts ArrayList
        accounts.add(user_1);
        accounts.add(user_2);
        accounts.add(user_3);
        accounts.add(user_4);

        //-------------------------------------------Main menu loop------------------------------------------//
        while (true) {
            System.out.println("\n\n---------------------------------");
            System.out.println("Welcome in saudi guide system");
            System.out.println("----------------------------------");
            System.out.println("Choose a number");
            System.out.println("1- Log in");
            System.out.println("2- Register");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 1 or 2 : ");
            String number = input.next();

            //-------------------------------------LogIn---------------------------------//
            if (number.equals("1")) {
                System.out.println("Log in page");
                System.out.print("Enter username: ");
                String username = input.next();
                // Search for the entered username in the ArrayList 
                int usernemeExists = A.SearchByusername(accounts, username);
                while (true) {

                    // Username not found in the ArrayList
                    if (usernemeExists == -1) {
                        System.out.println("This username dose not exists");
                        System.out.print("Please try again: ");
                        username = input.next();
                        usernemeExists = A.SearchByusername(accounts, username);
                        // Username found in the ArrayList    
                    } else {
                        break;
                    }
                }

                System.out.print("Enter password: ");
                String password = input.next();
                while (true) {
                    // According to username, we'll use the index in order to validate the entered password 
                    // and match it with the one in the ArrayList
                    // Password did not match
                    if (!accounts.get(usernemeExists).getPassword().equals(password)) {
                        System.out.println("Sorry! Wrong password, please try again");
                        password = input.next();
                    }
                    // Password matched
                    break;
                }

                // VIEW this page when user Logged In
                System.out.println("\n\n      You’ve logged in successfully! ");
                System.out.println("      ————-to home page————");
                System.out.println("     - To view account information enter(1)");
                System.out.println("     - To view our menu enter(2)");
                System.out.println("     - To choose a city enter(3)");
                System.out.println("     - To Exit (4)");
                System.out.print("     - Enter Your choice: ");
                int choice = input.nextInt();
                // To display user's account information
                if (choice == 1) {
                    accounts.get(usernemeExists).AccountInformation();
                } // To display the menu
                else if (choice == 2) {
                    continue;

                } else if (choice == 3) {
                    DestinationDetails dis = new DestinationDetails();
                    dis.DisplayInf();
                } else if (choice == 4) {
                    System.exit(0);
                }

                //------------------------------------Registeration----------------------------------//
            } else if (number.equals("2")) {

                System.out.println("-------- Registeration page ------- ");

                //**********[   1-Fisrt Name   ]**********// 
                System.out.print("Enter first name: ");
                String fname = input.next();
                // To validate the entered First Name
                Boolean validateName = A.isValidFLname(fname);
                while (true) {
                    // First Name not valid
                    if (validateName == false) {
                        System.out.println("Try again the first name must be letters only!");
                        System.out.print("Pleas enter first name: ");
                        fname = input.next();
                        validateName = A.isValidFLname(fname);
                        // First Name valid
                    } else {
                        break;
                    }
                }

                //**********[   2-Last Name   ]**********//
                System.out.print("Enter last name: ");
                String lname = input.next();
                // To validate the entered Last Name
                validateName = A.isValidFLname(lname);
                while (true) {
                    // Last Name not valid
                    if (validateName == false) {
                        System.out.println("Try again the last name must be letters only!");
                        System.out.print("Pleas enter last name: ");
                        lname = input.next();
                        validateName = A.isValidFLname(lname);
                        // Last Name valid
                    } else {
                        break;
                    }
                }

                //**********[   3-Email   ]**********//
                System.out.print("Enter email: ");
                String Email = input.next();
                // To validate the entered Email
                boolean isValidEmail = A.isValidEmail(accounts, Email);
                while (true) {
                    // Email not valid
                    if (isValidEmail == false) {
                        System.out.println("Try again!");
                        System.out.print("Pleas enter email: ");
                        Email = input.next();
                        isValidEmail = A.isValidEmail(accounts, Email);
                        // Email valid
                    } else {
                        break;
                    }
                }

                //**********[   4-Phone Number   ]**********//
                System.out.print("Enter phone number: ");
                String Phone = input.next();
                // To validate the entered Phone Number
                boolean isValidphonenumber = A.isValidphonenumber(Phone);
                while (true) {
                    // Phone Number not valid
                    if (isValidphonenumber == false) {
                        System.out.println("Try again! *phone number must be 10 digits and start withe 055 054 050 056 053 059");
                        System.out.print("Pleas enter phone number: ");
                        Phone = input.next();
                        isValidphonenumber = A.isValidphonenumber(Phone);
                        // Phone Number valid        
                    } else {
                        break;
                    }
                }

                //**********[   5-Username   ]**********//
                System.out.print("Enter username : ");
                String username = input.next();
                // To validate the entered Username
                boolean isValidUsername = A.isValidUsername(accounts, username);
                while (true) {
                    // Username not valid    
                    if (isValidUsername == false) {
                        System.out.print("Pleas enter username: ");
                        username = input.next();
                        isValidUsername = A.isValidUsername(accounts, username);
                        // Username not valid          
                    } else {
                        break;
                    }
                }

                //**********[   6-Password   ]**********//
                System.out.print("Enter password : ");
                String password = input.next();
                // To validate the entered Password
                boolean isValidPassword = A.isValidPassword(password);
                while (true) {
                    // Password not valid
                    if (isValidPassword == false) {
                        System.out.print("Please enter password: ");
                        password = input.next();
                        isValidPassword = A.isValidPassword(password);
                        // Password not valid
                    } else {
                        break;
                    }
                }

                //**********[   7-Age   ]**********//
                System.out.print("Enter age : ");
                int age = input.nextInt();

                ////////////////////////////////////////////////////////////////////////////////////////////////
                // Create user's account
                Account user = new Account(fname, lname, Email, Phone, username, password, age);
                // Inserting users into the accounts ArrayList
                accounts.add(user);
                // View menu
                System.out.println("");
                System.out.println("");
                System.out.println("-----------------------------------------------------");
                System.out.println("      Account has been successfully created!");
                System.out.println("      *—––––——<< Welcome to Saudi Guide >>—––––——*");
                System.out.println("      - To view account information enter(1)");
                System.out.println("      - To view our menu enter(2)");
                System.out.println("      - To choose city enter(3)");
                System.out.println("-----------------------------------------------------");
                System.out.println("");
                System.out.println("");
                int choice = input.nextInt();

                // To display account information
                if (choice == 1) {
                    user.AccountInformation();
                } else if (choice == 2) {
                    continue;
                } else if (choice == 3) {
                    DestinationDetails dis = new DestinationDetails();
                    dis.DisplayInf();
                }

                System.out.println("      - To home page enter(1)");
                System.out.println("      - To Exit enter(3)");
                System.out.print("--->");
                choice = input.nextInt();

                if (choice == 1) {
                    continue;
                } // To display exit page and terminate the system
                else if (choice == 3) {
                    System.out.println("**************!!! Thank you for using Saudi Guide !!!**************");
                }
                System.out.println("           We hope you found the perfect spot you wanted <3 ");
                System.out.println("                                SEE YA");
                System.exit(0);

                //-----------------------------------------------Wrong Choice------------------------------------------// 
            } else {
                System.out.print("wrong input, please enter 1 or 2: ");
                number = input.next();
            }

        }

    }
}
