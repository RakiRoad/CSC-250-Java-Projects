
public abstract class Password implements Access{
	private String password = null;
	
	public void setPassword(String string){
		this.password = string;
	}
	public String getPassword(){
		return this.password;
	}
	
}
