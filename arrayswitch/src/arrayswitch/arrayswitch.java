package arrayswitch;

public class arrayswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int[]array1={1,2,3};
	int[]array2={4,5,6};
	
	switchThem(array1,array2);
	
	
	}
	public static void switchThem( int[]a, int[]b){
	
		int temp[] = a;
        a = b;
        b = temp;
        
        System.out.println("The New Values of Array 1 are: ");
        for (int i=0; i<=2;i++) {
        System.out.println(a[i]);
    	
        }
        
        System.out.println("The New Values of Array 2 are: ");
        for(int j=0;j<=2;j++){
        	System.out.println(b[j]);
        	
        }
	}
	
}
