package com.comcave.chat.client;

import com.comcave.tools.Colors;
import com.comcave.chat.IO.Reciever;
import com.comcave.chat.IO.Transmitter;

import java.net.InetAddress;
import java.net.Socket;

import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import static java.lang.System.out;

public class Client {
    // Define scanner
    Scanner sc;

    // Define server, input and output streams
    Socket connection;
    String host;
    String name;

    private void start() {
        // Save localhost ip in host - uncomment this, if you host on your computer
        // host = InetAddress.getLocalHost().getHostAddress();
        // Uncomment the following, if you want to connect to the teacher
        host = "10.14.44.170";

        // Initialize scanner
        sc = new Scanner(System.in);

        connect();
        readName();
        createTransmitter();
        createReciever();
    }
    public static void main(String[] args) throws Exception{
        Client client = new Client();
        client.start();
    }

    private void connect() {
        // Try to connect to the server
        try {
            // Send a request to the host on port 8080
            connection = new Socket(host,8080);
            out.println("Connected to " + Colors.CYAN + host + Colors.RESET);
        }
        catch (Exception e) {
            out.println(e);
            System.exit(2);
        }
    }

    private void createTransmitter() {
        // Send data
        // BufferdWriter: Writes text to a character output stream
        // OutputStreamWriter: Encodes characters into bytes (Charset)
        // OutputStream: Sends output as bytes
        // Create output stream (to send data to the server)
        try {
            new Transmitter(new BufferedWriter(new OutputStreamWriter(connection.getOutputStream())), name).start();
        }
        catch (Exception e) {
            out.println(e);
            System.exit(2);
        }

    }

    private void createReciever() {
        // Create input stream (to recieve data from the server)
        // Recieve data
        // BufferedReader: Reads text from a character-input-stream
        // InputStreamReader: Reads bytes and decodes them into characters (Charset)
        // InputStream: Reads input as bytes
        try {
            new Reciever(new BufferedReader(new InputStreamReader(connection.getInputStream()))).start();
        }
        catch (Exception e) {
            out.println(e);
            System.exit(2);
        }
    }

    private void readName() {
        out.print("Enter a name: ");
        this.name = this.sc.nextLine();
    }
}
