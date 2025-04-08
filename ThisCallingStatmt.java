package printingname;



public class ThisCallingStatmt {
	ThisCallingStatmt(int a)
	{
		
		
	System.out.println("1");	 
	}
	ThisCallingStatmt(int a, int b)
	{
		this(10);
		
		System.out.println("2");
	}
	
	ThisCallingStatmt()
	{
		this(100,200);
		System.out.println("3");
		 
	}	
	

	public static void main(String[] args) {
		
		new ThisCallingStatmt();
		

	}

}
