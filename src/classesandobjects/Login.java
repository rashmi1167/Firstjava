package classesandobjects;

public class Login {
	
	String username;
	String password;
	
	 void setinput(String uname, String pass) //  No return type and with parameter
	 {
		 int x=10;
		 username=uname;
		 password=pass;
	 }
	 void printingvalues() //  No return type and with no parameter
	 {   int x=10;
		 int y=x+10;
		 System.out.println("Username is "+ username);
		 System.out.println("Password is "+ password);
		 		 
	 }
 public void validation()
	{
	 if (username=="Ritesh"&& password=="Abcd@123")
	  System.out.println("user logged in successfully");
		 else
	 
		 System.out.println("Invalid credentials");
	 
    }
 
 Login (String uname, String pass)
 {
	 username=uname;
	 password=pass;
 }
	}
