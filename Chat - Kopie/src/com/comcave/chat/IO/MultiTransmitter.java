package com.comcave.chat.IO;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiTransmitter extends Thread {
    private Scanner sc;
    private String output;
    private ArrayList<Transmitter> transmitters;

    public MultiTransmitter(Transmitter transmitter) {
        this.transmitters.add(transmitter);
    }

    @Override
    public void run() {
        while(true) {
            try {
                // Read answer from console
                output = sc.nextLine();

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
}
