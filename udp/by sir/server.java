import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.io.IOException;

public class server {
	DatagramPacket data;
	
	public server() {
		
		byte[] buffer = new byte["hello world".length()];
		data = new DatagramPacket(buffer, buffer.length);
	}
	public void get() {
		try {
			DatagramSocket socket = new DatagramSocket(6667);
			socket.receive(data);
			String mData = new String(data.getData());
			System.out.println("I got: "+mData);
			socket.close();
		}
		catch (IOException e) {
			System.out.println("Error occurred while receiving data");
			return;
		}
	}
	
	public static void main(String[] arg) {
		server obj = new server();
		obj.get();
	}
}