package pack_test2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Surprise {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(format.format(new Date()));
    }
}
