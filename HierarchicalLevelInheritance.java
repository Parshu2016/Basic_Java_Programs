package printingname;

class class1
{
	void class11()
	{
		System.out.println("parent class");
	}
}

class stud extends class1
{
	void child1()
	{
		System.out.println("child class 1");
	}
	
}
class teacher extends class1
{
	
	void child2()
	{
		System.out.println("child class 2");
	}
	
}

public class HierarchicalLevelInheritance extends class1{
	void child3()
	{
		System.out.println("child class 3");
	}
	
	
	
	public static void main(String[] args) {
		HierarchicalLevelInheritance h= new HierarchicalLevelInheritance();
		h.child3();
		stud s=new stud();
		s.child1();
		teacher t=new teacher();
		t.child2();
		
	}

}
