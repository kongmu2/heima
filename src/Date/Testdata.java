package Date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Testdata {
    @Test
    public void testdate(){
        Date date = new Date();
        System.out.println(date);


        Date date1 = new Date(10000);
        System.out.println(date1);

        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);
    }

    @Test
    public void testClander(){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"), Locale.CHINA));
    }

    @Test
    public void testcalender1(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,2021);
        calendar.set(Calendar.MONTH,3);
        calendar.set(Calendar.DAY_OF_MONTH,2);
        calendar.set(Calendar.HOUR_OF_DAY,9);
        calendar.set(Calendar.MINUTE,4);
        calendar.set(Calendar.SECOND,5);
        System.out.println(calendar.getTime());
        calendar.set(2002,04,03,12,02,02);
        System.out.println(calendar.getTime());
    }
    
    
    @Test
    public void testFormat() throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒");
        String s=format.format(new Date());
        System.out.println(s);
        Date date = format.parse(s);
        System.out.println(date);
    }

    @Test
    public void testdsa() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss", Locale.US);
        String s=format.format(new Date());
        Date date = format.parse(s);
        System.out.println(date);
    }
    
    @Test
    public void testjdk8localdate(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2222, 4, 22);
        System.out.println(localDate1);
        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonthValue());

        LocalDate parse = LocalDate.parse("2002-01-02");
        System.out.println(parse);
    }

    @Test
    public void testlocalTime(){
        System.out.println(LocalTime.now());
        LocalTime of = LocalTime.of(11, 11, 13);
        System.out.println(of);
        LocalTime parse = LocalTime.parse("11:11:11");
        System.out.println(parse);
    }

    @Test
    public void testLocaldatetime(){
        System.out.println(LocalDateTime.now());
        LocalDateTime of = LocalDateTime.of(2012, 12, 21, 12, 22, 22);
        System.out.println(of);
        System.out.println(of.getYear());
        System.out.println(of.getMonthValue());
        System.out.println(of.getDayOfMonth());
        System.out.println(of.getHour());
        System.out.println(of.getMinute());
        System.out.println(of.getSecond());
        System.out.println(LocalDateTime.parse("2022-03-04T11:33:23"));
    }

    @Test
    public void testParse(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String format = LocalDate.now().format(dateTimeFormatter);
        System.out.println(format);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format1 = LocalTime.now().format(dateTimeFormatter1);
        System.out.println(format1);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String format2 = LocalDateTime.now().format(dateTimeFormatter2);
        System.out.println(format2);


        System.out.println(LocalDate.parse(format, dateTimeFormatter));
        System.out.println(LocalTime.parse(format1, dateTimeFormatter1));
        System.out.println(LocalDateTime.parse(format2, dateTimeFormatter2));
    }
}
