import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        // How to read a file using Java (3 popular options)

     // BufferReader + FileReader: Best for reading text files line-by-line
     // FileInputStream: best for binary files (eg: images, audio files)
     // RandomAccessFile: best for read/write specific portions of a large file.


         String filepath = "/Users/saniabhandari/Documents/learningJava/test.txt";

       try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){

          String line;
          while((line = reader.readLine()) != null){
              System.out.println(line);
          }

       } catch (FileNotFoundException e) {
           System.out.println("Could not locate file");
       } catch (IOException e) {
           System.out.println("Something went wrong");
       }


    }
}
