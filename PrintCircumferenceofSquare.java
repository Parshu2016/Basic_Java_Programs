package printingname;

import java.util.Scanner;

public class PrintCircumferenceofSquare {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
      
     System.out.print("Enter the length of a : ");
     double a = sc.nextDouble();
     
     double circumference = 4 * a;
     
     System.out.print("area is = "+circumference);
     sc.close();
}
	
}
