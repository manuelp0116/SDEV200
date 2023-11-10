package SDEV200.exercise_10_14;

import java.util.GregorianCalendar;
/********************************************
 *                 MyDate                   *
 * -----------------------------------------*
 * -year: int                               *
 * -month: int                              *
 * -day: int                                *
 * +MyDate()                                *
 * +MyDate(elapsedTime: long)               *
 * +MyDate(year: int, mont: int, day: int)  *
 * +getYear()                               *
 * +getMonth()                              *
 * +getDay()                                *
 * +setDay(elapsedTime: long)               *
 *******************************************/
public class MyDate {
    //Data fields Day, Month, and Year
    private int year;
    private int month;
    private int day;

    //MyDate object for the current day
    MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //MyDate object for elapsed time
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    //MyDate object that contrsucts year, month, and day
    MyDate(int year, int  month, int day ) {
      this.year = year;
      this.month = month;
      this.day = day;  
    }
    
    //Getters
    public int getYear() {
        return year;
    }

    public String getMonth(){
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    public String getDay(){
        String d = String.valueOf(day + 1);
        return (day < 10 ? "0" + d: d);
    }

    // set object
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
