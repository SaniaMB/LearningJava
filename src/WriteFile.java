import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {

        // How to write file suing Java ( 4 popular options )

//        FileWriter = Good for small or medium-sized text files
//        BufferedWriter = Better performance for large amounts of text
//        PrintWriter = Best for structures data, like reports or logs
//        FileOutputStream = best for binary files (eg : images , audio files)

            String filePath = "/Users/saniabhandari/Documents/Oops/test.txt";   // instead of passing the string literal you could the following
            String textContent = """
                                       I like pizza!\s
                                       It's really good!\s
                                       Buy me one!
                                       BOOTY BOOTY BOOTY
                                       ROCKIN' EVERYWHERE
                                      \s""";

            try(FileWriter writer = new FileWriter("test.txt")) {  // /Users/saniabhandari/Documents/Oops/test.txt OR just put filePath variable
              writer.write(textContent);
                System.out.println("File has been written");
            }catch (FileNotFoundException E){
                System.out.println("Could not locate file location");
            }
            catch (IOException E){
                System.out.println("Could not write file");
            }


    }
}
