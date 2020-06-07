package com.company;
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        String rawFile = "";
        String[] parsedProduceString = new String[5];
        Produce[] produceOBJArray = new Produce[10];

        Scanner inScanner = new Scanner(System.in);
        File inFile = new File(inScanner.nextLine());
        Scanner fileScanner = new Scanner(inFile);

        while (fileScanner.hasNext()) {
            rawFile = rawFile + fileScanner.nextLine();
        }

        String[] unparsedProduce = rawFile.split("\\|");
        for (int i = 0; i < unparsedProduce.length; i++) {
            parsedProduceString = unparsedProduce[i].split("}");
            String name = parsedProduceString[0];
            String descShort = parsedProduceString[1];
            String descLong = parsedProduceString[2];
            String imgURL = parsedProduceString[3];
            Double date = Double.parseDouble(parsedProduceString[4]);
            produceOBJArray[i] = new Produce(name, descLong, descShort, imgURL, date);
        }


    }
}

