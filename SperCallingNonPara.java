package printingname;

class parentp{
	parentp()
	{
		System.out.println("Parent");
	}
}


public class SperCallingNonPara extends parentp {
	
	SperCallingNonPara()
	{
	super();
	System.out.println("Child class");
	}

	public static void main(String[] args) {
		new SperCallingNonPara();
		

	}

}
