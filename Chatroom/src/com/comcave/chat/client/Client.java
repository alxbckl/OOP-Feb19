package com.comcave.chat.client;

import java.util.ArrayList;
import java.util.Scanner;

import com.comcave.chat.UI.UI;

public class Client {
    private String name;
    private ArrayList connections;
    private Scanner sc;

    public Client() {
        this.sc = new Scanner(System.in);
    }
    private void start() {
        this.name = readName();
        this
    }

    private String readName() {
        UI.print("Enter a name: ", false);
        return sc.nextLine();
    }
    public static void main(String[] args) {
        new Client().start();
    }
}
