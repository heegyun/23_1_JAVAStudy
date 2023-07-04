package day03;

public class ForTest3 {
    public static void main(String[] args) {
        // 0~100까지의 수 중 짝수들의 합을 구해봅시다.
        int sum=0;
        for (int i=0;i<101 ;i++ ){
            if(i%2==0){
                System.out.println(sum+"+"+i);
                sum=sum+i;
            }
        }//for------

        System.out.println("0~100 짝수 합: "+sum);
        sum=0;
        for (int i=0;i<=100 ;i+=2 ){
            sum+=i;
        }
        System.out.println("0~100 짝수 합2: "+sum);
    }
}


