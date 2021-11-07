package Prac08;

import java.io.*;
public class Q2 {
    public static void main(String[] args) {
        System.out.println("c:\\Temp\\phone.txt를 출력합니다.");
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("c:\\Temp\\phone.txt");
            while((c = fin.read()) != -1) {
                System.out.print((char)c);
            }
            fin.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
