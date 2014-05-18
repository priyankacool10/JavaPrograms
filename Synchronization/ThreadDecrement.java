public class ThreadDecrement implements Runnable
{
	Counter obj;

	public ThreadDecrement(Counter obj)
	{
	this.obj=obj;
	}

	public void run()
	{
	for ( int i = 0 ; i < 4 ; i++ ) {
	
	obj.dec();
	
	}
	}
}