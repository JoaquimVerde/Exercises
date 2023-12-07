package mindera.bootcamp.exercises.SingleClientChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(7779);
        Socket clientSocket = serverSocket.accept();

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        while (!clientSocket.isClosed()) {

            String message = in.readLine();

            if (message == null) {
                continue;
            }
            System.out.println("mensagem do cliente: " + message);
            out.println("message received");

        }

        in.close();
        out.close();
        clientSocket.close();
        //did not close serverSocket because server would always be open.
        //remember to stop running.
    }
}
