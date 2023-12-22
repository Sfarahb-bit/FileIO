package Pack1;

//- Create a new text file named "output.txt."
//   - Write the following lines to the file:
//     - "Hello, this is line 1."
//     - "Java File I/O is

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WritetoFile {
    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter pw = null;
        try {
 pw = new PrintWriter (new FileOutputStream( "output.txt" ),true);
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
            System.exit( 0 );
        }

        pw.println("Hello, this is line 1.");
        pw.println("Java File I/O is interesting!");
        pw.println("End of the assignment."  );

        pw.close();
    }
}