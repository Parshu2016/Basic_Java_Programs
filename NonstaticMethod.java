package printingname;

public class NonstaticMethod {
	
	public void add()
	{
	int a=20;
	int b=20;
	int c=a+b;
	System.out.println("addition is = "+c);
	}
	
	public void sub() {
		int a=6;
		int b=3;
		int c=a-b;
		System.out.println("substraction = "+c);
	}
		public void mul()
		{
			int a=10;
			int b=a*a;
			System.out.println("multiplication= "+b);
		}
	
	public static void main(String[] args) {
		NonstaticMethod n= new NonstaticMethod();
		n.add();
		n.sub();
		n.mul();
		 
	}

}
