import java.net.Socket;
import java.io.ObjectOutputStream;
import java.net.UnknownHostException;
import java.io.IOException;

public class client {
        Socket connection;
        int port;
        data mData;

        public client(int port) {
                this.port = port;
                mData = new data(2456);
        }

        public void send() {
                try {
                        connection = new Socket("127.0.0.1",port);

                }
                catch(UnknownHostException e) {
                        System.out.println("Unable to connect with server");
                        e.printStackTrace();
                        return;
                }
                catch(IOException e) {
                        System.out.println("Link error");
                        e.printStackTrace();
                        return;
                }
                try {
                        ObjectOutputStream objOut = new ObjectOutputStream(connection.getOutputStream());
                        objOut.writeObject(mData);
                        System.out.println("Data sent!");
                        objOut.close();
                        connection.close();
                }
                catch (IOException e) {
                }
        }

        public static void main(String[] arg){
                client cObj = new client(6667);
                cObj.send();
        }
}
