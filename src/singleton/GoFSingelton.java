package singleton;

public class GoFSingelton {

	public String testVar ;
	public static volatile GoFSingelton instance ;
	
	private GoFSingelton(String val) {
		
		this.testVar = val;
	}
	
	public static GoFSingelton getInstance(String testValue) {
		
		//checking wither the object is already initialized or not 
		
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
