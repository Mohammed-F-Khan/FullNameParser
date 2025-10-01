package com.pluralsight;

import java.util.Scanner;

public class MainWithSplit {
    public static void main (String[] args) {
        System.out.println("hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String fullname = scanner.nextLine();
        //String fullname = "Mohammed F Khan";

        System.out.println(fullname);

        String[] nameParts = fullname.split(" ");
        String firstName = nameParts[0];

        String middleName;
        String lastName;

        if(nameParts.length == 2){
            middleName = "";
            lastName = nameParts[1];
        }
        else{
            middleName = nameParts[1];
            lastName = nameParts[2];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}