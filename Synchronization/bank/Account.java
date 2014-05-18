public class Account{	
	private int balance=1000;
	private int temp;
	private static Account account;
	private Account(){
	}
	public static Account newInstance(){
		if(account==null)
			account = new Account();
		return account;
		
	}
	public  synchronized void  credit(int amount){
		temp = balance + amount;
		balance = temp;
	}
	public  synchronized void  debit(int amount){
		temp = balance - amount;
		balance = temp;
	}
	public synchronized int getBalance(){
		return balance;
	}
	
}