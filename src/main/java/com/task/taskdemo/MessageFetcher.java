package com.task.taskdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class MessageFetcher {
    HashMap<String, Triplet>  connectedTriplet = new HashMap<>();
    Triplet t;
    String result;
    public String Message(String path, String initialTriplet)
    {

        try {
            File encodedtext = new File(path);
            Scanner myReader = new Scanner(encodedtext);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] splitTriplet = data.split("#");
              connectedTriplet.put(splitTriplet[0], new Triplet(splitTriplet[0],splitTriplet[1],splitTriplet[2]));

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        t= connectedTriplet.get(initialTriplet);
        result = t.getMessage();

        while(connectedTriplet.get(t.getreverse())!=null)
        {

            result = result + connectedTriplet.get(t.getreverse()).getMessage();
            t = connectedTriplet.get(t.getreverse());

        }

            return result;
    }

}


