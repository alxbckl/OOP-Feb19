package com.comcave.chat.IO;

import com.comcave.tools.Colors;

import java.io.BufferedWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class Transmitter extends Thread {
    private BufferedWriter transmitter;
    private Scanner sc;
    private String output;

    public Transmitter(BufferedWriter transmitter) {
        this.transmitter = transmitter;
        this.sc = new Scanner(System.in);
    }

    @Override
    public void run() {
        while(true) {
            try {
                // Read answer from console
                output = sc.nextLine();

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
