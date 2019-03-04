package com.comcave.chat.server;

import com.comcave.tools.Colors;

import java.util.Scanner;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import static java.lang.System.out;

public class Server {
    public static void main(String[] args) throws Exception {
        // Define scanner
        Scanner sc;

        // Define server, input and output streams
        ServerSocket listener = null;
        Socket connection;
        BufferedReader reciever;
        BufferedWriter transmitter;
        String input;
        String output;

        // Try to open a new socket
        try {
            listener = new ServerSocket(8080);
        }
        catch (Exception e) {
            out.println(e);
            System.exit(1);
        }

        // Try to accept new requests
        try {
            out.println(Colors.GREEN + "Server is waiting ..." + Colors.RESET);

            // Wait for a connection and accept it
            connection = listener.accept();

            // New connection recieved
            out.println(Colors.CYAN + "New connection!" + Colors.RESET);

            // Open input and output streams
            reciever = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            transmitter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
            sc = new Scanner(System.in);

            // Start communicating
            while(true) {
                // Read the recieved data
                out.print(Colors.BLUE + "Client: " + Colors.RESET);
                input = reciever.readLine();

                // Print it to the console
                out.println(input);

                // Check if the connection should be terminated
                if(input.equalsIgnoreCase("quit")) {
                    transmitter.write(Colors.RED + "Connection terminated!" + Colors.RESET);
                    transmitter.newLine();
                    transmitter.flush();

                    out.println(Colors.RED + "Connection terminated!" + Colors.RESET);

                    break;
                }

                // Read answer from console
                out.print(Colors.GREEN + "Server: " + Colors.RESET);
                output = sc.nextLine();

                // Send answer
                transmitter.write(output);
                // Send sign, that answer is finished
                transmitter.newLine();
                // Delete data from buffer
                transmitter.flush();
            }
        }
        catch (Exception e) {
            out.println(e);
            System.exit(1);
        }
    }
}
