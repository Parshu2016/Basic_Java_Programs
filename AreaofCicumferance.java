package printingname;

import java.util.Scanner;

public class AreaofCicumferance {
	
	void Cicumferance()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the radius value");
		int r=sc.nextInt();
		double area=2*Math.PI*r;
		System.out.println("AreaofCicumferance is = "+area);
		sc.close();
	}
	public static void main(String[] args) {
		AreaofCicumferance a=new AreaofCicumferance();
		a.Cicumferance();
	}

}
