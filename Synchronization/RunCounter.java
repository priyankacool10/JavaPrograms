public class RunCounter
{
	public static void main(String [] arg)
	{
	Counter obj=new Counter();
	
	Thread th1=new Thread(new ThreadIncrement(obj));
 	Thread th2=new Thread(new ThreadDecrement(obj));
	Thread th3=new Thread(new ThreadCheck(obj));
	
	th1.start();
	th2.start();
	th3.start();
	}
}