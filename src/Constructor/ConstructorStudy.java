package Constructor;

public class ConstructorStudy {
	String city="Nashik";
	String name;
	public ConstructorStudy()
	{
		name="Atul";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        display1();
		
        ConstructorStudy c2= new ConstructorStudy();
		c2.display();

	}
	
	public void display()
	{
		System.out.println("I am non static display method");
		System.out.println("My city name is "+city);
		System.out.println("My name is "+name);
	}
	
	public static void display1()
	{
		System.out.println("I am  static display1 method");
	}


}
