package printingname;

public class finalVariable {
	
	 int i=10;
	 final int b=10;
	
	void add()
	{
		i=20;//changing value for global non final variable its changing
		System.out.println("non final variable:  "+i);
	}
	void add1()
	{
		  
		System.out.println("final variable:  "+b);
	}
	
	public static void main(String[] args) {
		finalVariable f=new finalVariable();
		f.add();
		f.add1();
		
	}

}
