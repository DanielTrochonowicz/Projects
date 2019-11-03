package dataCzasLokalny;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataCzasLokalny {

    public static void main(String[] args) {

//        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId strefa1 = ZoneId.of("Europe/Oslo");
        ZoneId strefa2 = ZoneId.of("America/Los_Angeles");

        System.out.println(strefa1.getRules());
        System.out.println(strefa2.getRules());

        LocalTime local1 = LocalTime.now(strefa1);
        LocalTime local2 = LocalTime.now(strefa2);

        System.out.println(local1);
        System.out.println(local2);

        long roznicaGodziny = ChronoUnit.HOURS.between(local1, local2);
        System.out.println("Roznica w godzinach: " + roznicaGodziny);

        long roznicaMinut = ChronoUnit.MINUTES.between(local1, local2);
        System.out.println("Roznica w minutach: " + roznicaMinut);

        LocalTime czas = LocalTime.of(12,9);
        System.out.println(czas);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(Locale.US);
        LocalTime czas1 = LocalTime.parse("07:37 PM", formatter);

        System.out.println(czas1);

        LocalTime czas2 = local1.minusHours(3);
        LocalTime czas3 = local1.plusMinutes(45);
        System.out.println(czas2);
        System.out.println(czas3);

        LocalDate dzis = LocalDate.now();
        System.out.println(dzis);

        LocalDate jutro = dzis.plusDays(1);
        System.out.println(jutro);

        LocalDate wczoraj = dzis.minusDays(1);
        System.out.println(wczoraj);

        LocalDate dzien = LocalDate.of(2018, Month.MAY, 17);
        LocalDate dzien1 = LocalDate.of(2018, 5, 17);
        System.out.println(dzien);
        System.out.println(dzien1);

        DayOfWeek dzienTygodnia = dzien.getDayOfWeek();
        System.out.println(dzienTygodnia);

//        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
//        LocalDate date1 = LocalDate.parse("03.11.2019", formatter2);
//        System.out.println("Data sformatowana: " + date1);

    }
}
