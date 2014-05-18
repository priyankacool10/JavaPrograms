public class deadlock {
	String id;
	public deadlock(String id) {
		this.id = id;
	}
	public synchronized void method(deadlock objOther) {
		System.out.println("Calling other method for: "+objOther.id);
		objOther.otherMethod();
	}
	public synchronized void otherMethod() {
		System.out.println("hello world");
	}
	public static void main(String[] arg) {
		final deadlock obj = new deadlock("first");
		final deadlock obj2 = new deadlock("second");
		Thread th1 = new Thread (new Runnable() {
			public void run() {
				obj.method(obj2);
			}
		});
		
		Thread th2 = new Thread (new Runnable() {
			public void run() {
				obj2.method(obj);
			}
		});
		th1.start();
		th2.start();
	}
}