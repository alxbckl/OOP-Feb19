package com.comcave.chat.client;

import com.comcave.tools.Colors;

import java.net.InetAddress;
import java.net.Socket;

import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.util.Scanner;

import static java.lang.System.out;

public class Client {
    public static void main(String[] args) throws Exception{
        // Define scanner
        Scanner sc = null;

        // Define server, input and output streams
        Socket connection = null;
        BufferedWriter transmitter = null;
        BufferedReader reciever = null;
        String input;
        String output;
        String host;

        // Save localhost ip in host - uncomment this, if you host on your computer
        // host = InetAddress.getLocalHost().getHostAddress();
        // Uncomment the following, if you want to connect to the teacher
        host = "10.14.44.170";

        // Try to connect to the server
        try {
            // Send a request to the host on port 8080
            connection = new Socket(host,8080);

            // Send data
            // BufferdWriter: Writes text to a character output stream
            // OutputStreamWriter: Encodes characters into bytes (Charset)
            // OutputStream: Sends output as bytes
            // Create output stream (to send data to the server)
            transmitter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));

            // Create input stream (to recieve data from the server)
            // Recieve data
            // BufferedReader: Reads text from a character-input-stream
            // InputStreamReader: Reads bytes and decodes them into characters (Charset)
            // InputStream: Reads input as bytes
            reciever = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            // Initialize scanner
            sc = new Scanner(System.in);
        }
        catch (Exception e) {
            out.println(e);
            System.exit(2);
        }

        try {
            out.println("Connected to " + Colors.CYAN + host + Colors.RESET );
            while(true) {
                // Get data to send
                out.print(Colors.GREEN + "Client: " + Colors.RESET);
                output = sc.nextLine();

                // Send answer
                transmitter.write(output);
                // Send sign, that answer is finished
                transmitter.newLine();
                // Delete data from buffer
                transmitter.flush();

                // Read the recieved data
                out.print(Colors.BLUE + "Server: " + Colors.RESET);
                input = reciever.readLine();
                // Print to console
                out.println(input);


                // Check if the connection should be terminated
                if(output.equalsIgnoreCase("quit")) {
                    reciever.close();
                    transmitter.close();
                    connection.close();
                    break;
                }
            }
        }
        catch (Exception e) {
            out.println(e);
            System.exit(3);
        }
    }
}
