package Prac_06;

import java.util.Calendar;
import java.util.Scanner;
public class TimeGame {
    Scanner sc = new Scanner(System.in);
    String str;
    public int run() {
        while(!(str = sc.nextLine()).equals(""));
        Calendar c = Calendar.getInstance();
        int sec1 = c.get(Calendar.SECOND);
        System.out.println("현재 초 시간 = " + sec1);
        System.out.print("10초 에상 후 <Enter>키>>");
        while(!(str = sc.nextLine()).equals(""));
        c = Calendar.getInstance();
        int sec2 = c.get(Calendar.SECOND);
        System.out.println("현재 초 시간 = " + sec2);
        int result = Math.abs(sec2 - sec1);
        sc.close();
        if(sec2 - sec1 < 0) return 60 - result;
        return result;
    }

    public static void main(String[] args) {
        TimeGame time = new TimeGame();
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        System.out.print("황기태 시작 <Enter>키>>");
        int Hwang = time.run();
        System.out.print("이재문 시작 <Enter>키>>");
        int Lee = time.run();
        System.out.print("황기태의 결과 " + Hwang + ",");
        System.out.print("이재문의 결과 " + Lee + ", ");
        if(Math.abs(10 - Hwang) < Math.abs(10 - Lee))
            System.out.println("승자는 황기태");
        else if(Math.abs(10 - Hwang) == Math.abs(10 - Lee))
            System.out.println("무승부");
        else
            System.out.println("승자는 이재문");
    }
}

