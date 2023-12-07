package mindera.bootcamp.exercises.SingleClientChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket("127.0.0.1", 7779);

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


        //String message = readFromConsole("Input Message");
        String message = "";

        while (!message.equalsIgnoreCase("exit")) {

            message = readFromConsole("Input Message");

            out.println(message);
            System.out.println(in.readLine());

        }
        System.out.println("end communication");
        in.close();
        out.close();
        clientSocket.close();
    }

    public static String readFromConsole(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return reader.readLine();
    }
}
