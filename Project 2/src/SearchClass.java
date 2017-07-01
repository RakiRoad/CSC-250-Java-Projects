import java.util.Random;


public class SearchClass extends Begin{
	
	public void Stuff(){
	    int[] pool = new int[1000];       
	    //Generates 1000 Random Numbers in the range 1-100
	    for(int i = 0; i < pool.length; i++) {
	      pool[i] = (int)(Math.random()*100 + 1);
	    }
	    //System.out.println("Numbers Generated: " + Arrays.toString(pool));
	    Random rand = new Random();
	    int Target= rand.nextInt(100)+1;
	}
	
	int linearSearch (int data[], int min, int max, int T target){
		int index = min;
		boolean found = false;
		
		while (!found && index <=max){
			found = data [index]==(target);
			index++;
		}
	if (found == true)
	return index-1;
	}

}
