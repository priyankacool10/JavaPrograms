public class Client1 implements Runnable{
	Account account;
	int amount;
	public Client1(int amount){
		this.amount = amount;
		account = Account.newInstance();
	}
	public void run(){
		account.credit(amount);
	}
}