package my.day04;

public class BreakTest {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=10;i++){
            System.out.printf("%d",i);
            sum+=i;// sum= sum+i;
            if(i==10){
                break;
            }
            System.out.print(" + ");
        }
        System.out.println(" =" + sum);
    }
}
