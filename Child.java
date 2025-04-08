package printingname;


  class parent1
{
	
	  void P1(int a, int b)
	{
		System.out.println("Parent");
		int Sum=a+b;
		System.out.println("Addition is = "+Sum);
		
	}
}
  public class Child extends parent1
{
	 void child(String s, int a, char c)
	{
		System.out.println("child");
		System.out.println("String value "+s +"\nint is:  "+a +"\nchar c=" +c);
	}
	public static void main(String[] args) {
		
		Child P=new Child();
		P.child("abc",10,'P');
		P.P1(10,20);
		
	}

}
