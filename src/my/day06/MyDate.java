package my.day06;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public void setDay(int day){
        if(month ==2){
            if(day<=1 || day>28){
                System.out.println("입력오류");
            }else{
                this.day = day;
            }
        }
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year =  year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
}
