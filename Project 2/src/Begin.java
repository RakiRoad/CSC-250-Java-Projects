import java.util.Arrays;
import java.util.Random;


public class Begin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] pool = new int[1000];       
	    //Generates 1000 Random Numbers in the range 1-100
	    for(int i = 0; i < pool.length; i++) {
	      pool[i] = (int)(Math.random()*100 + 1);
	    }
	    //System.out.println("Numbers Generated: " + Arrays.toString(pool));
	    Random rand = new Random();
	    int Target= rand.nextInt(100)+1;
	}

}
