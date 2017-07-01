import java.util.Scanner;


public class divis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println("Enter two values: ");
		
		int one = scan.nextInt();
		int two = scan.nextInt();
		boolean c = Even_Divisble(one, two);
		System.out.println("Your Value is " + c);

	}
	public static boolean Even_Divisble(int a, int b){
		if(a%b==0 || b%a==0)
			return true;
		else
			return false;
	}

}
