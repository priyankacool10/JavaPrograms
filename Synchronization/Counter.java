public class Counter
{
	int counter;

	public Counter()
	{
	counter=5;
	}

	public  void inc()
	{
	System.out.println("Counter Before Increment is :"+ counter);
	counter++;
	System.out.println("Counter After Increment Is::::::"+counter);
	try {
		Thread.sleep(2000);
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	public void  dec()
	{
	System.out.println("Counter before decrement Is::::::"+ counter);
	counter--;
	System.out.println("Counter after decrement Is::::::"+ counter);
		try {
		Thread.sleep(2000);
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	public  int check()
	{
	return counter;
	}
}
