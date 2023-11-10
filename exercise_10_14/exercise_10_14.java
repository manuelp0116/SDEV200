package SDEV200.exercise_10_14;

public class exercise_10_14 {
    public static void main(String[] args){
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(561555550000L);

        System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay()
         + "/" + date1.getYear());
        
        System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay()
        + "/" + date2.getYear());

    }
           

}
