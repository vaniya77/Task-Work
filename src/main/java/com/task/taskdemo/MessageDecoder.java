package com.task.taskdemo;

import java.util.Scanner;

public class MessageDecoder {
    public static void main(String[] args) {

        String path, initialTriplet;
        
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Please enter your path : ");
        path = scanner.nextLine();
        
        System.out.print("Please enter your initial triplet : ");
        initialTriplet = scanner.nextLine();
        
        System.out.println(new MessageFetcher().Message(path,initialTriplet));
    }
}
