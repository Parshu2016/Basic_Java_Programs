package printingname;

import java.util.Scanner;

public class WAPareaoftrangle {
	void areaoftrangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of base");
		int base= sc.nextInt();
		System.out.println("enter the value of height");
		int height= sc.nextInt();
		double area=0.5*base*height;
		System.out.println("areaoftrangle is = "+area);
		sc.close();
	}
	public static void main(String[] args) {
		
		WAPareaoftrangle w=new WAPareaoftrangle();
		w.areaoftrangle();
		
	}

}
