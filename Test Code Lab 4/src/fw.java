
import java.io.*;

public class fw {
	
	public fw(String fname){
		String[] firstName= fname.split(" ");
        String[] lastName = fname.split(" ");
        String[] Pnumber = fname.split(" ");
        String[] s2=Pnumber[2].split("-");
        int num1 = Integer.parseInt(s2[0]);
        int num2 = Integer.parseInt(s2[1]);
        int num3 = Integer.parseInt(s2[2]);
		
        System.out.println("First Name: " + firstName[0] 
                + "\n" +"Last Name: " + lastName[1] + "\n" + 
               "Phone number in integer: " + num1 + num2 + num3 + "\n") ;

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="C:\\Users\\Rocky\\Documents\\test.txt";
		BufferedReader Bfr = null;
		String line = "";
		String textSplit = " ";
	    try {

	        Bfr = new BufferedReader(new FileReader(test));
	        while ((line = Bfr.readLine()) != null) {


	        	/*String[] firstName= line.split(textSplit);
                String[] lastName = line.split(textSplit);
                String[] Pnumber = line.split(textSplit);
                String[] s2=Pnumber[2].split("-");
                int num1 = Integer.parseInt(s2[0]);
                int num2 = Integer.parseInt(s2[1]);
                int num3 = Integer.parseInt(s2[2]);
                */
                fw fname = new fw(line);
                /*Lab4 lname = new Lab4(lastName[1]);
                Lab4 phoneNum = new Lab4(Pnumber[2]);*/

	            /*System.out.println("First Name: " + firstName[0] 
	                                 + "\n" +"Last Name: " + lastName[1] + "\n" + 
	                                "Phone number in integer: " + num1 + num2 + num3 + "\n") ;

*/
	        }
	    }
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file'" + test + "'");

		}
		catch(IOException ex){
			System.out.println("Error reading file'" + test + "'");
		
		}
	}
	
}

