package printingname;

import java.util.Scanner;

public class PrintCircumferenceofTriangle {
	void CircumferenceofTriangle() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of lenght a:");
		double a=sc.nextDouble();
		System.out.println("enter the value of lenght b:");
		double b=sc.nextDouble();
		System.out.println("enter the value of lenght c:");
		double c=sc.nextDouble();
		double result=a+b+c;
		System.out.println("CircumferenceofTriangle is = "+result);
		sc.close();
		
	}
	
	public static void main(String[] args) {
		PrintCircumferenceofTriangle p=new PrintCircumferenceofTriangle();
		p.CircumferenceofTriangle();
		
	}

}
