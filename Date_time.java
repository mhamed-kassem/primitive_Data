/*
 * Created by user on 26/09/2016.
 */
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_time {
    public static void main(String[] args){

        Date date = new Date();
        System.out.println(date);

        GregorianCalendar gc=new GregorianCalendar(2009, Calendar.JANUARY,28);
       // gc.add(GregorianCalendar.DATE,1);
        Date d2=gc.getTime();
        System.out.println(d2);

        DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        LocalDate now = LocalDate.now();
        System.out.println(now.toString());

        LocalDate ld=LocalDate.of(1996,4,8);
        System.out.println(ld);
        System.out.println("--------------");

        int boundedYears  =now.compareTo(ld);
        Period age = ld.until(now);
        System.out.println(age.getYears()+"year, "+age.getMonths()+"month, "+age.getDays()+"day"+"~= "+boundedYears);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/M/d");
        System.out.println(dtf.format(ld));


    }
}
