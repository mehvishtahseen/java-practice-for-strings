package com.company;

public class Main {

    public static void main(String[] args) {
        String message = "I am learning";
        // change the string to lower case
        System.out.println(message.toLowerCase());
        // change the string to upper case
        System.out.println(message.toUpperCase());
        // find the length of the string
        System.out.println(message.length());
        // finds in which index the chosen letter belongs
        System.out.println(message.indexOf("a"));
        //check if the typed message or letter is part of the string if return -1 then no else yes
        System.out.println(message.indexOf("sky"));
        //add to the message or extend the string
        message = message + " java";
        //test if the string has been extended/ modified successfully
        System.out.println(message);
        // replace the message with given input
        System.out.println(message.replace("a", "em"));
        //statement to check if the statement ends with given char / string
        System.out.println(message.endsWith("!!"));
        System.out.println(message.endsWith("a"));
        //print the message
        System.out.println(message);

    }
}
