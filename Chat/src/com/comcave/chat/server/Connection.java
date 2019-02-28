package com.comcave.chat.server;

import com.comcave.tools.Colors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.Socket;

import java.util.Scanner;

import static java.lang.System.out;

public class Connection extends Thread{
    private int clientNumber;
    private Socket connection;
    private Scanner sc;
    private String input;
    private String output;

    public Connection(Socket connection, int clientNumber) {
        this.clientNumber = clientNumber;
        this.connection = connection;

        System.out.println("New connection with client " + Colors.CYAN + this.clientNumber + Colors.RESET + " at " + Colors.CYAN + connection + Colors.RESET);
    }

    @Override
    public void run() {
        try {
            // Open input and output streams
            BufferedReader reciever = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter transmitter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
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
            System.out.println(e);
            System.exit(4);
        }
    }

}



