import java.util.Scanner;
public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] number = new int[5];
		java.util.Scanner scan = new Scanner(System.in);
		
		//System.out
		System.out.println("Enter number of elements: ");
		int v = scan.nextInt();
		
		int number[]=new int[v];
		System.out.println("Enter The Values: ");
		
		for(int i=0;i<v;i++){
	        number[i]=scan.nextInt();
		}
		int max = number[0];
		//int min = number[0];
		//int i=2;
		
		for(int i=1; i<v; i++){
			if(number[i] < max)
                max = number[i];
			//else if (number[i] < min)
                //min = number[i];
		}
		 System.out.println("The Max is: " + max);
		 //System.out.println("The Min is: " + min);
		 //return max;
	}
}
