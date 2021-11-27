
import cpit251.Account;
import cpit251.SaudiGuide;
import java.util.ArrayList;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAccount {

    // Test first method "isValidFLname(String name)" of class SaudiGuide  
    @Test
    public void TestisValidFLname() {
        // valid input
        String validName = "Shaima";
        // invalid input
        String invalidName = "Shai00a";
        // test
        boolean expResult = true;
        boolean result = SaudiGuide.isValidFLname(validName);
        assertEquals(expResult, result);

    }

    // Test secound method "isValidEmail(ArrayList<Account> A, String email)" of class SaudiGuide  
    @Test
    public void TestisValidEmail() {
        ArrayList<Account> accountINFO = new ArrayList<>();
        Account user_1 = new Account("Sarah", "Naghi", "Sarh@hotmail.com", "0500000001", "Sarah", "Ss@12345678", 23);
        Account user_2 = new Account("Rawan", "Samer", "Rawan@hotmail.com", "0500000002", "RawanS", "Rr@12345678", 22);
        Account user_3 = new Account("Ragad", "Fahad", "Ragad@hotmail.com", "0500000003", "RagadFt", "Rr@12345678", 22);
        Account user_4 = new Account("Leen", "Saleh", "Leen@hotmail.com", "0500000004", "LeenS", "Ll@12345678", 23);

        accountINFO.add(user_1);
        accountINFO.add(user_2);
        accountINFO.add(user_3);
        accountINFO.add(user_4);
        // valid input
        String NewEmail = "Sssarh@hotmail.com";
        // invalid input
        String ExistsEmail = "Sarh@hotmail.com";
        // test
        boolean expResult = true;
        boolean result = SaudiGuide.isValidEmail(accountINFO, NewEmail);
        assertEquals(expResult, result);

    }

    // Test third method "isValidphonenumber(String isValidphonenumber)" of class SaudiGuide  
    @Test
    public void TestisValidphonenumber() {
        // valid input
        String vaildPhoneNumber = "0532456718";
        // invalid input
        String invaildPhoneNumber = "51234234567";
        // test
        boolean expResult = true;
        boolean result = SaudiGuide.isValidphonenumber(vaildPhoneNumber);
        assertEquals(expResult, result);

    }

    // Test forth method "isValidphonenumber(String isValidphonenumber)" of class SaudiGuide  
    @Test
    public void TestisValidUsername() {
        ArrayList<Account> accountINFO = new ArrayList<>();
        Account user_1 = new Account("Sarah", "Naghi", "Sarh@hotmail.com", "0500000001", "Sarah", "Ss@12345678", 23);
        Account user_2 = new Account("Rawan", "Samer", "Rawan@hotmail.com", "0500000002", "RawanS", "Rr@12345678", 22);
        Account user_3 = new Account("Ragad", "Fahad", "Ragad@hotmail.com", "0500000003", "RagadFt", "Rr@12345678", 22);
        Account user_4 = new Account("Leen", "Saleh", "Leen@hotmail.com", "0500000004", "LeenS", "Ll@12345678", 23);

        accountINFO.add(user_1);
        accountINFO.add(user_2);
        accountINFO.add(user_3);
        accountINFO.add(user_4);
        // valid input
        String vaildUsername = "ShaimaS";
        // invalid input
        String invaildUsername = "Sarah";
        // test
        boolean expResult = true;
        boolean result = SaudiGuide.isValidUsername(accountINFO, vaildUsername);
        assertEquals(expResult, result);

    }

    // Test fifth method "isValidPassword(String password)" of class SaudiGuide  
    @Test
    public void TestisValidPassword() {
        // valid input
        String vaildPassword = "Shaima@16";
        // invalid input
        String invaildPassword = "shaima";
        // test
        boolean expResult = true;
        boolean result = SaudiGuide.isValidPassword(vaildPassword);
        assertEquals(expResult, result);
    }

    // Test sixth method "isValidAge(int age)" of class SaudiGuide  
    @Test
    public void TestisValidAge() {
        // valid input
        int vaildAge = 22;
        // invalid input
        int invaildAge = 11;
        // test
        boolean expResult = true;
        boolean result = SaudiGuide.isValidAge(vaildAge);
        assertEquals(expResult, result);
    }

    // Test seventh method "SearchByusername(ArrayList<Account> A, String username)" of class SaudiGuide 
    
    @Test
    public void TestSearchByusername() {
        ArrayList<Account> accountINFO = new ArrayList<>();
        Account user_1 = new Account("Sarah", "Naghi", "Sarh@hotmail.com", "0500000001", "Sarah", "Ss@12345678", 23);
        Account user_2 = new Account("Rawan", "Samer", "Rawan@hotmail.com", "0500000002", "RawanS", "Rr@12345678", 22);
        Account user_3 = new Account("Ragad", "Fahad", "Ragad@hotmail.com", "0500000003", "RagadFt", "Rr@12345678", 22);
        Account user_4 = new Account("Leen", "Saleh", "Leen@hotmail.com", "0500000004", "LeenS", "Ll@12345678", 23);
        accountINFO.add(user_1);
        accountINFO.add(user_2);
        accountINFO.add(user_3);
        accountINFO.add(user_4);

        // exists input
        String vaildUsername = "Sarah";
        // not exists input 
        String invaildUsername = "Shaima";
        //test
        int expResult = 0;
        int result = SaudiGuide.SearchByusername(accountINFO, vaildUsername);
        assertEquals(expResult, result);
   
    
    
    
    } 

    // Test eighth method "SearchByEmail(ArrayList<Account> A, String Email)" of class SaudiGuide 
    @Test
    public void TestSearchByEmail() {
        ArrayList<Account> accountINFO = new ArrayList<>();
        Account user_1 = new Account("Sarah", "Naghi", "Sarh@hotmail.com", "0500000001", "Sarah", "Ss@12345678", 23);
        Account user_2 = new Account("Rawan", "Samer", "Rawan@hotmail.com", "0500000002", "RawanS", "Rr@12345678", 22);
        Account user_3 = new Account("Ragad", "Fahad", "Ragad@hotmail.com", "0500000003", "RagadFt", "Rr@12345678", 22);
        Account user_4 = new Account("Leen", "Saleh", "Leen@hotmail.com", "0500000004", "LeenS", "Ll@12345678", 23);
        accountINFO.add(user_1);
        accountINFO.add(user_2);
        accountINFO.add(user_3);
        accountINFO.add(user_4);

        
        // valid input
        String vaildUsername = "Rawan@hotmail.com";
        // invalid input
        String invaildUsername = "Ssarh@hotmail.com";
        
        //test
        boolean expResult = true;    
        boolean result = SaudiGuide.SearchByEmail(accountINFO, vaildUsername);
        assertEquals(expResult, result);
        
        
        
    } 
    
    
    
    
    
    
    
    
    
    

}
