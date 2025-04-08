package printingname;

public class GlobalStaticNonStaticMethod {
	int a=20;
	int b=10;
	
	void add()
	{
		int sum=a+b;
		System.out.println("addition is : "+sum);
	}
	static void sub()
	{
		GlobalStaticNonStaticMethod g=new GlobalStaticNonStaticMethod();
		int substraction=g.a-g.b;
		System.out.println("substraction is : "+substraction);
	}
	public static void main(String[] args) {
		GlobalStaticNonStaticMethod g=new GlobalStaticNonStaticMethod();
		sub();
		g.add();
	}

}
