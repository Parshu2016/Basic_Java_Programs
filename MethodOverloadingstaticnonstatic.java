package printingname;

public class MethodOverloadingstaticnonstatic {
	
	static void add()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	static void add(int c)
	{
		int a=20;
		int b=30;
		c=a+b;
		System.out.println(c);
	}
	
	void sub()
	{
		int a=33;
		System.out.println(a-20);
	}
	void sub(int b)
	{
		int a=33;
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		add();
		add(9);
		MethodOverloadingstaticnonstatic n=new MethodOverloadingstaticnonstatic();
		n.sub();
		n.sub(3);

	}

}
