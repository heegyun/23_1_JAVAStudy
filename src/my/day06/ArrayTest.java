package my.day06;

public class ArrayTest {
    public static void main(String[] args) {

     Hero ironMan = new Hero("아이언맨",100, 200 );
     Hero hulk = new Hero("헐크",200,80);
     Hero batman = new Hero("배트맨");
        //객체 배열 선언
     Hero[] heroArray = new Hero[3];
     heroArray[0] = ironMan;
     heroArray[1] = hulk;
     heroArray[2] = batman;

      for(int i=0;i<heroArray.length;i++){
          System.out.println(heroArray[i].toStr());
      }



    }
}
