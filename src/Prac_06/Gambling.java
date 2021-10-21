package Prac_06;

import java.util.Scanner;
import java.util.Random;

class Person {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    private String name;
    private String str;
    private int [] num = new int[3];
    public Person(String name) {
        this.name = name;
    }
    public String get() {
        return this.name;
    }
    public boolean run() {
        System.out.println("[" + this.name + "]: <Enter>");
        while(!(str = sc.nextLine()).equals("")); //엔터키를 입력받으면 종료
        for(int i = 0; i < 3; i++) {
            num[i] = r.nextInt(3) + 1; //랜덤 생성
            System.out.print(num[i] + " ");
        }
        if(num[0] == num[1] && num[1] == num[2] && num[2] == num[0])
            return true; //모두 같으면 true 리턴
        return false;
    }
}
public class Gambling {
    public static void main(String[] args) {
        boolean res;
        Scanner sc = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        String name = sc.next();
        Person P1 = new Person(name);
        System.out.print("2번째 선수 이름>>");
        name = sc.next();
        Person P2 = new Person(name);
        while(true) {
            res = P1.run();
            if(res) {
                System.out.println("\t" + P1.get() + "님이 이겼습니다!");
                break;
            }
            else System.out.println("아쉽군요!");
            res = P2.run();
            if(res) {
                System.out.println("\t" + P2.get() + "님이 이겼습니다!");
                break;
            }
            else System.out.println("아쉽군요!");
        }
        sc.close();
    }
}

