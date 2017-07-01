package ralph;

public class SortClass {
	
	private int[] pool;
	
	public SortClass(){
		pool = new int[1000];
	}
	
	public int[] getArray(){
		return pool;
	}

	
	
	//Test selection
 	void selectionSort1(int[] data)

	{
		long startTime = System.nanoTime(); 
		int min; int temp;

		for (int index = 0; index < data.length-1; index++)

       {

           min = index;

           for (int scan = index+1; scan < data.length; scan++)

           {

           String s1 = Integer.toString(data[scan]);

           String s2 = Integer.toString(data[min]);

               if (s1.compareTo(s2)<0)

                   min = scan;

           }

           if (min != index) 

           swap(data, min, index);         

       }
       long endTime = System.nanoTime();
       long duration = endTime-startTime;
       System.out.println();
       System.out.println("The duration of SelectionSort is:" + duration);
   }

	
	public void InsertionSort(int[] arr){
		long startTime = System.nanoTime();
        for(int i = 1; i < arr.length; i++){    //
                int temp = arr[i];
                int j = 0;
                for(j = i - 1; (j >=0) && (arr[j] > temp); j--){
                                arr[j+1] = arr[j];
                       
                }
                arr[j+1] = temp;
        }
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println();
        System.out.println("The duration of InsertionSort is:" + duration);
}

    
    //bubble sort 
    public void bubbleSort(int[] data)
	{
    	long startTime = System.nanoTime();
    	
    	int position, scan, temp;

    	for (position =  data.length - 1; position >= 0; position--)
    	{
    		for (scan = 0; scan <= position - 1; scan++)
				{
    			//	Here convert data[scan] to Integer as discussed earlier
    			if	(Integer.compare(data[scan], data[scan+1]) > 0) // Use the swap method
				
    				swap(data, scan, scan + 1);

				}
    	}
    	long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println();
        System.out.println("The duration of BubbleSort is:" + duration);
}
    
	//merge sort stuff
    void mergeTime(int[] data, int min, int max){
    	long startTime = System.nanoTime();
    	mergeSort(data, min, max);
    	long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println();
        System.out.println("The duration of merge is:" + duration);
    }
	void mergeSort(int[] data, int min, int max)
	{
		
		if (min < max)
		{
			int mid = (min + max) / 2; 
			mergeSort(data, min, mid); 
			mergeSort(data, mid+1, max); 
			merge(data, min, mid, max);
		}
		
	}
	
	//merge stuff part 2
	void merge(int[] data, int first, int mid, int last)
	{

		int[] temp = new int[data.length];
		int first1 = first, last1 = mid; // endpoints of first subarray 
		int first2 = mid+1, last2 = last; // endpoints of second subarray 
		int index = first1; // next index open in temp array

		//	Copy smaller item from each subarray into temp until one

		//	of the subarrays is exhausted

		while (first1 <= last1 && first2 <= last2)		
		{			
			if (Integer.compare(data[first1], data[first2]) < 0)
				
			{			
			temp[index] = data[first1];	first1++;	
			}			
else			
			{	temp[index] = data[first2];	first2++;	
			}			
			
			index++;			
	}			
	//  Copy remaining elements from first subarray, if any	
	while (first1 <= last1)		
	{			
		temp[index] = data[first1];		
		first1++;	index++;		
	}

	// Copy remaining elements from second subarray, if any 
	while (first2 <= last2)
	{
	temp[index] = data[first2]; first2++; index++;
	}
	// Copy merged data into original array for 
	for (index = first; index <= last; index++)
		data[index] = temp[index];
} 

    //Quick Sort Stuff
    public int array[];
    public int length;
  
    public void quickSort(int[] arr1) {
    	long startTime = System.nanoTime();
        
    	if (arr1 == null || arr1.length == 0) {
            return;
        }
        this.array = arr1;
        length = arr1.length;
        sort(0, length - 1);
        
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println();
        System.out.println("The duration of QuickSort is:" + duration);
    }
 
    private void sort(int low, int high) {
         
        int i = low;
        int j = high;
        // calculates the middle number
        int mid = array[low+(high-low)/2];
        // splits it into two arrays
        while (i <= j) {
            
            while (array[i] < mid) {
                i++;
            }
            while (array[j] > mid) {
                j--;
            }
            if (i <= j) {
                swap2(i, j);
                	i++;
                	j--;
            }
        }
        // recursively calls the sort method
        if (low < j)
            sort(low, j);
        if (i < high)
            sort(i, high);
    }
	  
	// This is where the array gets filled
	public int[] fillArray(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int) (Math.random()*100 + 1);
		}
		
		return arr;
	}
	
	//The Swap Method
    private static void swap(int[] array, int a, int b) {
    	 
        int temp;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    //The 2nd Swap method
    private void swap2(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



	//prints array
    public static void traverse(int[] arr){
    	for(int i = 0; i < arr.length; i++){
    		System.out.print(arr[i] + " ");
    	}
    }
}
