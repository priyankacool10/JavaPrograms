public class ThreadIncrement implements Runnable
{
	Counter obj;
	public ThreadIncrement(Counter obj)
	{	this.obj=obj;	}
	
	public void run()
	{
	for ( int i = 0 ; i < 4 ; i++ ) {
	
	obj.inc();
		
	}
	}
}