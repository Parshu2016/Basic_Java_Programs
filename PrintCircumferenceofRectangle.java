package printingname;

import java.util.Scanner;

public class PrintCircumferenceofRectangle {
	
	void CircumferenceofRectangle()
	{
		Scanner sc = new Scanner(System.in);	
 
    System.out.print("Enter the length of the rectangle: ");
    double length = sc.nextDouble();

    System.out.print("Enter the width of the rectangle: ");
    double width = sc.nextDouble();

    
    double circumference = 2 * (length + width);

   
    System.out.println("The circumference is: " + circumference);

    sc.close();
	}
	public static void main(String[] args) {
		PrintCircumferenceofRectangle p= new PrintCircumferenceofRectangle();
		p.CircumferenceofRectangle();
		
	}

}
