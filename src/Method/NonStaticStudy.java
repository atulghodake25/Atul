package Method;

public class NonStaticStudy {

	public static void main(String[] args) {
		NonStaticStudy N=new NonStaticStudy();
		N.demo();
		NonStatics n1=new NonStatics();
		n1.student();
		
		

	}
	public void demo()
	{
		float a=20.3f;
		double b=63.32;
		int c=53;
		String name="Rahul";
		boolean d=(a<=b);
		char m='c';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
		System.out.println(d);
		System.out.println(m);
	}

}
