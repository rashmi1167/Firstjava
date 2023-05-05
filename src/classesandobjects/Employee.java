package classesandobjects;

public class Employee {
	
	int eid;
	String ename;
	String jobtitle;
	int esal;
	
	Employee (int id, String name, String job, int sal )
	{
	 eid=id;
	 ename= name;
	 jobtitle=job;
	 esal=sal;
	}
	
	void display ()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(jobtitle);
		System.out.println(esal);
	
	}

	

}
