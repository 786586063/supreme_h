package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    //当前时间
    //public static Date DATE_NOW=new Date();


    /**
     * 得到完整的时间戳，格式:yyyyMMddHHmmssSSS(年月日时分秒毫秒)
     * @return 完整的时间戳
     */
    public static String getFullTimeStamp(){
        return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) ;
    }

    /**
     * 得到简单的时间戳，格式:yyyyMMdd(年月日)
     * @return 简单的时间戳
     */
    public static String getSimpleTimeStamp(){
        return new SimpleDateFormat("yyyyMMdd").format(new Date()) ;
    }

    /**
     * 根据指定的格式得到时间戳
     * @param pattern 指定的格式
     * @return 指定格式的时间戳
     */
    public static String getTimeStampByPattern(String pattern){
        return new SimpleDateFormat(pattern).format(new Date()) ;
    }

    /**
     * 得到当前日期格式化后的字符串，格式：yyyy-MM-dd(年-月-日)
     * @return 当前日期格式化后的字符串
     */
    public static String getTodayStr(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) ;
    }

    public static String getTodayForYear(){
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date()) ;
    }

    public static String formatTime(Date date){
        return new SimpleDateFormat("yyyy/MM/dd").format(date) ;
    }

    /**
     * 时间戳，格式:yyyy-MM-dd HH:mm:ss(年-月-日 时：分：秒)
     * @return 简单的时间戳
     */
    public static String getDateTimeStamp(Date date){
        return new SimpleDateFormat("yyyyMMddHHmmss").format(date) ;
    }

    public static String getDateByString(String str){
        SimpleDateFormat sim=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date dateTime = null;
        try {
            dateTime = sim.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateTime.toString();
    }
    /**
     * <p>
     * 获取当前系统时间的小时数
     * </p>
     *
     * @return
     */
    public static int getCurrentHour() {
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
    public static int getCurrentDay() {
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 得到当前时间分钟
     * @return
     */
    public static int getCurrentMinute() {
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * 两个时间之间相差距离多少天
     * @param one 时间参数 1：
     * @param two 时间参数 2：
     * @return 相差天数
     */
    public static long getDistanceDays(String str1, String str2) throws Exception{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date one;
        Date two;
        long days=0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            days = diff / (1000 * 60 * 60 * 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }

    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     * @param str1 时间参数 1 格式：1990-01-01 12:00:00
     * @param str2 时间参数 2 格式：2009-01-01 12:00:00
     * @return long[] 返回值为：{天, 时, 分, 秒}
     */
    public static long[] getDistanceTimes(String str1, String str2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long day = 0;
        long hour = 0;
        long min = 0;
        long sec = 0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            day = diff / (24 * 60 * 60 * 1000);
            hour = (diff / (60 * 60 * 1000) - day * 24);
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long[] times = {day, hour, min, sec};
        return times;
    }
    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     * @param str1 时间参数 1 格式：1990-01-01 12:00:00
     * @param str2 时间参数 2 格式：2009-01-01 12:00:00
     * @return String 返回值为：xx天xx小时xx分xx秒
     */
    public static String getDistanceTime(String str1, String str2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long day = 0;
        long hour = 0;
        long min = 0;
        long sec = 0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            day = diff / (24 * 60 * 60 * 1000);
            hour = (diff / (60 * 60 * 1000) - day * 24);
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day + "天" + hour + "小时" + min + "分" + sec + "秒";
    }

}

