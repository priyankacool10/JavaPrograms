public class ThreadCheck implements Runnable
{
	Counter obj;

	public ThreadCheck (Counter obj)
	{
	this.obj=obj;
	}
	
	public void run()
	{
	
	int temp;
	for ( int i = 0 ; i < 4 ; i++ ) {
	temp=obj.check();
	System.out.println("Counter Value Is........"+temp); 
	}
	}
} 