import java.util.Scanner;


public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan = new Scanner(System.in);
		
		//System.out
		System.out.println("Enter number of elements: ");
		int v = scan.nextInt();
		
		int number[]=new int[v];
		System.out.println("Enter The Values: ");
		
		for(int i=0;i<v;i++){
	        number[i]=scan.nextInt();
		}
		
		System.out.println("Enter \"1\" if you want to find max or \"2\" if you want to find min ");
		int hi = scan.nextInt();
		if(hi==1){
			int answer = maxval(number);
		}
		else if (hi==2){
			int ans2 = minval(number);
		}
	}
	public static int maxval(int a[]){
		
		int max = a[0];
		
	    for(int i=2;i<v;i++)// i starts from 2 because we already took one num value
        {
            num=input.nextInt();
            if(num>large)//comparing each time entered number with large one
          {
           large=num;
          }
            if(num<smallest)//comparing each time entered number with smallest one
            {
                smallest=num;
            }
        }
		return 1;
	}
	public static int minval(int a[]){
		return 1;
}
