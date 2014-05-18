public class Runner{
	public static void main(String [] args){
		Thread th1= new Thread(new Producer());
		Thread th2= new Thread(new Consumer());
		th1.start();
		th2.start();
	}
}