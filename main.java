import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class main
{

    public static void GetTime()
    {
        int second, minute, hour;
        GregorianCalendar date = new GregorianCalendar();
        second = date.get(Calendar.SECOND);
        minute = date.get(Calendar.MINUTE);
        hour = date.get(Calendar.HOUR);

        System.out.println("Hora atual: " +hour+":"+minute+":"+second);

    }

    public static void main(String[] args)
    {
        GetTime();
    }
}
