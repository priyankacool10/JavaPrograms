public class data {
	int data;
	boolean empty;
	
	public synchronized void putData(int data){
		while(!empty) {
			try {
				System.out.println("Waiting to put in data");
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
	
	public synchronized int getData() {
		while(empty) {
			try {
				System.out.println("Waiting to get data");
				wait ();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty = true;
		notifyAll();
		return data;
	}
}