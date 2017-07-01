import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Document extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="C:\\Users\\Rocky\\Documents\\test.txt";
		BufferedReader Bfr = null;
		String line = "";
		
	    try {

	        Bfr = new BufferedReader(new FileReader(test));
	        while ((line = Bfr.readLine()) != null) {

	        	
	        		if( line.compareToIgnoreCase("U") != 0
	        		&& line.compareToIgnoreCase("C") != 0
	        		&& line.compareToIgnoreCase("P") != 0 )
	        		throw new InvalidDocumentCodeException();
	        		
	        }
	    }
	        	catch(InvalidDocumentCodeException e){
	        		System.out.println("Exception found");

	        		}
		catch(FileNotFoundException ex){
			System.out.println("Unable to open file'" + test + "'");

		}
		catch(IOException ex){
			System.out.println("Error reading file'" + test + "'");
		
		}


	}

}
