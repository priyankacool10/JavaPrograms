import java.net.Socket;
import java.net.ServerSocket;
import java.io.ObjectInputStream;
import java.io.IOException;
public class server{
	public static void main(String []arg)
	{
		data d1=null;
		ServerSocket obs=null;
		try{
			obs=new ServerSocket(4567);
		}
		catch(IOException e){
			System.out.println("didnt get host"+e);
		}
		try{		
			Socket ob=obs.accept();
			ObjectInputStream obj=new ObjectInputStream(ob.getInputStream());
			d1 = (data)obj.readObject();
			System.out.println(d1.getvalue());
			ob.close();
			obs.close();
		}
		catch(IOException|ClassNotFoundException e){
			System.out.println("error"+e);
		}
	}
}