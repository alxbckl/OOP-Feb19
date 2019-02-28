package com.comcave.chat.server;

import com.comcave.chat.server.Connection;
import com.comcave.tools.Colors;

import java.util.Scanner;

import java.net.ServerSocket;
import java.net.Socket;

import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import static java.lang.System.out;

public class MultiServer {
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
        int clientNumber = 0;

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
            // And open a new thread
            while(true) {
                connection = listener.accept();
                new Connection(connection, clientNumber++).start();
            }
        }
        catch (Exception e) {
            out.println(e);
            System.exit(1);
        }
    }
}
