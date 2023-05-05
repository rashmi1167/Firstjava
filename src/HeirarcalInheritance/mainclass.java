package HeirarcalInheritance;

public class mainclass {

	public static void main(String[] args)
	{
		Animal A= new Animal();
		
		Rabbit R= new Rabbit();
		
		Zebra Z= new Zebra();
		
		Sheep S= new Sheep();
		
		Cow C= new Cow();
		
		//A.Features();
		R.Features();
		R.rabbitproperty();
		Z.Features();
		Z.zebraproperty();
		S.Features();
		S.sheepproperty();
		C.Features();
		C.cowproperty();

	}

}
