public class BankOperation{
	public static void main(String [] args){
		Thread c1 = new Thread(new Client1(200));
		Thread c2 = new Thread(new Client1(200));
		Thread c3 = new Thread(new Client3());
		c1.start();
		c2.start();
		c3.start();
		
	}
}
