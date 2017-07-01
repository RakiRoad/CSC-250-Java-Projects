import java.util.Scanner;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year: ");
		
		int year = scan.nextInt();
		
		if (year%4 == 0 && year%100 != 0){
		System.out.println(year + " is a leap year");
		}
		else if (year%4==0 && year%100 == 0 && year%400==0){
			System.out.println(year + " is a leap year");
		}
		else if(year%4 != 0 || year%100 == 0){
		System.out.println(year + " is not a leap year");
		
		}
	}

}
