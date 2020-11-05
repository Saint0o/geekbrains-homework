package ru.geekbrains.HomeWork10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int SERVER_PORT = 5555;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился...");

            DataInputStream in = new DataInputStream(socket.getInputStream());

            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    break;
                }
                System.out.println("<Server> " + str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
