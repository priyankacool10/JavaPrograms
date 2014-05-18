import java.net.ServerSocket;
import java.net.Socket;

import java.io.IOException;
import java.io.ObjectInputStream;

public class server {
        ServerSocket listener;
        Socket clientConn;

        public server(int port) {
                try {
                        listener = new ServerSocket(6667);
                }
                catch (IOException e) {
                        e.printStackTrace();
                        System.exit(1);
                }
        }

        public void start() {
                try {
                        System.out.println("Waiting for connection");
                        clientConn = listener.accept();
                        ObjectInputStream objIn = new ObjectInputStream(clientConn.getInputStream());
                        data obj = (data)objIn.readObject();
                     
                        System.out.println("I received: "+obj.getdata());
                        objIn.close();
                        clientConn.close();
                }
                catch(IOException|ClassNotFoundException e) {
                        System.out.println("Error in transport");
                        e.printStackTrace();
                        System.exit(1);
                }

        }

        public static void main(String[] arg) {
                server srv = new server(6667);
                srv.start();
        }
}
