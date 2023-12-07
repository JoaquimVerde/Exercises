package mindera.bootcamp.exercises.InspiringQuoteServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Server {

    public static void main(String[] args) throws IOException {


        DatagramSocket socket = new DatagramSocket(8080);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivedPacket = new DatagramPacket(receiveData, receiveData.length);

        socket.receive(receivedPacket);

        String message = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println(message);

        String response = returnMessage(message);

        InetAddress ipFromSender = receivedPacket.getAddress();
        int portFromSender = receivedPacket.getPort();

        byte[] reply = response.getBytes();

        DatagramPacket toSend = new DatagramPacket(reply, reply.length, ipFromSender, portFromSender);
        socket.send(toSend);


    }

    public static String returnMessage(String message) throws IOException {
        if (message.equalsIgnoreCase("HIT ME")) {
            //FileReader fileRead = new FileReader("/Users/mindera/Documents/inspirationalDB.txt");
            List<String> phrases = Files.readAllLines(Paths.get("/Users/mindera/Documents/inspirationalDB.txt"));
            int rand = (int) (Math.random() * phrases.size());
            return phrases.get(rand);

        }

        return "unsupported operation";
    }


}
