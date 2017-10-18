
public class Admin extends User{
	
	public Admin(){
		super();
		setPassword("password");
	}
	
	public void editEmployee(String nameId, String key, Object value){
	
		
		if("phone number".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getPhoneNumber() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setPhoneNumber(Long.valueOf(((String) value).replaceAll("-", "")));
			writeReadRemove(nameId);
			
		}else if("employee id".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getId() != Integer.valueOf((String)value)){
			
			((Employee)Init.employeeHash.get(nameId)).setId(Integer.valueOf((String) value));
			writeReadRemove(nameId);
			
		}else if("apartment number".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getAptNumber() != Integer.valueOf((String)value)){
			
			((Employee)Init.employeeHash.get(nameId)).setAptNumber(Integer.valueOf((String) value));
			writeReadRemove(nameId);
			
		}else if("street address".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getStreetAddress() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setStreetAddress((String) value);
			writeReadRemove(nameId);
			
		}else if("city".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getCity() != value){
			System.out.println("got here");
			((Employee)Init.employeeHash.get(nameId)).setCity((String) value);
			writeReadRemove(nameId);
			
		}else if("state".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getState() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setState((String) value);
			writeReadRemove(nameId);
			
		}else if("zipcode".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getZipcode() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setZipcode((String) value);
			writeReadRemove(nameId);
			
		}else if("vehicle type".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getVehicleType() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setVehicleType((String) value);
			writeReadRemove(nameId);
			
		}else if("vehicle model".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getVehicleModel() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setVehicleModel((String) value);
			writeReadRemove(nameId);
			
		}else if("vehicle color".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getVehicleColor() != value){
			
			((Employee)Init.employeeHash.get(nameId)).setVehicleColor((String) value);
			writeReadRemove(nameId);
			
		}else if("vehicle number".equals(key.toLowerCase()) && ((Employee)Init.employeeHash.get(nameId)).getVehicleNumber() != Integer.valueOf((String)value)){
			
			((Employee)Init.employeeHash.get(nameId)).setVehicleNumber(Integer.valueOf((String)value));
			writeReadRemove(nameId);
			
			
		}else{
			System.out.println("The Key you entered doesn't exist or you did not enter a new Value.\n");
			
		}
		
		
	}
	
	public void writeReadRemove(String nameId){
		
		try{
			fileWriter();
		}catch(Exception e){
			//Display Success Message
			System.out.println("Error occured");
		}
			/*
			Init.employeeHash.remove(nameId);*/
			System.out.println("Done.");
	}
	
	public void deleteEmployee(String nameId){
		//delete from hashMap
		Init.employeeHash.remove(nameId);
		//write to file
		try{
			fileWriter();
		}catch(Exception e){
			//Display Success Message
			System.out.println("Error occured");
		}
		
		System.out.println("\nEmployee Entry Deleted.");
	}

}	

