package com.comcave.chat.IO;

import com.comcave.chat.server.MultiServer;
import com.comcave.tools.Colors;

import java.io.BufferedReader;

import static java.lang.System.out;

public class Reciever extends Thread {
    private BufferedReader reciever;
    private String input;
    private String name;

    public Reciever(BufferedReader reciever, String name) {
        this.reciever = reciever;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while(true) {
                // Read the recieved data
                input = reciever.readLine();

                // Print it to the console
                out.print(Colors.BLUE + name + ": " + Colors.RESET);
                out.println(input);

                // Check if the connection should be terminated
                if(input.equalsIgnoreCase("quit")) {
                    out.println(Colors.RED + "Connection terminated!" + Colors.RESET);

                    break;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
            System.exit(5);
        }
    }
}
