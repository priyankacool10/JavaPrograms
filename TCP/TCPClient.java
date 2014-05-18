import java.io.*;
import java.net.*;

class TCPClient{
public static void main(String s[])throws Exception
{
Socket soc=new Socket(InetAddress.getLocalHost(),5000);
OutputStream os=soc.getOutputStream();
DataOutputStream dos= new DataOutputStream(os);
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
InputStream is=soc.getInputStream();
DataInputStream dis= new DataInputStream(is);
while(true)
{
System.out.println("Send:");
dos.writeUTF(br.readLine());
System.out.println("Received :"+dis.readUTF(dis));


}
}
}