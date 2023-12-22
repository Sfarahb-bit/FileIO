package Pack1;
//1. Read File:
//        - Create a Java program that reads a text file named "input.txt."
//        - Use FileReader and BufferedReader to read the contents of the file line by line.
//        - Print each line to the console.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
try{
    FileReader fileReader = new FileReader( "input.txt" );
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line;
    while ((line = bufferedReader.readLine()) != null ){
        System.out.println(line);
    }
} catch (Exception e) {
    System.out.println("Error: File not found");
}
    }
}
