 
package cpit251;

 
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
    
    
    
}
