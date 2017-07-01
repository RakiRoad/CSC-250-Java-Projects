package november5assignment;

import java.util.*;


public class TheMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> listOfList = new ArrayList<List<String>> (5);
		String [][]hi={{"Ralph", "Quinto", "Brown", "123", "ABC"},{"Rocky", "Carlos","Blue", "456","fre"},{"MR", "Meme","Green", "788", "POT"},
				{"Dave", "London", "Grey", "689","WQM"},{"Monkey","Luffy","Black","111", "ONE"}};
		
		int size =5;
	for (int i=0; i<size;i++)
	{
		LinkedList<String> arr1 = new LinkedList<String>();
		for (int j=0; j<size; j++)
		{
			arr1.add(hi[i][j]);
		}
		listOfList.add(arr1);	
		//arr1.clear();
	}
	  // System.out.println(listOfList.get(0));
	java.util.Scanner scan = new Scanner(System.in);
	//System.out.println("Enter two values: ");
	
	//String one = scan.nextLine();
	
	/*if (one=="Ralph")
	{
		System.out.println(listOfList.get(0));
	}
	else if(one=="Rocky")
	{
		System.out.println(listOfList.get(1));
	}
	else if(one=="MR")
	{
		System.out.println(listOfList.get(2));
	}
	else if (one=="Dave")
	{
		System.out.println(listOfList.get(3));
	}
	else if (one=="Monkey")
	{
		System.out.println(listOfList.get(4));
	}
	*/
	if (listOfList.get(0).contains("Ralph"))
	{
		System.out.println(listOfList.get(0));
	}
	if(listOfList.get(1).contains("Rocky"))
	{
		System.out.println(listOfList.get(1));
	}
	if(listOfList.get(2).contains("MR"))
	{
		System.out.println(listOfList.get(2));
	}
	if (listOfList.get(3).contains("Dave"))
	{
		System.out.println(listOfList.get(3));
	}
	if (listOfList.get(4).contains("Monkey"))
	{
		System.out.println(listOfList.get(4));
	}
	//--------------------------------------------------
	if (listOfList.get(0).contains("Ralph"))
	{
		listOfList.remove(0);
	}
	/*if(listOfList.get(1).contains("Rocky"))
	{
		listOfList.remove(1);
	}
	if(listOfList.get(2).contains("MR"))
	{
		listOfList.remove(2);
	}
	if (listOfList.get(3).contains("Dave"))
	{
		listOfList.remove(3);
	}
	if (listOfList.get(4).contains("Monkey"))
	{
		listOfList.remove(4);
	}*/
	  /* Iterator<List<String>> itr = listOfList.iterator();
	   while(itr.hasNext()){
	 		System.out.println(itr.next());
	 	}*/
	}
	
  
}
