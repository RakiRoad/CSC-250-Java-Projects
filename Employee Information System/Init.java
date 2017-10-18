import java.util.LinkedHashMap;
import java.util.Scanner;

public class Init {
	
	private static Scanner s = new Scanner(System.in);
	private static boolean hasAdmin = false;
	protected static LinkedHashMap<String,Object> employeeHash = new LinkedHashMap<String,Object>();
	
	public static void main(String[] args) {
			
		//User and Admin Objects
		Admin admin = new Admin();
		User user = new User();
		
		//String for most input
		String input = "";
		
		//initial password loop
		boolean passLoop = true;
		
		//bool to break out of main loop
		boolean isRunning = false;
		
		//int to hold number of attempts at password
		int attempts = 0;
		
		//running loop for password
		while(passLoop){
			attempts++;
			System.out.println("Enter Password: ");
			while(!s.hasNextLine()) s.next();
			input = s.nextLine();
			if(user.getPassword().equals(input)){
				System.out.println("Signed in as User");
				
				hasAdmin = false;
				isRunning = true;
				passLoop = false;
				
			}else if(admin.getPassword().equals(input)){
				System.out.println("Signed in as Admin");
				hasAdmin = true;
				isRunning = true;
				passLoop = false;
			}else if(attempts == 5){
				System.out.println("Too many failed attempts");
				passLoop = false;
			}else{
				System.out.println("You have entered an incorrect password.");
			}
		}
		
		//running loop for all actions
		while(isRunning){
					System.out.println("----------------------------------------------\nActions : all, search, add, edit, delete, exit\n----------------------------------------------");
					while(!s.hasNextLine()) s.next();
					input = s.nextLine();
						if("all".equals(input.toLowerCase())){
							admin.outputEmployees();
							
						}else if("add".equals(input.toLowerCase())){
															
							admin.addEmployee();
							
						}else if("search".equals(input.toLowerCase())){
							
							boolean loop = true;
							
							//Input for HashMap Key/Value Search
							System.out.println("-------\nEnter = FirstName | LastName | FirstName LastName | Employee ID \nSearch:");
							while(loop){
								
								while(!s.hasNextLine()) s.next();
								input = s.nextLine();
								//break out of the loop to back to use other actions 
								if(input.equals("actions")){loop=false;}
								
																
								switch (admin.matchEmployees(input).size()) {
								case 0: 
									System.out.println("No matches found.");
									loop = false;
									break;
									
								case 1:
									System.out.println("One match found.");
									admin.viewEmployee(admin.matchEmployees(input).get(0));
									loop = false;
									break;
									
								default:
									//Output all employees containing String input
									for(String entry : admin.matchEmployees(input)){
										System.out.println(entry);
									}
									//Ask for complete entry from the list of printed lines
									System.out.println("\nEnter Complete Employee Entry: ");
									while(!s.hasNextLine()) s.next();
									input = s.nextLine();
									
									if((employeeHash.get(input)) != null){
										admin.viewEmployee(input);
									}else{
										System.out.println("That employee was not found!\n");							
									}
									loop = false;
									break;
								}
							}
							
							
						}else if("edit".equals(input.toLowerCase())){
											
							boolean loop2 = true;
							
							
							//Checking Admin 
							if(adminCheck(input, admin)){
								input = findEmployee(admin, false);
								
								if(!input.equals("n")){
							
													
									while(loop2){
										System.out.println("\nEnter Key: ");
										while(!s.hasNextLine()) s.next();
										String key = s.nextLine();
										System.out.println("Enter Value: ");
										while(!s.hasNextLine()) s.next();
										String value = s.nextLine();
										
										try{
										admin.editEmployee(input, key, value);
										}catch(NumberFormatException e){
											System.out.println("You entered the wrong format");
										}catch(Exception e){
											System.out.println("Something went wrong");
										}
										
										//break out of edit loop
										loop2 = false;
										
									}
								}
								
							}
								
							
						
						}else if("exit".equals(input.toLowerCase())){
							
							isRunning = false;
						
						}else if("delete".equals(input.toLowerCase())){
							
							//check admin			
							if(adminCheck(input, admin)){
								//find employee and deleting 
								input = findEmployee(admin, true);
							}
							
						}else{
							System.out.println("You did not enter \"all\", \"search\", \"add\", \"edit\", \"delete\", or \"exit\"");
						}
				}
	}
	public static boolean adminCheck(String input, Admin admin){
		//Checking Admin 
		if(hasAdmin){
		  return true;
		}else{
			System.out.println("Enter Admin Password: ");
			while(!s.hasNextLine()) s.next();
			input = s.nextLine();
			if(admin.getPassword().equals(input)){
				return true;
			}else{
				System.out.println("You hava entered an invalid Admin Password");
				return false;
			}
		}
		
	}
	//returns employee Key
	//takes Admin Object and boolean for option to delete employee Key
	public static String findEmployee(Admin admin, boolean delete){
		boolean loop = true;
		
		String input = "";
		//Input for HashMap Key/Value Search
		
		while(loop){
			System.out.println("-------\nEnter = FirstName | LastName | FirstName LastName | Employee ID \nSearch:");
			while(!s.hasNextLine()) s.next();
			input = s.nextLine();
			//break out of the loop to back to use other actions 
			if(input.equals("actions")){loop=false;}
			
											
			switch (admin.matchEmployees(input).size()) {
			case 0: 
				System.out.println("No matches found.");
				loop = false;
				input = "n";
				break;
				
			case 1:
				System.out.println("One match found.");
				admin.viewEmployee(admin.matchEmployees(input).get(0));
				input = (((Employee)employeeHash.get((admin.matchEmployees(input).get(0)))).getFirstName())+ " " + ((Employee)employeeHash.get((admin.matchEmployees(input).get(0)))).getLastName() + " " + ((Employee)employeeHash.get((admin.matchEmployees(input).get(0)))).getId();
				loop = false;
				if(delete){
					admin.deleteEmployee(input);
				}
				
				break;
				
			default:
				//Output all employees containing String input
				for(String entry : admin.matchEmployees(input)){
					System.out.println(entry);
				}
				//Ask for a complete entry from the list of printed lines
				System.out.println("\nEnter Complete Employee Entry: ");
				while(!s.hasNextLine()) s.next();
				input = s.nextLine();
				
				if((employeeHash.get(input)) != null){
					admin.viewEmployee(input);
					if(delete){
						admin.deleteEmployee(input);
					}
					
				}else{
					System.out.println("That employee was not found!\n");							
				}
				
				break;
			}
		}
		
		return input;
	
	}
}