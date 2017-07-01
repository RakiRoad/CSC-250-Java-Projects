import java.util.Scanner;


public class same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println("Enter \"1\" if you want to find max or \"2\" if you want to find min ");
		int hi = scan.nextInt();
		if(hi==1){
			int c = maxansw(hi);
			System.out.println("The max number is " + c);
		}
		else if (hi==2);
			int d = minansw(hi);
			System.out.println("The min number is " + d);
		}
	
	public static int maxansw(int hi){
		java.util.Scanner scan = new Scanner(System.in);
		
		//System.out
		System.out.println("Enter number of elements: ");
		int v = scan.nextInt();
		
		int number[]=new int[v];
		System.out.println("Enter The Values: ");
		
		for(int i=0;i<v;i++){
	        number[i]=scan.nextInt();
		}
		int max = number [0];

	    for(int i=1;i<v;i++)
        {
            
            if(number[i]>max)
          {
           max=number[i];
          }
      
        }
		
		return max;
	}
	public static int minansw(int hi){
		java.util.Scanner scan = new Scanner(System.in);
		
		//System.out
		System.out.println("Enter number of elements: ");
		int v = scan.nextInt();
		
		int number[]=new int[v];
		System.out.println("Enter The Values: ");
		
		for(int i=0;i<v;i++){
	        number[i]=scan.nextInt();
		}
		
		int min = number [0];
	    for(int i=1;i<v;i++)
        {
            

            if(number[i]<min)
            {
                min=number[i];
            }
        }
		
		return min;
	}
}
