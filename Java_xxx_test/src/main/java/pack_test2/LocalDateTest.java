package pack_test2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate downtimeday=LocalDate.parse("2019-11-11");
        System.out.println(today.until(downtimeday, ChronoUnit.DAYS));
    }
}
