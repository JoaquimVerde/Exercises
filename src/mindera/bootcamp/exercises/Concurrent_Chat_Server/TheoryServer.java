package mindera.bootcamp.exercises.Concurrent_Chat_Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TheoryServer {

    List<ClientHandler> clientHandlerList;

    public static void main(String[] args) throws IOException {
        TheoryServer theoryServer = new TheoryServer();
        theoryServer.start(8085);
    }

    private void start(int port) throws IOException {
        clientHandlerList = new LinkedList<>();
        ServerSocket serverSocket = new ServerSocket(port);
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true) {
            System.out.println("Listening to connections");
            Socket socket = serverSocket.accept();
            ClientHandler clientHandler = new ClientHandler(socket);
            clientHandlerList.add(clientHandler);
            executorService.submit(clientHandler);
        }
    }

    private void sendClientsMessage(ClientHandler sender, String message) {
        clientHandlerList.stream().filter(clientHandler -> !clientHandler.equals(sender)).forEach(
                clientHandler -> clientHandler.writeMessage(message)
        );
    }



    class ClientHandler implements Runnable {
        private Socket socket;
        private BufferedReader in;
        private PrintWriter out;
        private String clientName;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private String readMessage() {
            try {
                return in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private void sendMessage(String message) {
            sendClientsMessage(this, message);
        }


        private void writeMessage(String message) {
            out.println(message);
            System.out.println("Message sent to client");
        }

        private void askClientName() {
            writeMessage("Your name?");
            clientName = readMessage();
            if (clientName == null || clientName.length() < 4) {
                writeMessage("not valid");
                askClientName();
            }
        }

        private void sendWelcomeMessage() {
            if (clientName != null) {
                writeMessage("Welcome to the chat " + clientName);
            }
        }

        public String getClientName() {
            return clientName;
        }


        @Override
        public void run() {
            askClientName();
            sendWelcomeMessage();
            System.out.println("Client Arrived");
            //sendMessage("Message ack: ");
            String messageFromClient;
            while (socket.isConnected()) {
                System.out.println("Waiting for client Message");
                messageFromClient = readMessage();//blocking
                System.out.println("Message from client: " + messageFromClient);
                sendMessage("\u001B[34m" + clientName + ": " + "\u001B[0m" + messageFromClient);
            }
        }
    }
}
