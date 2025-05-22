import javax.swing.text.DateFormatter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {

        // How to work with Dates and Times using Java
        // ( LocalDate , LocalTime , LocalDateTime , uTC timestamp )

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now() ;
        LocalDateTime dat = LocalDateTime.now();
        Instant instance = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dat);
        System.out.println(instance);

        System.out.println();

        // Custom format

        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format((formatter));

        System.out.println(newDateTime);

        // Custom Date , Time object

        LocalDate date1 = LocalDate.of(2025,12,25);
        LocalDateTime time1 = LocalDateTime.of(2024,12,25,12,0,0);

        System.out.println(date1);
        System.out.println(time1);

        System.out.println();

        if(date1.isBefore(date)){
            System.out.println(date1 + " is earlier than " + date);
        } else if (date1.isAfter(date)) {
            System.out.println(date +" is later than " + date1);
        } else if(date1 == date)
            System.out.println(date + " is equal to " + date1);



    }
}
