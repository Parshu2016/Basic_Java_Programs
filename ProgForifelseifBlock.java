package printingname;

public class ProgForifelseifBlock {
	
	
	 static void ifelseifblock()
	{
		int a=20;
		int b=10;
		if (a>b )
		{
			
			if (b>a)
			{
				System.out.println("if is executed");
			}
			else 
			{
				System.out.println("condition is false so else block executed");
			}
		
	}
	 else
	 {
		System.out.println("main if block condtion flase"); 
		 
	 }
		 
	 }
		
	
	
	public static void main(String[] args) {
		
		//System.out.println("main method block");
		ifelseifblock();
		
	}
	}