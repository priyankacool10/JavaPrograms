public class Consumer implements Runnable{
	Common obj;
	int temp;
	public Consumer(){
		obj = Common.newInstance();
	}
	
	public void run(){
		
			obj.get();
			
		
	}
}