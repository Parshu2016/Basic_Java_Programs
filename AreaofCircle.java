package printingname;

import java.util.Scanner;

public class AreaofCircle {
	
	void cicle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value of a rasdius");
		int r=sc.nextInt ();
		double  area=Math.PI*r*r;
		 
		System.out.println(area);
		sc.close();
	}

	public static void main(String[] args) {
	 
		AreaofCircle a=new AreaofCircle();
		a.cicle();
	}

}
