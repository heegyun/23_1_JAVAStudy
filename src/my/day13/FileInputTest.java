package my.day13;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest {
    public static void main(String[] args) {
        // 파일로부터 데이터(바이트) 읽어오기
        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream("C:\\2022년자료\\21_JAVAStudy\\src\\input.txt");
            System.out.println(fileInputStream.read());
            System.out.println(fileInputStream.read());
            System.out.println(fileInputStream.read());
            System.out.println("END");
            fileInputStream.close();


        }catch (IOException e){
            e.printStackTrace();
            System.out.println("파일 없음 에러.");
        }


    }
}
