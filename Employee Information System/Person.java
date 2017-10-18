
public class Person {
	
	private String fName, lName;
	private Long phoneNum;
	
	public Person(String firstName, String lastName, Long phoneNumber){
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
	}
    //Setters
	public void setFirstName(String string){
		fName = string;
	}
	public void setLastName(String string){
		lName = string;
	}
	public void setPhoneNumber(long phoneNumber){
		phoneNum = phoneNumber;
	}
	
	//Getters
	public Long getPhoneNumber(){
		return phoneNum;
	}
	public String getFirstName(){
		return fName;
	}
	public  String getLastName(){
		return lName;
	}
	
}	
