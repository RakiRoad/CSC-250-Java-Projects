import java.util.Scanner;

public class measureCoordinate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first set of coordinates: ");
		double x1 = scan.nextDouble(); double y1 = scan.nextDouble();
		
		System.out.println("Enter the second set of coordinates: ");
		double x2 = scan.nextDouble(); double y2 = scan.nextDouble();
		
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		
		System.out.println("The distance between the two is: " + distance);

	}

}
