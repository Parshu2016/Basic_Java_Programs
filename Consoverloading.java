package printingname;

public class Consoverloading {
	Consoverloading()
	{
		int a=90;
		System.out.println(a);
	}

	Consoverloading(int a){
		
		System.out.println(a*a);
		
		
	}
	public static void main(String[] args) {
		new Consoverloading();
		new Consoverloading(10);
	 

	}

}
