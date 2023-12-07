package mindera.bootcamp.exercises.InspiringQuoteServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(8083);

        InetAddress DestinyIPAdress = InetAddress.getByName("127.0.0.1");
        int port = 8080;

        String message = readFromConsole("Input Message");
        byte[] sendData = message.getBytes();

        DatagramPacket packetToSend = new DatagramPacket(sendData, sendData.length, DestinyIPAdress, port);
        socket.send(packetToSend);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivedPacket = new DatagramPacket(receiveData, receiveData.length);

        socket.receive(receivedPacket);

        String response = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println(response);


    }

    public static String readFromConsole(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return reader.readLine();
    }


}
