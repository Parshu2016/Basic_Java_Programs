package printingname;

public class NonStaticPara {
	
	public static void userdetails(String name, int age )
	{
		System.out.println("Name = "+name);
		System.out.println("age = "+age);
	}
	
	public static void gender(char gender  )
	{
		System.out.println("gender = "+gender);
		
	}
	
	public static void voting(int age)
	{
		
		if (age>=18)
		{
		System.out.println("user can vote");
	
		}
	}

	public static void main(String[] args) {
		
		userdetails("Parshuram", 27);
		gender('M');
		voting(18);
	}

}
