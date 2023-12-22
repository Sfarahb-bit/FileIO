package Pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendtoFile {
    public static void main(String[] args) {
        PrintWriter pw = null;
        Scanner sc = null;
        String text;

            try {
                sc = new Scanner( new FileInputStream( "output.txt" ) );
                pw= new PrintWriter( new FileOutputStream( "output.txt",true  ) );
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                System.exit( 0 );
            }
            while(sc.hasNext()){
                text = sc.nextLine();
                System.out.println(text);
            }

           pw.println("Appending new line.");
           pw.println("File I/O without buffers.");

        while(sc.hasNext()){
            text = sc.nextLine();
            System.out.println(text);
        }


           pw.close();
           sc.close();


    }
}
