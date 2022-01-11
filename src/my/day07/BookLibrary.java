package my.day07;

import java.util.ArrayList;

public class BookLibrary {

    public static void main(String[] args) {
        // 책 5권이 있다고 가정,, Book 클래스를 사용하여 책 5권을 객체 배열로 만드시오.
        // 1. 배열 선언
        Book [] books = new Book[5];

        // 2. 배열 초기화
        // 책1: "태백산맥","조정래", 책2: "레미안","헤르만헤세", 책3:"토지","박경리",
        // 책4: "어린왕자","생택쥐페리", 책5:  "어떻게 살 것인가","유시민"
         Book book0 = new Book("어떻게 살 것인가","유시민" );
        Book book1 = new Book("태백산맥","조정래" );
        Book book2 = new Book("레미안","헤르만헤세" );
        Book book3 = new Book("토지","박경리" );
        Book book4 = new Book("어린왕자","생택쥐페리" );
        Book book5 = new Book("자바","홍길동");

        books[0] = book0;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;
        books[4] = book4;
      //  books[5] = book5;
       // 3. 배열 사용
//       for(int i=0; i<books.length;i++){
//           books[i].showBookInfo();
//       }

        // 4. ArrayList 클래스 사용
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(book0);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        // 0번 인덱스의 책을 book1로 바꾸기
        bookList.set(0,book1);
        // 1번 인덱스의 책을 제거하기
        bookList.remove(1);

        for(Book bok : bookList ){ // for(int i =0; i<bookList.size();i++)for each 반복문
            bok.showBookInfo();
        }


    }
}

