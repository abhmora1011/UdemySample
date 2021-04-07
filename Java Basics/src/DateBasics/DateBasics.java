package DateBasics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBasics {

    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat sfc = new SimpleDateFormat("M/d/yyyy hh:mm:ss");

        System.out.println(sfc.format(d));
        System.out.println(d.toString());

    }
}
