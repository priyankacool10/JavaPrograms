import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.IOException;

public class client {
	DatagramPacket data;
	public client(int port) {
		byte[] buffer = "Hello world".getBytes();
		InetAddress serverAddress = null;
		try {
			serverAddress  = InetAddress.getByName("127.0.0.1");
		}
		catch (UnknownHostException e) {
			System.out.println("Unable to connect with end system");
			System.exit(1);
		}
		data = new DatagramPacket(buffer, buffer.length, serverAddress, port);	
	}
	public void send() {
		try {
			DatagramSocket serverConnection = new DatagramSocket();
			serverConnection.send(data);
			byte[] buffer2= new byte["ACK".length()];
			DatagramPacket data2=new DatagramPacket(buffer2, buffer2.length);
			serverConnection.receive(data2);
			String mData2 = new String(data2.getData());
			System.out.println("I got: "+mData2);
			serverConnection.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			return;
		}
	}
	public static void main(String[] arg) {
		client obj = new client(6667);
		obj.send();	
	}
}