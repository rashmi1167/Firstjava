package Inheritance;

public class mainclass {

	public static void main(String[] args)
	{
		
		First f = new First();
		Second s= new Second();
		Third T= new Third();
		
		f.show();
		f.show("Rashi");
		s.child();
		s.show();
		s.show("Ganesh");
		T.child();
		T.grandcild();
		T.show();
		T.show("Kajal");
		
		
	
		
		

	}

}
