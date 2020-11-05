package ru.geekbrains.HomeWork10;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final int SERVER_PORT = 5555;
    private static final String SERVER_ADDRESS = "localhost";

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            DataInputStream in  = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String str = reader.readLine();
                            if (str.equalsIgnoreCase("/end")) {
                                break;
                            }
                            out.writeUTF(str);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
