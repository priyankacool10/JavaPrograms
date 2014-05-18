public class driver{
	public static void main(String[] arg) {
		data obj = new data();
		prod p = new prod(obj);
		cons c = new cons(obj);
		Thread th1 = new Thread(p);
		Thread th2 = new Thread(c);
		th1.start();
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
			
		th2.start();
	}
} 