package ptask2;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTypeAPI {

    public static void main(String[] args) {

        Date legacyDate = new Date();
        System.out.println("Legacy Date: " + legacyDate);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.APRIL, 27, 10, 30, 0);
        Date calendarDate = calendar.getTime();
        System.out.println("Legacy Calendar Date: " + calendarDate);

        LocalDate localDate = LocalDate.now();
        System.out.println("Modern LocalDate: " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Modern LocalDateTime: " + localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Formatted Modern LocalDateTime: " + formattedDateTime);

        LocalDateTime fromLegacyDate = legacyDate.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDateTime();
        System.out.println("Converted from Legacy Date to LocalDateTime: " + fromLegacyDate);

        Date fromLocalDateTime = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println("Converted from LocalDateTime to Legacy Date: " + fromLocalDateTime);
    }
}
