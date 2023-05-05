package classesandobjects;

public class loginmain {
     
     
     
    
	public static void main(String[] args) 
	
	{
		String pass="Abcd@12"; 
		
		/*int i=pass.length();
		 if (i>=8)
		 {
			 System.out.println("Password length matched");
			 
			
		 }
		 else
		 {
			 System.out.println("Less limit");
		 }*/
		Login log1= new Login("Ritsh","Abcd@123");
		
		log1.setinput("Ritesh","Abcd@123");
		log1.printingvalues();
		log1.validation();
		
		
		
		

	}

}
