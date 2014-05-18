public class Common{
	private static Common obj;
	public boolean flag=false;
	int data;
	int temp;
		
	private Common(){
	}
	public static Common newInstance(){
		if(obj==null)
			obj = new Common();
		return obj;		
	}
	public synchronized void put(int temp){
		if(flag){
			try{
				System.out.println("data set to: "+data+" Going to sleep");
				
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		data = temp;
		
		flag = !flag;
		notifyAll();
		try {
			Thread.sleep(100);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
			 
	}
	public synchronized void get(){
		while(true){
			System.out.println("Consumer flag is: "+flag);
			if(!flag){
				try{
					wait();
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			temp=data;
			if(temp==-1)
				break;
			System.out.println("Data contains : "+temp);
			flag = !flag;
			notifyAll();
			try {
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}