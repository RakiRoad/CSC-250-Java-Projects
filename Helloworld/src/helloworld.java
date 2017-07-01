import java.io.*;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="C:\\Users\\Rocky\\Documents\\helloworldtemp.txt";
		String line=null;
	try{
		FileReader fileReader= new FileReader(fileName);
		
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		
		while((line=bufferedReader.readLine()) != null){
			System.out.println(line);
		}
	bufferedReader.close();
	}
	catch(FileNotFoundException ex){
		System.out.println("Unable to open file'" + fileName + "'");

	}
	catch(IOException ex){
		System.out.println("Error reading file'" + fileName + "'");
	
	}
	}

}
