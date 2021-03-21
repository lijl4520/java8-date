package com.lijl;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;

public class Java8Date {

    public static void main(String[] args) {

        /*Instant now = Instant.now();
        System.out.println(now);
        Instant instant = Instant.ofEpochSecond(60,1000000000);
        System.out.println(instant);*/

        /*LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2021-03-21T15:55:29.267

        LocalDateTime of = LocalDateTime.of(2021, 03, 20, 9, 00, 00);
        System.out.println(of);//2021-03-20T09:00*/

        /*LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();//2021
        System.out.println(year);
        Month month = now.getMonth();//MARCH
        int dayOfMonth = now.getDayOfMonth();//21
        int hour = now.getHour();//16
        int minute = now.getMinute();//8
        int dayOfYear = now.getDayOfYear();//80
        int second = now.getSecond();//32
        DayOfWeek dayOfWeek = now.getDayOfWeek();//SUNDAY*/


        /*LocalDateTime of = LocalDateTime.of(2020, 1, 1, 1, 1,1);
        System.out.println(of);//2020-01-01T01:01:01
        LocalDateTime nextYearTime = of.plusYears(1);
        System.out.println(nextYearTime);//2021-01-01T01:01:01
        LocalDateTime localDateTime = of.minusYears(1);
        System.out.println(localDateTime);//2019-01-01T01:01:01*/

        //使用with方法设置月份
        /*LocalDateTime of = LocalDateTime.of(2021, 2, 1, 1, 1,1);
        LocalDateTime changeTime = of.withMonth(3);
        System.out.println(changeTime);//2021-03-01T01:01:01*/

        //判断当前年份是否闰年
        /*LocalDate now = LocalDate.now();
        System.out.println("isLeapYear :" + now.isLeapYear());//false
        LocalDate of = LocalDate.of(2020, 1, 1);
        System.out.println("isLeapYear :" + of.isLeapYear());//true*/
        /*
        //判断当前日期属于星期几
        LocalDateTime time = LocalDateTime.now();
        DayOfWeek dayOfWeek = time.getDayOfWeek();
        System.out.println(dayOfWeek); //WEDNESDAY*/


        /*LocalDateTime from = LocalDateTime.of(2021, Month.JANUARY, 21, 15, 56, 0);    // 2021-01-21 15:56:00
        LocalDateTime to = LocalDateTime.of(2021, Month.FEBRUARY, 21, 15, 56, 0);     // 2021-02-21 15:56:00
        Duration duration = Duration.between(from, to);     // 表示从 2021-01-21 15:56:00 到 2021-02-21 15:56:00
        long days = duration.toDays();              // 这段时间的总天数
        System.out.println(days);//31
        long hours = duration.toHours();            // 这段时间的小时数
        System.out.println(hours);//744
        long minutes = duration.toMinutes();        // 这段时间的分钟数
        System.out.println(minutes);//44640
        long seconds = duration.getSeconds();       // 这段时间的秒数
        System.out.println(seconds);//2678400
        long milliSeconds = duration.toMillis();    // 这段时间的毫秒数
        System.out.println(milliSeconds);//2678400000
        long nanoSeconds = duration.toNanos();      // 这段时间的纳秒数
        System.out.println(nanoSeconds);//2678400000000000*/


        /*Duration duration1 = Duration.of(10, ChronoUnit.DAYS);       // 10天
        System.out.println(duration1);//PT240H
        Duration duration2 = Duration.of(1000, ChronoUnit.MILLIS);  // 1000毫秒
        System.out.println(duration2);//PT1S*/


        /*Period period = Period.between(LocalDate.of(2020, 1, 21),
                LocalDate.of(2021, 2, 21));
        int years = period.getYears();//1*/

        /*Set<String> zoneIds = ZoneId.getAvailableZoneIds();//[Asia/Aden, America/Cuiaba, Etc/GMT+9,...]*/

        /*ZoneId systemZoneId = ZoneId.systemDefault();//Asia/Shanghai*/


        /*ZoneId zoneId = ZoneId.of("America/Cuiaba");//America/Cuiaba*/


        /*LocalDate of = LocalDate.of(2020, 01, 21);
        System.out.println(of.equals(LocalDate.now()));//false*/

        /*LocalDate dateOfBirth = LocalDate.of(1994, 11, 18);
        MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(LocalDate.now());
        if(currentMonthDay.equals(birthday)){
            System.out.println("Many Many happy returns of the day !!");
        }else{
            System.out.println("Sorry, today is not your birthday");
        }
        //输出： Sorry, today is not your birthday*/


        /*LocalDate tomorrow = LocalDate.of(2021, 4, 21);
        System.out.println(tomorrow.isAfter(LocalDate.now()));//true

        LocalDate yesterday = LocalDate.now().minus(1, ChronoUnit.DAYS);
        System.out.println(yesterday.isBefore(LocalDate.now()));//true*/


        /*Instant instant  = Instant.now();
        Date date = Date.from(instant);
        Instant instant1 = date.toInstant();
        System.out.println(instant1);//2021-03-21T09:00:41.950Z

        Date date2 = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);//2021-03-21T17:00:42.005

        LocalDateTime now = LocalDateTime.now();
        Instant instant2 = now.atZone(ZoneId.systemDefault()).toInstant();
        Date date3 = Date.from(instant2);
        System.out.println(date3);//Sun Mar 21 17:00:42 CST 2021

        LocalDate now1 = LocalDate.now();
        Instant instant3 = now1.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date date4 = Date.from(instant3);
        System.out.println(date4);//Sun Mar 21 00:00:00 CST 2021*/


        /*LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("G yyyy年MM月dd号 E a hh时mm分ss秒");
        String format = now.format(pattern);
        System.out.println(format);//公元 2021年03月21号 星期日 下午 05时04分14秒*/

        /*DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dt = LocalDateTime.parse("2021-03-21 15:15:30",pattern);
        System.out.println(dt.format(pattern));//2021-03-21 15:15:30*/
    }
}
