 
package cpit251;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 
public class Account {
    private String fname;
    private String lname;
    private String email;
    private String phoneNumber;
    private String username;
    private String password;
    private int age;

    public Account() {
    }

    public Account(String fname, String lname, String email, String phoneNumber, String username, String password, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    // Method 1- Check First and last name
     public boolean CheckFLname(String str){
     return ((!str.equals("")) && (str != null) && (str.matches("^[a-zA-Z]*$")));
        
    }

     
    public void AccountInformation() {
          System.out.println("----------------------------------");
          System.out.println("Your Account Information is" );
          System.out.println("---------------------------------");
          System.out.println("First name: "+fname);
          System.out.println("Last name: "+lname);
          System.out.println("Email: "+email);
          System.out.println("Phone number"+phoneNumber);
          System.out.println("----------------------------------");

          
          
 }
//   _______________________________________________
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
         int searchListLength = A.size();
        for (int i = 0; i < searchListLength; i++) {

            if (A.get(i).getUsername().equalsIgnoreCase(username)) {
                return i;
            }

        }

        return -1;
    }

//    ___________________________________________________
    //                                                //
    //    Method 8- Search <Email> in array list      //
    //________________________________________________//  
    public static boolean SearchByEmail(ArrayList<Account> A, String Email) {
          int searchListLength = A.size();
        for (int i = 0; i < searchListLength; i++) {
            if (A.get(i).getEmail().equalsIgnoreCase(Email)) {
               return true;
            } 
        }
        return false;
    }
    
    
}
