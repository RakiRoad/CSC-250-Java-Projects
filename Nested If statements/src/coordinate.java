import java.util.Scanner;

public class coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter X1 and Y1: ");
		double x1 = scan.nextDouble(); double y1 = scan.nextDouble();
		
		System.out.println("Enter X2 and Y2: ");
		double x2 = scan.nextDouble(); double y2 = scan.nextDouble();
		
		double distance = Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));
		
		System.out.println("The distance is " + distance);
		
	}

}
