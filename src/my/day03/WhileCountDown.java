public class WhileCountDown {

    public static void countdown(int num){
        System.out.println("카운트 다운을 시작합니다.");

        while(num > 4){
            System.out.printf("%d..\n", num);
            num--;
        }
    }
    public static void main(String[] args) {
        WhileCountDown.countdown(5); // 반복 진행시 num의 값은 5부터 차례로 4,,3,2,1,0으로 나온다는 것을 유추하면
    }
}
