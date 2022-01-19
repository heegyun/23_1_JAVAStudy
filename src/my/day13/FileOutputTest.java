package my.day13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
    // 1. 키보드로 입력한 내용을 파일(result.txt)로 저장하기
    // 2. 데이터 소스: 키보드
    // 3. 데이터 목적지: 파일(FileOutputStream)
    public static void main(String[] args) {
        System.out.println("파일로 저장할 내용을 입력하세요..");
        int n=0;
        FileOutputStream fileOutStream = null;
        try{
            fileOutStream = new FileOutputStream("result.txt", true); // 기존 파일 내용에 이어쓰기...

            while( (n = System.in.read())!=-1 ){
                fileOutStream.write(n);
                fileOutStream.flush();
            }
            System.in.close();
            fileOutStream.close();
        }catch (IOException e){

        }

    }

}
