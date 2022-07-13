package TypesOfVariable;

public class GlobalAndLoacal {
	int a=20;

	public static void main(String[] args) {
		

		GlobalAndLoacal s= new GlobalAndLoacal();
		s.display();
		s.display1();
		System.out.println("Value of a after calling is "+s.a);//calling Non static global variable from same class

	}

	
	public void display()
	{
		int b=30;   // local variable
		System.out.println( "value of b is "+b);// value of b will be 30 for display method only
		System.out.println("Valuue of a is "+a);// value of a will be 20 for all methods
		
	}
	
	public void display1()
	{
		int c=40; // local variable
		int b=50;
		System.out.println( "value of b is "+b);
		System.out.println("value of c is "+c);
		System.out.println("Value of a is "+a);
		
	}


}
