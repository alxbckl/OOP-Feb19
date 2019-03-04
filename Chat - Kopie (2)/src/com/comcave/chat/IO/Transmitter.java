package com.comcave.chat.IO;

import java.io.BufferedWriter;
import java.util.Scanner;


public class Transmitter extends Thread {
    private BufferedWriter transmitter;
    private Scanner sc;
    private String output;
    private String name;

    public Transmitter(BufferedWriter transmitter, String name) {
        this.transmitter = transmitter;
        this.sc = new Scanner(System.in);
        this.name = name;
    }

    @Override
    public void run() {
        while(true) {
            try {
                // Read answer from console
                output = sc.nextLine();

                // Convert to JSON
                output = "{ \"name\": \"" + name + "\", \"message\": " + output + "}";

                // Send answer
                transmitter.write(output);
                // Send sign, that answer is finished
                transmitter.newLine();
                // Delete data from buffer
                transmitter.flush();
            } catch (Exception e) {
                System.out.println(e);
                System.exit(6);
            }
        }
    }
}
