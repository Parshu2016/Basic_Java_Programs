package printingname;


class Precondition1{
	final void Login()
	{
		
		System.out.println("Login through Email Parent method this is a final ");
	}
}
public class Thiskeyword  extends Precondition1 {
	void LoginChild()
	{
		 
		System.out.println("Login through Mobile child method");
		
	}
	
	public static void main(String[] args) {
		
		Thiskeyword m=new Thiskeyword();
		m.Login();
		
	}

}



