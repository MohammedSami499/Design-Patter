package singleton;

public class GoFSingelton {

	public String testVar ;
	
	public static GoFSingelton instance ;
	
	private GoFSingelton(String val) {
		
		
		// this is for slow initialization
		try {
			Thread.sleep(1000);	
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		this.testVar = val;
	}
	
	public static GoFSingelton getInstance(String testValue) {
		
		if(instance == null) {
			instance = new GoFSingelton(testValue);
		}
		
		return instance;
	}
	
}
