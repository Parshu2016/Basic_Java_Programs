package printingname;

import java.util.Scanner;

public class PrintAreaofSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of a side of the square: ");
		double r=sc.nextDouble();
		double area=r*r;
		System.out.print("area is = "+area);
		sc.close();
		
	
	}

}
