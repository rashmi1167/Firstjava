package Methodoverloading;

public class Addition

{
 void test (char a, int b )
 {
	 System.out.println("Add 2 number");
 }
 
 void print (int i)
 {
	if (i>=75)
	 System.out.println("distinction");
	else 
		System.out.println("Pass");
 }
 
 
void test ( int b, char a)
 {
	 System.out.println("Add 3 number");
 }
 
 
 /*int sum (int a, int b, int c)
 {
	int d= a+b+c;
	System.out.println(d);
	return d;
 }
 
 void sum (int a, int b, int c, int d)
 {
	 System.out.println(a+b+c+d);
 }
 */
}

