package printingname;
  class grandparent{
	void grandpa()
	{
		System.out.println("granparent class");
	}
	
}

class Parent2 extends grandparent
{
	
	void parent()
	{
		System.out.println("Parent class");
	}
}


public class SingleLevelInhr extends Parent2


{
	
	void child()
	{
		System.out.println("Child class");
	}

	
	public static void main(String[] args) {
		SingleLevelInhr s=new SingleLevelInhr();
		s.child();
		s.parent();
		s.grandpa();
	}
}
