package com.company;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashSetWithWords words = new HashSetWithWords();
        try {
            File readFile = new File("readFile.txt");
            FileWriter writeFile = new FileWriter("writeFile.txt");
            Scanner reader = new Scanner(readFile);
            while (reader.hasNextLine()){
                String string = reader.nextLine();
                words.divideText(string);
            }
            writeFile.write(words.toWordsString());
            writeFile.close();
        } catch (IOException e){
            System.out.println("An error");
            e.printStackTrace();
        }
    }
}
