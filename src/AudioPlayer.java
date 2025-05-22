import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) {

        // How to play AUDIO with Java (.wav , .au , .aiff)  // Isn't compatible with MP3 files
        //  To play an MP3 file you'll need a external library or framework.

        String filePath = "new-heights-by-pyrosion.wav";  // Relative path instead of absolute path
        File file = new File(filePath);


        try ( Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {  // Helps automatically close objects.
                                                                                     // (If an object uses autocloseable resources)

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

           // clip.start();

            String response = "";

            while(!response.equals("Q")){
                System.out.println("P = play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.nextLine().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("BYE!");
        }


    }
}
