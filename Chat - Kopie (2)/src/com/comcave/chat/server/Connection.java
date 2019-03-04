package com.comcave.chat.server;

import com.comcave.chat.IO.MultiTransmitter;
import com.comcave.chat.IO.ServerTransmitter;
import com.comcave.tools.Colors;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.Socket;

import java.util.Scanner;
import com.comcave.chat.IO.Reciever;
import com.comcave.chat.IO.Transmitter;

import static java.lang.System.out;

public class Connection extends Thread{
    private int clientNumber;
    private Socket connection;
    private MultiTransmitter multiTransmitter;

    public Connection(Socket connection, int clientNumber, MultiTransmitter multiTransmitter) {
        this.clientNumber = clientNumber;
        this.connection = connection;
        this.multiTransmitter = multiTransmitter;

        System.out.println("New connection with client " + Colors.CYAN + this.clientNumber + Colors.RESET + " at " + Colors.CYAN + connection.getInetAddress().getHostAddress() + Colors.RESET);
    }

    @Override
    public void run() {
        try {
            // Open input and output streams
            new Reciever(new BufferedReader(new InputStreamReader(connection.getInputStream()))).start();
            multiTransmitter.addTransmitter(new ServerTransmitter(new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()))));
        }
        catch (Exception e) {
            System.out.println(e);
            System.exit(4);
        }
    }

}



