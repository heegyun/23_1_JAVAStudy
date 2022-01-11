package my.day06;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.setDay(31);
        myDate.setMonth(2);
        myDate.setYear(2022);
        System.out.println(myDate.getDay());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getYear());
    }
}
