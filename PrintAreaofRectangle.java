package printingname;

import java.util.Scanner;

public class PrintAreaofRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);         
        System.out.print("Enter the lengthvalue: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width value: ");
        double width = sc.nextDouble(); 
        double area = length * width; 
        System.out.println("The area is: " + area);

        sc.close();
	}

}
