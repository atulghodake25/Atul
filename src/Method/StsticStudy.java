package Method;

public class StsticStudy {

	public static void main(String[] args) {
		
		addition();//static method are calling in the same class. only calling methodname();
		statics.substraction();//static method calling in another class.calling classname.methodname();

	}
	public static void addition()//using static method in same class
	{
		int a=10;
		int b=66;
		int c=b+a;
		System.out.println(c);
	}

}
