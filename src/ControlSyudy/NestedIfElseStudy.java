package ControlSyudy;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		String UN="Velocity";
		String PWD="123";
		
		if (UN=="Velocity") 
		    {
			
			System.out.println("Correct Username plz enter password ");
			
			if (PWD=="1234") 
			{
				
				System.out.println("Login successful");
				
			}
			else 
			{
				System.out.println("Wrong password, plz check password");

			}
			
		} 
		else 
		{
			System.out.println("Incorrect username, unable to login");

		}


	}

}
