package singleton;

public class StartPoint {

	public static void main(String[] args) {
		
		GoFSingelton singelton = GoFSingelton.getInstance("First Obj!!");
		
		GoFSingelton singelton2 = GoFSingelton.getInstance("Secong Obj");
		
		System.out.println("\n If you see the same value, then the Singelton is successfully applied! "+"\n" + "\n else there is a problem! \n");
		
		System.out.println(singelton.testVar);
		System.out.println(singelton2.testVar);
	}
	
}
