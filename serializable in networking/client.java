import java.net.Socket;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class client{
	public static void main(String []arg){
		data d1 = new data(12);
		try{
			Socket ob=new Socket("127.0.0.1",4567);
			ObjectOutputStream obj=new ObjectOutputStream(ob.getOutputStream());
			obj.writeObject(d1);
			obj.close();
			ob.close();
		}
		catch(IOException e){
			System.out.println("Error");
		}
		
	}
}


	