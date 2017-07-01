
import java.io.*;

public class Lab4 {
	
	public Lab4(String fname){
		String[] firstName= fname.split(" ");
        String[] lastName = fname.split(" ");
        String[] Pnumber = fname.split(" ");
        String[] Adressnum=fname.split(" ");
        String[] s2=Pnumber[2].split("-");
        String numbers = s2[0]+s2[1]+s2[2];
        long num1 = Long.parseLong(numbers);
      
		
        System.out.println("First Name: " + firstName[0] 
                + "\n" +"Last Name: " + lastName[1] + "\n" + 
               "Phone number in long: " + num1 + "\n") ;

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="C:\\Users\\Rocky\\Documents\\test.txt";
		BufferedReader Bfr = null;
		String line = "";
		
	    try {

	        Bfr = new BufferedReader(new FileReader(test));
	        while ((line = Bfr.readLine()) != null) {


	        	Lab4 fname = new Lab4(line);
                
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

