package com.comcave.chat.IO;

import com.comcave.chat.server.MultiServer;
import com.comcave.tools.Colors;

import java.io.BufferedReader;

import org.json.JSONObject;

import static java.lang.System.out;

public class Reciever extends Thread {
    private BufferedReader reciever;
    private String input;
    private JSONObject inputJSON;

    public Reciever(BufferedReader reciever) {
        this.reciever = reciever;
    }

    @Override
    public void run() {
        try {
            while(true) {
                // Read the recieved data
                input = reciever.readLine();

                // Convert input to JSON
                inputJSON = new JSONObject(input);

                // Print it to the console
                out.print(Colors.BLUE + inputJSON.getString("name") + ": " + Colors.RESET);
                out.println(inputJSON.getString("message"));

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
