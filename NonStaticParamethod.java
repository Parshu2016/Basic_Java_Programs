package printingname;

public class NonStaticParamethod {
	
	public void name()
	{
		System.out.println("non parametrized");
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("addition is =" +c);
	}

	public void name1(String s, int a)
	{
		
		System.out.println("Enter yor name" +s);
		System.out.println( "age =" +a);
	}
	public void sub(long a, long b)
	{
		long c=a-b;
		System.out.println("the value of c=" +c);
	}
	
	public static void main(String[] args) {
		NonStaticParamethod n= new NonStaticParamethod();
		n.name();
		n.add(2,2);
		n.name1("Parshu", 27);
		n.sub(4521548, 232565);
		
	

	}

}
