import java.io.*;
import java.net.*;

class TCPServer{
public static void main(String s[])throws Exception
{
ServerSocket sersoc=new ServerSocket(5000);
Socket soc=sersoc.accept();
InputStream is=soc.getInputStream();
DataInputStream dis = new DataInputStream(is);
OutputStream os=soc.getOutputStream();
DataOutputStream dos=new DataOutputStream(os);
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
while(true)
{
System.out.println("Message : "+dis.readUTF(dis));
System.out.println("Send: ");
dos.writeUTF(br.readLine());
}
}
}