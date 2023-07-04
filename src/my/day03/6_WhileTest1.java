package my.day03;
/*
    10부터 1까지 숫자를 거꾸로 출력하기.(while반복) 10 9 8 7 6 5 4 3 2 1
    초기식;
    while(조건식){
        반복실행문
        초기식에사용한 변수 증가 또는 감소
    }
 */
public class WhileTest1 {

    public static void main(String[] args) {
        int num = 10;
        while (num > 0){
            System.out.printf("%d ", num);
            num--;//num= num-1;
        }
    }

}
