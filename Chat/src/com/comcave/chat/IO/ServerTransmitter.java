package com.comcave.chat.IO;

import java.io.BufferedWriter;
import java.util.Scanner;

public class ServerTransmitter {
    private BufferedWriter transmitter;
    private String output;

    public ServerTransmitter(BufferedWriter transmitter) {
        this.transmitter = transmitter;
    }

    public void send(String output) {
        try {
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
