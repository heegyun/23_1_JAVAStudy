import java.io.IOException;
import java.util.Scanner;


public class SwitchTest1 {

    public static void main(String[] args) throws IOException {
        System.out.println("------안내 ------");
        System.out.println("정수 값1을 입력하세요");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("정수 값2를 입력하세요");
        int n2 = sc.nextInt();
        System.out.println("연산자를 입력하세요");
        System.out.println(" [ +, -, *, / ]");
        char oper = (char) System.in.read();
        int res = 0;
        if (oper == '+')
            res = n1 + n2;
        else if (oper == '-')
            res = n1 - n2;
        else if (oper == '*')
            res = n1 * n2;
        else
            res = n1 / n2;
        System.out.println("식: " + n1 + oper + n2 + "=" + res);
        long a = '+';
        //switch()문 괄호 안에 들어갈 값은 변수, 식이 들어갈 수도 있다.
        //그러나 그 결과 값이 정수로 떨어지는 값이어야 한다. 어떤 범위가 들어가서는 안됨.
        //또한 주의. 그 값은 정수형이어야 하며, 정수형 중에서도 long형은 안됨.
        //즉, byte, short, char, int 여야 함.
        int res2 = 0;
        switch (oper) {
            case '+':
                System.out.println("더하기");
                res2 = n1 + n2;
                break;
            case '-':
                System.out.println("빼기");
                res2 = n1 - n2;
                break;
            case '*':
                System.out.println("곱하기");
                res2 = n1 * n2;
                break;
            case '/': System.out.println("나누기");
                res2=n1/n2;
                break;
            default:System.out.println("기타");
        }//switch-----------
        System.out.println("식: "+n1+oper+n2+"="+res2);

    }//main()------------------
}///////////////////////////////////

