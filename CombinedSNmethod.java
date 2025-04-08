package printingname;

public class CombinedSNmethod {
	
	public static void name()
	{
		System.out.println("Parshuram");
	}
	
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

	public static void main(String[] args) {
		CombinedSNmethod n=new CombinedSNmethod();
		n.add();//non static method call
		n.sub();
		name();//static method call

	}

}
