public class Main2 { // 기본타입 변수로 처리
    public static void main(String[] args) {
        int[] char1 = new int[5];
        char1[0] = 1;
        char1[1] = 23;
        char1[2] = 1234;
        char1[3] = 50;
        introduce(char1);

        int[] char2 = new int[4];
        char1[0] = 2;
        char1[1] = 20;
        char1[2] = 1235;
        char1[3] = 100;
        introduce(char2);
    }
    static void introduce(int[] ch){
        System.out.println("====캐릭터 소개====");
        System.out.printf("번호 : %d\n", ch[0]);
        System.out.printf("나이 : %d\n", ch[1]);
        System.out.printf("주민 : %d\n", ch[2]);
        System.out.printf("공격 : %d\n",ch[3);
    
    }
}
