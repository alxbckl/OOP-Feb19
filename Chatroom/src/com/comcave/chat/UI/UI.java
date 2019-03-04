package com.comcave.chat.UI;

public class UI {
    public static void print(String name, String message, int number) {
        System.out.println(name + ": " + message);
    }
    public static void print(String message, boolean newLine) {
        System.out.print(message + (newLine ? "\n" : null));
    }
}
