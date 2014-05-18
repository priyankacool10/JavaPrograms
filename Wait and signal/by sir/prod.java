import java.util.Date;
import java.util.Random;

public class prod implements Runnable {
	Random rand;
	data obj;
	
	public prod(data obj) {
		rand = new Random(new Date().getTime());
		this.obj = obj;
	}
	public void run() {
		for ( int i = 0 ; i < 5 ; i++ ) {
			int val = Math.abs(rand.nextInt()%10000);
			try {
				System.out.println("Sleeping for: "+val);
				Thread.sleep(val);
				obj.putData(val);
				System.out.println("I have stored: "+val);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
