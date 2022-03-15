package sockets.simple;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class DClientSocket {

    public static void main(String[] args) throws UnknownHostException, IOException {
         try (Socket socket = new Socket("localhost",8092);
              DataOutputStream dos = new DataOutputStream(socket.getOutputStream())){
             dos.writeUTF("Hola soy socket's client");
             dos.writeUTF("salir");
        }



    }
}
