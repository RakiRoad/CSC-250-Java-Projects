package ralph;



public class SearchClass {

	
	//new linear
	public void linearSearch(int[] arr, int target){
		long startTime = System.nanoTime(); 
        for(int i = 0; i < arr.length; i++){
                if(arr[i] == target){
                	System.out.println("Linear Search index number is: " + i); 
                }
                
        }
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        
        System.out.println("The duration of Linear Search is:" + duration);
        
        
}
	//Binary Search
	public void binarySearch(int A[], int Num){
		long startTime = System.nanoTime();
		
		int first = 0;
		int last = A.length-1;
		int mid = (first+last)/2;
		while ((A[mid] !=Num) && (first<=last)){
			if (A[mid]>Num)
				last=mid-1;
			else
				first = mid +1;
			mid = (first+last)/2;
		}
		if (A[mid]==Num)
			System.out.println("Binary Search index number is: " + mid);  //use to be return mid;
		else 
			System.out.println("Binary Search index number is: " + -1);
		
		long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println("The duration of Binary Search is:" + duration);
	}
	
	//determines if there are any duplicates
	//
	public void duplicateFind(int A[]){
		long startTime = System.nanoTime();
		boolean duplicate=false;
		for (int j=0;j<A.length;j++){
			  for (int k=j+1;k<A.length;k++){
			    if (k!=j && A[k] != A[j])
			    	duplicate = true;
			  }
		}
		if(duplicate == false){
			System.out.println("Here are the distinct numbers: ");
			traverse(A);
			System.out.println();
		}
		System.out.println("There are duplicates." + duplicate + "!");
		long endTime = System.nanoTime();
        long duration = endTime-startTime;
        
        System.out.println("The time it takes to determine if there are any distinct numbers is:" + duration);
	}
	

		
	
	//finding max
	public void maxansw(int arr []){
		
		long startTime = System.nanoTime();
		
		int max = arr [0];

	    for(int i=1;i<1000;i++)
        {
            
            if(arr[i]>max)
          {
           max=arr[i];
          }
      
        }
		
	    System.out.println("The Max is: " + max);
		long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println("The duration to find Max is:" + duration);
	}
	
	//finding min
	public void minansw(int arr []){
		
		long startTime = System.nanoTime();
		
		int min = arr [0];
	    for(int i=1;i<1000;i++)
        {
            
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
		
	    System.out.println();
	    System.out.println("The min is: " + min);
		long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println("The duration to find min is:" + duration);
	}
	
	//prints the array
	public static void traverse(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
