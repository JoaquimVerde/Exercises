package mindera.bootcamp.exercises.Concurrent_Chat_Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TheoryClient {

    static final String SERVER_HOST = "localhost"; //same as 127.0.0.1
    static final int SERVER_PORT = 8085;


    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
        TheoryClient theoryClient = new TheoryClient();
        theoryClient.start(socket);
    }

    private void start(Socket socket) throws IOException {
        BufferedReader serverIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter serverOut = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
        new Thread(() -> {
            String messageFromServer = null;
            try {
                while ((messageFromServer = serverIn.readLine()) != null) {
                    System.out.println(messageFromServer);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        ).start();
        String messageToServer = null;
        while ((messageToServer = consoleIn.readLine()) != null) {
            //System.out.println("Message to sent to server: " + messageToServer);
            serverOut.println(messageToServer);
            //System.out.println("Message sent to server!");
        }
    }


}
