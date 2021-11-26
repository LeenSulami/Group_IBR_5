
package cpit251;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPIT251 {

    public static void main(String[] args) {

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
            System.out.println("---------------------------------");
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
                int usernemeExists = SearchByusername(accounts, username);
                while (true) {

                    // Username not found in the ArrayList
                    if (usernemeExists == -1) {
                        System.out.println("This username dose not exists");
                        System.out.print("Please try again: ");
                        username = input.next();
                        usernemeExists = SearchByusername(accounts, username);
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
                System.out.println("      You’ve logged in successfully! ");
                System.out.println("      ————-to home page————");
                System.out.println("     - To view account information enter(1)");
                System.out.println("     - To view our menu enter(2)");
                System.out.println("     - To Exit (3)");
                System.out.println("");
                System.out.println("");
                int choice = input.nextInt();
                // To display user's account information
                if (choice == 1) {
                    accounts.get(usernemeExists).AccountInformation();
                }
                // To display the menu
                else if(choice == 2) continue;
                // To display exit page and terminate the system
                else if(choice == 3) System.exit(0);

                //------------------------------------Registeration----------------------------------//
            } else if (number.equals("2")) {

                System.out.println("-------- Registeration page ------- ");

                
                //**********[   1-Fisrt Name   ]**********// 
                System.out.print("Enter first name: ");
                String fname = input.next();
                // To validate the entered First Name
                Boolean validateName = isValidFLname(fname);
                while (true) {
                // First Name not valid
                    if (validateName == false) {
                        System.out.println("Try again the first name must be letters only!");
                        System.out.print("Pleas enter first name: ");
                        fname = input.next();
                        validateName = isValidFLname(fname);
                // First Name valid
                    } else {
                        break;
                    }
                }
                
                //**********[   2-Last Name   ]**********//
                System.out.print("Enter last name: ");
                String lname = input.next();
                // To validate the entered Last Name
                validateName = isValidFLname(lname);
                while (true) {
                // Last Name not valid
                    if (validateName == false) {
                        System.out.println("Try again the last name must be letters only!");
                        System.out.print("Pleas enter last name: ");
                        lname = input.next();
                        validateName = isValidFLname(lname);
                // Last Name valid
                    } else {
                        break;
                    }
                }

                //**********[   3-Email   ]**********//
                System.out.print("Enter email: "); 
                String Email = input.next();
                // To validate the entered Email
                boolean isValidEmail = isValidEmail(accounts, Email);
                while (true) {
                // Email not valid
                    if (isValidEmail == false) {
                        System.out.println("Try again!");
                        System.out.print("Pleas enter email: ");
                        Email = input.next();
                        isValidEmail = isValidEmail(accounts, Email);
                // Email valid
                    } else {
                        break;
                    }
                }

                //**********[   4-Phone Number   ]**********//
                System.out.print("Enter phone number: ");
                String Phone = input.next();
                // To validate the entered Phone Number
                boolean isValidphonenumber = isValidphonenumber(Phone);
                while (true) {
                // Phone Number not valid
                    if (isValidphonenumber == false) {
                        System.out.println("Try again! *phone number must be 10 digits and start withe 055 054 050 056 053 059");
                        System.out.print("Pleas enter phone number: ");
                        Phone = input.next();
                        isValidphonenumber = isValidphonenumber(Phone);
                // Phone Number valid        
                    } else {
                        break;
                    }
                }

                //**********[   5-Username   ]**********//
                System.out.print("Enter username : ");
                String username = input.next();
                // To validate the entered Username
                boolean isValidUsername = isValidUsername(accounts, username);
                while (true) {
                // Username not valid    
                    if (isValidUsername == false) {
                        System.out.print("Pleas enter username: ");
                        username = input.next();
                        isValidUsername = isValidUsername(accounts, username);
                // Username not valid          
                    } else {
                        break;
                    }
                }

                //**********[   6-Password   ]**********//
                System.out.print("Enter password : ");
                String password = input.next();
                // To validate the entered Password
                boolean isValidPassword = isValidPassword(password);
                while (true) {
                // Password not valid
                    if (isValidPassword == false) {
                        System.out.print("Pleas enter password: ");
                        password = input.next();
                        isValidPassword = isValidPassword(password);
                // Password not valid
                    } else {
                        break;
                    }
                }

                //**********[   7-Age   ]**********//
                System.out.print("Enter age : ");
                int age = input.nextInt();
                // To validate the entered Age
                boolean isValidAge = isValidAge(age);

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
                System.out.println("-----------------------------------------------------");
                System.out.println("");
                System.out.println("");
                int choice = input.nextInt();
                // To display account information
                if (choice == 1) {
                    user.AccountInformation();
                }
                System.out.println("      - To home page enter(1)");
                System.out.println("      - To Exit enter(2)");
                System.out.print("--->");
                choice = input.nextInt();
                if (choice == 1) continue;
                // To display exit page and terminate the system
                else if(choice ==3) 
                System.out.println("**************!!! Thank you for using Saudi Guide !!!**************");
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

//    ___________________________________________________
     //                                                //
    //      Method 1- Check First and last name       //
   //________________________________________________//
    
    public static boolean isValidFLname(String name) {
        return ((!name.equals("")) && (name != null) && (name.matches("^[a-zA-Z]*$")));
    }
    

//    ___________________________________________________
     //                                                //
    //               Method 2- Check Email            //
   //________________________________________________//
    public static boolean isValidEmail(ArrayList<Account> A, String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher matcher = pattern.matcher(email);

        boolean SearchByEmail = SearchByEmail(A, email);
        if (SearchByEmail) {
            System.out.println("Sorry, an account with this email already exists");

            return false;
        }

        return matcher.matches();
    }

    
//    ___________________________________________________
     //                                                //
    //          Method 3- Check phone number          //
   //________________________________________________//    
    public static boolean isValidphonenumber(String isValidphonenumber) {
        Pattern pattern = Pattern.compile("(05)?[0,5,3,9,4,6][0-9]{7}");
        java.util.regex.Matcher matcher = pattern.matcher(isValidphonenumber);
        return matcher.matches();
    }

    
//    ___________________________________________________
     //                                                //
    //          Method 4- Check username              //
   //________________________________________________//    
    public static boolean isValidUsername(ArrayList<Account> A, String name) {  
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern pattern = Pattern.compile(regex);

        if (name == null) {
            return false;
        }
        // to find matching between given username and regular expression.
        Matcher matcher = pattern.matcher(name);

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
        return matcher.matches();
    }

    
//    ___________________________________________________
     //                                                //
    //              Method 5- password                //
   //________________________________________________//  
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

    
//    ___________________________________________________
     //                                                //
    //              Method 6- check age               //
   //________________________________________________//  
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

 
//    ___________________________________________________
     //                                                //
    //   Method 7- Search <Username> in array list    //
   //________________________________________________//  
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

 
//    ___________________________________________________
     //                                                //
    //    Method 8- Search <Email> in array list      //
   //________________________________________________//  
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
