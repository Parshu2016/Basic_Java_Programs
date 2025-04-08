package printingname;


class parentp1
{
	parentp1(int i)
	{
		System.out.println("this is a parent");	
	}
	
}
public class SuperPara extends parentp1 {
	SuperPara()
	{
		super(10);
		System.out.println("this is a child");
	}
	
	public static void main(String[] args) {
		new SuperPara();
	}
	
	
	

}
