public class Employee extends Person {
	private Integer employeeId = null, aptNumber = null, vehicleNumber = null;
	private String streetAddress = "", city = "", state = "", zipcode = "", vehicleType = "", vehicleModel = "", vehicleColor = "";
	
		
	public Employee(String firstName, String lastName, Long phoneNumber, Integer id, Integer aptNumber, String street, String city, String state, String zipcode, String vehicleType, String vehicleModel, String vehicleColor, Integer vehicleNumber) {
		//Setting Employee Object variables
		super(firstName, lastName, phoneNumber);
		setId(id);
		setAptNumber(aptNumber);
		setStreetAddress(street);
		setState(state);
		setCity(city);
		setZipcode(zipcode);
		setVehicleType(vehicleType);
		setVehicleModel(vehicleModel);
		setVehicleColor(vehicleColor);
		setVehicleNumber(vehicleNumber);
	}
	
	//Employee Setters
	public void setId(Integer num){
		this.employeeId = num;
	}
	public void setAptNumber(Integer num){
		this.aptNumber = num;
	}
	public void setStreetAddress(String string){
		this.streetAddress = string;
	}
	public void setCity(String string){
		this.city = string;
	}
	public void setState(String string){
		this.state = string;
	}
	public void setZipcode(String string){
		 this.zipcode = string;
	}
	public void setVehicleType(String string){
		this.vehicleType = string;
	}
	public void setVehicleModel(String string){
		this.vehicleModel = string;
	}
	public void setVehicleColor(String string){
		this.vehicleColor = string;
	}
	public void setVehicleNumber(Integer num){
		this.vehicleNumber = num;
	}
	
	//Employee Getters
	public int getId(){
		return this.employeeId;
	}
	public int getAptNumber(){
		return this.aptNumber;
	}
	public String getStreetAddress(){
		return this.streetAddress;
	}
	public String getCity(){
		return this.city;
	}
	public String getState(){
		return this.state;
	}
	public String getZipcode(){
		 return this.zipcode;
	}
	public String getVehicleType(){
		return this.vehicleType;
	}
	public String getVehicleModel(){
		return this.vehicleModel;
	}
	public String getVehicleColor(){
		return this.vehicleColor;
	}
	public int getVehicleNumber(){
		return this.vehicleNumber;
	}
}	

