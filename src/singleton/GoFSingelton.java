package singleton;

public class GoFSingelton {

	public String testVar ;
	public static volatile GoFSingelton instance ;
	
	private GoFSingelton(String val) {
		
		this.testVar = val;
	}
	
	public static GoFSingelton getInstance(String testValue) {
		
		//this for preventing creating 2 instance in the multi-threading case
		GoFSingelton result = instance;
		if(result != null)
			return result;
		
		synchronized(GoFSingelton.class) {
			if(instance == null) {
				instance = new GoFSingelton(testValue);
			}
			
			return instance;
		}
		
		
	}
	
	

}
