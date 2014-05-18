public class Producer implements Runnable{
	Common obj;
	public Producer(){
		obj = Common.newInstance();
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			obj.put(i);
		}
		obj.put(-1);
			
	}
}