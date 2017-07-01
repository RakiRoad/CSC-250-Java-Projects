import java.util.Scanner;

public class counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan= new Scanner(System.in);
		int x, y , z;
		
		System.out.println("Input Starting number: ");
		x = scan.nextInt();
		
		System.out.println("Input Ending number: ");
		y = scan.nextInt();
		
		System.out.println("Input the multiple: ");
		z = scan.nextInt();
		
		if (x>y){
			for (int hi=x; hi>=y; hi-=z){;
			System.out.println(hi);
			}
		}
		else if (y>x){
			for (int hi=x; hi<=y; hi+=z){;
			System.out.println(hi);
			}
		}
		}
	
	}


