package com.comcave.chat.IO;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiTransmitter extends Thread {
    private Scanner sc;
    private String output;
    private ArrayList<ServerTransmitter> transmitters;

    public MultiTransmitter() {
        this.transmitters = new ArrayList<ServerTransmitter>();
        this.sc = new Scanner(System.in);
    }

    @Override
    public void run() {
        while(true) {
            try {
                // Read answer from console
                output = sc.nextLine();

                output = "{ \"name\": \"" + "Server" + "\", \"message\": " + output + "}";

                // Send answer
                for(int i = 0; i < transmitters.size(); i++) {
                    transmitters.get(i).send(output);
                }
            } catch (Exception e) {
                System.out.println(e);
                System.exit(6);
            }
        }
    }

    public void addTransmitter(ServerTransmitter transmitter) {
        this.transmitters.add(transmitter);
    }
}
