public class Client2 implements Runnable{
	Account account;
	int amount;
	public Client2(int amount){
		this.amount = amount;
		account = Account.newInstance();
	}
	public void run(){
		account.debit(amount);
	}
}