package my.day04;

public class MethodTest4 {
   //  반환값과 매개변수 없는 메소드
    static void buy(){
        System.out.println("라면을 사온다.");
   }
   static void boil(){
       System.out.println("물을 끓인다.");
   }
   static void put(){
       System.out.println("라면을 넣는다.");
   }
   static void eat(){
       System.out.println("맛있게 먹는다.");
   }


    public static void main(String[] args) {
        buy();
        boil();
        put();
        eat();
    }


}
