package pack_test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewTimeJDK8Test {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);//默认格式  2020-07-01

        System.out.println(date.withMonth(5));//临时修改某个字段
        System.out.println(date);

        LocalTime time=LocalTime.now();
        System.out.println(time+"_____"+time.getNano());//默认格式  16:23:53.532

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);//默认格式  2020-07-01T16:23:53.532
    }


}
