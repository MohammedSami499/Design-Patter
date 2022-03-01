package singleton;

public class StartPoint {

	public static void main(String[] args) {

		System.out.println("\n If you see the same value, then the Singelton is successfully applied! "+"\n" + "\n else there is a problem! \n");
		
		Thread singleton1 = new Thread(new Singleton1());
		Thread singleton2 = new Thread(new Singleton2());
		
		singleton1.start();
		singleton2.start();
		
	}
	
	
	//this for making the 2 process runs synchronously 
	
	static class Singleton1 implements Runnable {

		@Override
		public void run() {
			GoFSingelton singelton = GoFSingelton.getInstance("First Obj!!");
			System.out.println(singelton.testVar);
		}
		
	}
	
	static class Singleton2 implements Runnable {

		@Override
		public void run() {
			GoFSingelton singelton2 = GoFSingelton.getInstance("Secong Obj !!");
			System.out.println(singelton2.testVar);

		}
		
	}
	
}
