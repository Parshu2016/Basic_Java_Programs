package printingname;

public class Print1to5 {
	
	void print (int a, char c)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("non_static parametrized 1 to 5 print :" +i);
		}
	}
	static void statprint (int a, char c)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(" static parametrized 1 to 5 print :" +i);
		}
	}
	
	public static void main(String[] args) {
		
		Print1to5 p=new Print1to5();
	
	  p.print(1, 'c');
	  statprint(2,'b');
	  
}
}
