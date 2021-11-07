package Prac08;

import java.io.*;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileInputStream src = null;
        FileInputStream dst = null;
        FileOutputStream app = null;
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫 번째 파일 이름을 입력하세요>>");
        String first = sc.next();
        System.out.print("두 번째 파일 이름을 입력하세요>>");
        String second = sc.next();
        try {
            src = new FileInputStream(first);
            dst = new FileInputStream(second);
            app = new FileOutputStream("append.txt");
            byte [] buf = new byte [1024*10];
            byte [] buf2 = new byte [1024*10];
            while(true) {
                int n = src.read(buf);
                app.write(buf, 0, n);
                if(n < buf.length) break; //버퍼 크기보다 작음 -> 파일 끝
            }
            while(true) {
                int n = dst.read(buf2);
                app.write(buf2, 0, n);
                if(n < buf2.length) break;
            }
            src.close();
            dst.close();
            app.close();
            System.out.println("프로젝트 폴더 밑에 append.txt. 파일에 저장했습니다.");
        } catch(IOException e) {
            System.out.println("입출력 오류가 발생했습니다.");
        }
        sc.close();
    }
}
