public class ThreadExample implements Runnable{
	public void run(){
		while(true){
			try{
				Thread.sleep(4000);
			}
			catch(InterruptedException e){
				System.out.println("Thread Interrupted");
			}
			System.out.println("Hello World");
		}

	}
	public static void main(String [] args){
		Thread obj = new Thread( new ThreadExample());
		int x=2000;
		try{
			Thread.sleep(x);
		}
		catch(InterruptedException e){
			System.out.println("Interrupt in main.");
		}
		obj.start();
		System.out.println("Hello from main");
		long y= System.currentTimeMillis();
		while(true){
			long z=  System.currentTimeMillis();
			if(z-y==x){
				obj.interrupt();
				break;
			}
		}
		
	}
}