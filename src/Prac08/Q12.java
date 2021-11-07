package Prac08;

import java.io.*;
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Vector<String> lineVector = new Vector<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("대상 파일명 입력>>");
        String filename = sc.next();
        try {
            Scanner fScanner = new Scanner(new FileReader(filename));
            while(fScanner.hasNext()) {
                String line = fScanner.nextLine(); //한 줄을 읽고
                lineVector.add(line);
            }
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
        while(true) {
            System.out.print("검색할 단어나 문장>>");
            String search = sc.next();
            if(search.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            Iterator<String> it = lineVector.iterator();
            while(it.hasNext()) {
                String temp = it.next();
                if (temp.contains(search))
                    System.out.println(temp);
            }
        }
        sc.close();
    }
}
