import java.util.*;
import java.time.*;
public class hi
{
       public static void main(String args[])
    {
        LocalTime lt= LocalTime.now();
        System.out.println("local time: "+lt);
        LocalDate ld= LocalDate.now();
        System.out.println("local date: "+ld);
        LocalTime lt1=LocalTime.of(2,35,45);
        System.out.println("local time: "+lt1);
        LocalDate ld1= LocalDate.of(2004,8,18);
        System.out.println("local date: "+ld1);
        Instant i= Instant.now();
        System.out.println("instant : "+i);
        LocalDateTime ld2= LocalDateTime.now();
        System.out.println("current year: "+ld2.getYear());
        System.out.println("current month : "+ld2.getMonth());
       // System.out.println("current day of the month :"+ld2.getDayOfMonth());
        //System.out.println("current month:" +ld2.getMonthValue());
        //System.out.println("current day of the week: "+ld2.getDayOfWeek());
        //System.out.println("current day of the year: " +ld2.getDayOfYear());*/
    }
}