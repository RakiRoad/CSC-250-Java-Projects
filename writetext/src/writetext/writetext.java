
package writetext;

import java.io.*;

public class writetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName= "C:\\Users\\Rocky\\Documents\\helloworldtemp.txt";
		
		try {
			FileWriter fileWriter= new FileWriter(fileName);
			
			BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
			
			bufferedWriter.write("This is a lab assignement for CSC-250");
			bufferedWriter.newLine();
			bufferedWriter.write("This is to check if we can write some text to a file");
			bufferedWriter.close();
		}
		catch(IOException ex){
			System.out.println("Error writing tofile " + fileName);
		}
	}

}
