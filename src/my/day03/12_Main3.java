class Main3{

public static void main(String[] args) {
  캐릭터 char1 = new 캐릭터();
  char1.no = 1;
  char1.age = 23;
  char1.jumin = 1234;
  char1.attackPoint = 50;
  char1.name = "홍길동";
  introudece(char1);


  캐릭터 char2 = 캐릭터();
  char2.no = 2;
  char2.age = 20;
  char2.jumin = 1235;
  char2.attackPoint = 100;
  char2.name = "이길순";
  introudece(char2);
  
  static void introduce(캐릭터 ch){
        System.out.println("====캐릭터 소개====");
        System.out.printf("번호 : %d\n", ch.no);
        System.out.printf("나이 : %d\n", ch.age);
        System.out.printf("주민 : %d\n", ch.jumin);
        System.out.printf("공격 : %d\n",ch.attackPoint);
    
    }
}

class 캐릭터{
  int no, age, jumin, attackPoint;
  String name;
}
