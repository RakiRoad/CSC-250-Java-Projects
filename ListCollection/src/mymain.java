import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;
import java.util.Collections;


public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		ArrayList<Integer> blub = new ArrayList<Integer>();
		LinkedList<String> stack1 = new LinkedList<String>();
		stack1.add("Rocky");
		stack1.add("213");
		stack1.add("523");
		 for (int i = 0; i < 100; i++)
		    {
		        mylist.add(random.nextInt(100));
		        blub.add(random.nextInt(5));
		        
		    }
		 for (int i = 0; i < 5; i++)
		    {
		       // mylist.add(random.nextInt(100));
		        blub.add(random.nextInt(5));
		        
		    }
		 System.out.println("Original list: " +mylist);
		 
		 long startTime1 = System.nanoTime();
		 TreeSet sortedSet= new TreeSet<Integer>(mylist);
		 System.out.println("Sorted list: "+sortedSet);
		 long endTime1 = System.nanoTime();
	     long duration1 = endTime1-startTime1;
	     
	     System.out.println("The duration of Treeset is:" + duration1);
		 
	     System.out.println();
	     long startTime2 = System.nanoTime();
		 ArrayList<Integer> copy1 = (ArrayList<Integer>)mylist.clone();
		 long endTime2 = System.nanoTime();
	     long duration2 = endTime2-startTime2;
	     
	     System.out.println("The duration of copying is:" + duration2);
		 
	     System.out.println();
	     long startTime3 = System.nanoTime();
		 Collections.reverse(copy1);
		 System.out.println("Clone sorted in reversed: " + copy1);
		 long endTime3 = System.nanoTime();
	     long duration3 = endTime3-startTime3;
	     
	     System.out.println("The duration of reversing is:" + duration3);
		 
	     System.out.println();
		 long startTime4 = System.nanoTime();
		 if(mylist.containsAll(copy1)){
			 System.out.println("Does contain all.");
			 
		 }
		 else{
			 System.out.println("Does not contain all.");
		 }
		 long endTime4 = System.nanoTime();
	     long duration4 = endTime4-startTime4;
	     
	     System.out.println("The duration of contains all is:" + duration4);
		 
		 //long startTime5 = System.nanoTime();
	     System.out.println();
	     System.out.println("Iteration");
		 Iterator<Integer> itr = mylist.iterator();
		 	while(itr.hasNext()){
		 		System.out.println(itr.next());
		 	}
		 	//long endTime5 = System.nanoTime();
		     //long duration5 = endTime5-startTime5;
		     //System.out.println();
		     //System.out.println("The duration of iterator is:" + duration5);
		 System.out.println();	
		 long startTime6 = System.nanoTime();
		 System.out.println(stack1);
		 stack1.push("Same");
		 System.out.println("After Push Operation: ");
		 System.out.println(stack1);
		 stack1.pop();
		 System.out.println("After the Pop Operation: ");
		 System.out.println(stack1);
		 long endTime6 = System.nanoTime();
	     long duration6 = endTime6-startTime6;
	     System.out.println();
	     System.out.println("The duration of showcasing stack is:" + duration6);
			 
		 
	}
	

}
