package printingname;

public class Localvariable {
	
	static void addition()
	{
		int a=99;
		int b=99;
		int c=a+b;
		System.out.println(c);
	}
	  void sub(char v, float l)
	{
		int a=91;
		int b=90;
		int c=a-b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		addition();
		Localvariable l=new Localvariable();
		l.sub('p', 10.2f);
		
		
	}

}
