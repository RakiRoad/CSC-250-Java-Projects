import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;



public class User extends Password{
	private Scanner s = new Scanner(System.in);
	//for storage of each line in text file
	private ArrayList<String> linesArray = new ArrayList<String>();
	
	// variables to store parsed values to be stored in objects
	private String[] name = new String[2], temp = new String[3];
	private String phoneNumber = "", street = "", city = "", state = "", zipcode = "", vehicleType = "", vehicleModel = "", vehicleColor = "";
	private Long phoneLong = (long) 0;
	private Integer employeeId = 0, aptNum = 0, vehicleNumber = 0;
	//constructor sets password
	public User(){
		setPassword("csc250");
		fileReader();
	}
	
	//reads file and stores lines in {linesArray}
	public void fileReader(){
		
		String fileName = "D:\\Java\\250\\employees.txt";
		String line = null;
		
		int i;
		try {
			FileReader fileReader = new FileReader(fileName);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) !=null){
				i = 0;
				linesArray.add(i, line);
				i++;
				
			}
			bufferedReader.close();
			
		}catch(FileNotFoundException ex){
			System.out.println("Unable to open file '" + fileName + "'");
		}
		catch(IOException ex){
			System.out.println("Error reading '" + fileName + "'");
		}finally{
			parseLines();
	}
		}

	
	//file writer
	//reads file and stores lines in {linesArray}
	public void fileWriter(){
			String fileName = "D:\\Java\\250\\employees.txt";
	       
	        try {
	            FileWriter fileWriter= new FileWriter(fileName);
	           
	            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
	            for ( String key : Init.employeeHash.keySet() ) {
	    		    bufferedWriter.write( 
	    		    		(((Employee) Init.employeeHash.get(key)).getFirstName() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getLastName()  + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getPhoneNumber()) + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getId() + " " +
	    		    		((Employee) Init.employeeHash.get(key)).getAptNumber() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getStreetAddress() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getCity() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getState()+" " +
	    		    		((Employee) Init.employeeHash.get(key)).getZipcode() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getVehicleType() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getVehicleModel() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getVehicleColor() + " " + 
	    		    		((Employee) Init.employeeHash.get(key)).getVehicleNumber());
	    		   
	    		    bufferedWriter.newLine();
	    		  }
	            
	            bufferedWriter.close();
	        }
	        catch(IOException ex){
	            System.out.println("Error writing tofile " + fileName);
	        }
	    }

	//Parses space seperated segments of a line into appropriate data structures inside a HashMap -> [key]Employee Object name variable, [value]Employee Object
	public void parseLines(){
		
		//Loop for each line stored in linesArray
		for(String d:linesArray){
			phoneNumber = "";
			//Split First Name, Last Name  and Phone Number
			temp = d.split(" ");
			
			//Assign first and second token to name array
			name[0] = temp[0];
			name[1]= temp[1];			
		
			
		//Phone number parse dashes by Reg Ex
		phoneNumber =temp[2].replaceAll("\\D","");
		//convert to Long
		phoneLong = Long.parseLong(phoneNumber);
		
		employeeId = Integer.parseInt(temp[3]);
		aptNum = Integer.parseInt(temp[4]);
		street = temp[5];
		city = temp[6];
		state = temp[7];
		zipcode = temp[8];
		vehicleType = temp[9];
		vehicleModel = temp[10];
		vehicleColor = temp[11];
		vehicleNumber = Integer.parseInt(temp[12]);
		

		//creating Employee Object in temp variable
		Employee tempEmployee = new Employee(name[0],name[1], phoneLong, employeeId, aptNum, street, city, state, zipcode, vehicleType, vehicleModel, vehicleColor, vehicleNumber);
		//storing to employeeHash
		Init.employeeHash.put(tempEmployee.getFirstName() + " " +tempEmployee.getLastName() + " " + tempEmployee.getId(), tempEmployee);
		
	}
	
	}
	
	//Display all employees First and Last Names 
	public void outputEmployees(){
		
		//Output each lines Object Variable Values in a string with proper formatting 
		
		for ( String key : Init.employeeHash.keySet() ) {
			if(key.equals("") || key.equals(null)){
				
			}else{
			System.out.println(key);
		    
			}
		}
		
	}
	public ArrayList<String> matchEmployees(String input){
		
		ArrayList<String> matches = new ArrayList<String>();
		//Output each lines Object Variable Values in a string with proper formatting, returning the keys that contain the param String input
		
		for (String key : Init.employeeHash.keySet() ) {
			//loop through keys, adding keys that contain the inputed parameter to the return arraylist
			if(key.contains(input)){
		    
			matches.add(((Employee) Init.employeeHash.get(key)).getFirstName() + " " + ((Employee) Init.employeeHash.get(key)).getLastName()  + " " + ((Employee) Init.employeeHash.get(key)).getId());
			
			}else if(key.equals("") || key.equals(null)){
				
			}else{
				
			}
		}
		
		return matches;
	}

	//Prints Employee variables from an Employee obj.  parameter used as employeeHash key)
	public void viewEmployee(String key){
		
		System.out.println("\n----------------------------------------------\n" + ((Employee) Init.employeeHash.get(key)).getFirstName()+ " " + ((Employee) Init.employeeHash.get(key)).getLastName() + "\n----------------------------------------------");
		Employee hashRef = ((Employee) Init.employeeHash.get(key));
		String[] keys = {"Phone Number: ", "Employee ID: ","Apartment Number: ","Street Address: ","City: ","State: ","Zipcode: ","Vehicle Type: ","Vehicle Model: ","Vehicle Color: ","Vehicle Number: " };
		Object[] values = {hashRef.getPhoneNumber(), hashRef.getId(), hashRef.getAptNumber(),hashRef.getStreetAddress(),hashRef.getCity(),hashRef.getState(),hashRef.getZipcode(),hashRef.getVehicleType(),hashRef.getVehicleModel(),hashRef.getVehicleColor(), hashRef.getVehicleNumber()};
		
		//Cycle through all getMethods to print to string
		for(int i = 0; i< keys.length;i++){
			System.out.println(keys[i] + values[i].toString());
		}
	}
	//Method for adding an employee
	public void addEmployee(){
		
		//temp vars for creating object
		String firstName = "";
		String lastName = "";
		Long phoneLong = (long) 0;
		Integer employeeId = 0, aptNumber = 0, vehicleNumber = 0;
		String street = "", city = "", state = "", zipcode = "", vehicleType = "", vehicleModel = "", vehicleColor = "";
		
		
		//User input for object
		String[] inputKeys = {"First Name", "Last Name", "[Integers and \"-\"]Phone Number", "[Integers]Employee ID", "[Integers]Apartment Number","Street", "City", "State", "Zipcode", "Vehicle Type","Vehicle Model","Vehicle Color", "[Integers]Vehicle Number"};
		
		Object[] inputValues = {firstName, lastName, phoneLong, employeeId, aptNumber, street, city , state, zipcode, vehicleType, vehicleModel, vehicleColor, vehicleNumber};
		
		for (int i = 0; i<inputValues.length;i++){
			
			System.out.println("Enter " + inputKeys[i] + ": ");
			while(!s.hasNextLine()) s.next();
			
			//if instanceof tree, for handling different data types
			//sets number value to 0 if an incorrect format is entered.
			if(inputValues[i] instanceof String){
				inputValues[i] = s.nextLine().replaceAll("\\D","");
				if(inputValues[i].equals("")||inputValues[i].equals(" ") ){
					inputValues[i] = "NA";
				}
			}else if(inputValues[i] instanceof Integer){
				
				try{
					inputValues[i] = Integer.parseInt(s.nextLine());
				}catch(NumberFormatException e){
					System.out.println("Error: you entered an incorrect format.");
					inputValues[i] = Integer.parseInt("0");
				}	
				
				
					//CHECKING IF AN EMPLOYEE ALREADY EXISTS WITH THE ENTERED ID
				
					//if the value is for Employee ID
					if(inputValues[i] == inputValues[3]){
						//if the returned Array for matches is not null (at least one match was returned given the user input)
						
						if((matchEmployees(Integer.toString((int)inputValues[3]))) != null){
							//counter to keep track of which employee it is comparing
							int counter = 0;
							//For every String in the array containing all matches
							for(String s : matchEmployees(Integer.toString((int)inputValues[3]))){
								counter++;
								//ArrayList for all individual words in the keys returned
								ArrayList<String> allWords = new ArrayList<String>();
								//Splitting each key by spaces and storing into words
								String[] words = s.split(" ");
								
								//For the length of the words array (always 3)
								for(int x = 0; x<words.length; x++){
									//add each individual word to the allWords ArrayList
									allWords.add(words[x]);
								 }
								//For each word in the Arraylist
								for(String n : allWords){
									//if it matches the user input, an employee already exists with that id
									if(n.equals(Integer.toString((int)inputValues[3]))){
										System.out.println("Employee ID already exists: ");
										System.out.println(matchEmployees(Integer.toString((int)inputValues[3])).get(counter-1));
										//return the employee with the id
										return;
									}
								}
							}
						}else{
							
						}
				}
			}else if(inputValues[i] instanceof Long){
				try{
					inputValues[i] = Long.parseLong(s.nextLine().replaceAll("-", ""));
				}catch(NumberFormatException e){
					System.out.println("Error: you entered an incorrect format. Default value set to 0");
					inputValues[i] = Long.parseLong("0");
				}
				
			}else{
				//If another type is entered
				System.out.println("Logic for the instance type has not been created.");
			}
		}
		//create new Object
		Employee tempEmployee = new Employee((String) inputValues[0],(String) inputValues[1], (Long) inputValues[2], (Integer)inputValues[3], (Integer)inputValues[4], (String)inputValues[5], (String)inputValues[6], (String)inputValues[7], (String)inputValues[8], (String)inputValues[9], (String)inputValues[10], (String)inputValues[11], (Integer)inputValues[12]);
		
		//add to HashMap
		Init.employeeHash.put(tempEmployee.getFirstName() + " " + tempEmployee.getLastName() + " " + tempEmployee.getId() , tempEmployee);
		//Write to File
		try{
			fileWriter();
		}catch(Exception e){
			//Display Success Message
			System.out.println("Error occured");
		}
		System.out.println("Done.");
	}
	
}

