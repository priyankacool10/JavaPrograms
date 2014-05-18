public class Client3 implements Runnable{
	Account account;
	public Client3(){
		account = Account.newInstance();
	}
	public void run(){
		System.out.println("Balance is: "+account.getBalance());
	}
}