package ralph;

import java.util.Random;

import ralph.SortClass;
import ralph.SearchClass;

public class MainClass {
	
	
	public static void main(String[] args){
		
		Random rand = new Random();
	    int Target= rand.nextInt(100)+1;
	    
		
		SortClass sc = new SortClass();
		SearchClass oc = new SearchClass();
		int[] pools = sc.getArray();
		int [] original = sc.fillArray(pools);
		int [] search1 = original.clone();
		int [] copy1 = original.clone();
		int [] copy2 = original.clone();
		int [] copy3 = original.clone();
		int [] copy4 = original.clone();
		int [] copy5 = original.clone();
		
		
		
		//System.out.print("Before sorting: ");
		//traverse(pools);
		

		
		/*System.out.println();
		System.out.print("Selection sort: ");
		traverse(copy1);*/
		
		
		/*System.out.println();
		System.out.print("Selection sort: ");
		traverse(copy4); */	
	
		
		System.out.println();
		oc.maxansw(search1);
		//int c = oc.maxansw(copy2);
		//System.out.println();
		//System.out.print("The Max is: " + c);
		
		oc.minansw(search1);
		//int d = oc.minansw(copy2);
		//System.out.println();
		//System.out.print("The Min is: " + d);
		
		System.out.println();
		System.out.println("The Target number is: " + Target);
		
		System.out.println();
		oc.linearSearch(search1, Target);
		//int e = oc.linearSearch(copy1, Target);
		//System.out.println();
		//System.out.print("Using linear search " + e);
		
		System.out.println();
		//oc.binarySearch(search1, Target);
		//int f = oc.binarySearch(copy2, Target);
		//System.out.println();
		//System.out.print("Using binary search " + f);
		
		System.out.println();
		oc.duplicateFind(copy2);
		//boolean g = oc.duplicateFind(copy2);
		//System.out.println();
		//System.out.print("there are duplicates " + g);
		
		//System.out.println();
		//System.out.println(sc.selectionSort(copy4));
		//traverse(copy2);
		
		sc.selectionSort1(copy1);
		//System.out.println("After Sorting: ");
		//traverse(copy1);
		//System.out.println();
		
		sc.InsertionSort(copy2);
		//System.out.println("After Sorting: ");
		//traverse(copy2);
		//System.out.println();
		
		sc.bubbleSort(copy3);
		//System.out.println("After Sorting: ");
		//traverse(copy3);
		//System.out.println();
		
		sc.quickSort(copy4);
		//System.out.println("After Sorting: ");
		//traverse(copy4);
		//System.out.println();
		
		sc.mergeTime(copy5,0,copy5.length-1);
		//System.out.println("After Sorting: ");
		//traverse(copy5);
		//System.out.println();
		System.out.println();
		oc.binarySearch(copy4, Target);
		
		
	}
	
	public static void traverse(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
}
