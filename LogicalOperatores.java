package printingname;

public class LogicalOperatores {
	void operatores()
	{
		int a=300;
		int b=200;
				if (a>b && b>a)
				{
					System.out.println("&& operatoer");
				}
				else if(a>b || a==b )
				{
					System.out.println("|| operatoer");
				}
				else if(!(a>b || a<b))
				{
					System.out.println("! && operatoer");
				}
	}
	
	
	public static void main(String[] args) {
		LogicalOperatores n=new LogicalOperatores();
		n.operatores();
		
	}

}
