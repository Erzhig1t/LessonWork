package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Song song = new Song();

        try( FileWriter writer = new FileWriter("Nothing else matters.txt");) {
            writer.write(song.setTitle("Nothing else matters"));
            writer.write(song.setAuthor("Metallica"));
            writer.write(song.setText("So close, no matter how far\n," +
                    "Couldn't be much more from the heart\n" +
                    "Forever trusting who we are\n" +
                    "And nothing else matters\n" +
                    "Never opened myself this way\n" +
                    "Life is ours, we live it our way\n" +
                    "All these words I don't just say\n" +
                    "And nothing else matters"));
        }catch (IOException e){
            System.out.println("Something is wrong");
        }

        try(FileReader read = new FileReader("Nothing else matters.txt")){
            Scanner scanner = new Scanner(read);
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch(IOException e){
            System.out.println("Something is wrong2");
        }

    }



}