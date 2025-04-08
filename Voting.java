package printingname;

public class Voting {
	void vote()
	{
		int age=18;
		if (age>=18)
		{
			System.out.println("user is eligible for vote");
		}
		else
		{
			System.out.println("user is not able to vote because he/she is not completef the voting criteria");
		}
		
	}
	

	public static void main(String[] args) {
		Voting v=new Voting();
		v.vote();
		
	}
}
