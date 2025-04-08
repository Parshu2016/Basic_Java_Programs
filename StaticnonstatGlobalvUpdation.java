package printingname;

public class StaticnonstatGlobalvUpdation {
	static int a=10;
	int b=5;
		
	public static void main(String[] args) {
		
		a=20;
		System.out.println("updated value of static :"+a);
		 
		StaticnonstatGlobalvUpdation s=new StaticnonstatGlobalvUpdation();
		s.b=30;
		System.out.println("updated value of non static :"+s.b);
		
		
	}

}
