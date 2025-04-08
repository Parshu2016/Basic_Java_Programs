package printingname;


class Precondition{
	void Login()
	{
		System.out.println("Calling this method by using super keyword");
		System.out.println("Login through Email Parent method");
	}
}
public class MethodOverride1 extends Precondition {
	void Login()
	{
		super.Login();
		System.out.println("Login through Mobile child method");
		
	}
	
	public static void main(String[] args) {
		
		MethodOverride1 m=new MethodOverride1();
		m.Login();
		
	}

}
