package Constructor;

public class Demo2 {
	int num1;
	int num2;
	int num3;
	public Demo2()
	{
	num1=10;
	num2=20;
	num3=30;
	}

	public static void main(String[] args) {
		
		Demo2 P=new Demo2();
		P.demo1();

	}
public void demo1()
{
	int c=num1+num2+num3;
	System.out.println(c);
}
}
