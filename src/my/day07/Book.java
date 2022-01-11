package my.day07;

public class Book {
    // 1. 책이름, 저자 멤버 변수(필드) 정보 은닉
    private String bookName;
    private String author;

    // 2. 기본 생성자 정의
    public Book(){

    }

    // 3.인자 생성자(매개변수 2개 전달받아 멤버 변수 초기화)
    public Book(String bn, String author){
        //멤버 변수 초기화
        bookName = bn;
        this.author = author;
    }


    // 4. 책이름 반환 메소드 getBookName() 정의
    public String getBookName(){
        return bookName;
    }

    // 5. 저자 이름 반환 메소드 getAuthor() 정의
    public String getAuthor(){
        return author;
    }

    // 6. 책 2개의정보를 모두 출력하는 showBookInfo() 멤버 메소드 정의
    public void showBookInfo(){
        System.out.println("책이름:" + bookName + " 저자명:" +author);
    }


}
