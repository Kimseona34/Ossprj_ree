package Prac08;

import java.util.*;
import java.io.File;

public class Q13 {
    public static void main(String[] args) {
        System.out.println("****파일 탐색기입니다****");
        Scanner sc = new Scanner(System.in);
        File file = new File("c:\\");
        while(true) {
            File subFiles[] = file.listFiles();
            System.out.println("[" + file.getPath() + "]");
            for(int i = 0; i < subFiles.length; i++) {
                String res="";
                File f = subFiles[i];
                if(f.isFile()) res = "file";
                else if(f.isDirectory()) res = "dir";
                System.out.print(res + "\t");
                System.out.printf("%-10s바이트\t\t", f.length());
                System.out.printf("%s\n", f.getName().trim());
            }
            System.out.print(">>");
            String dir = sc.nextLine();
            try {
                StringTokenizer st = new StringTokenizer(dir);
                String newDir = file.getPath();
                if(st.countTokens() == 1) {
                    if(dir.equals("그만")) break;
                    if(dir.equals(".."))
                        newDir = file.getParent(); //상위 디렉토리로 이동
                    else
                        newDir = file.getPath().concat("\\" + dir); //하위 디렉토리로 이동
                }
                else {

                    String operation = st.nextToken();
                    String name = st.nextToken();

                    if (operation.equals("mkdir")) {
                        File f = new File(file.getPath().concat("\\" + name));
                        f.mkdir();
                        System.out.println(name + "디렉토리를 생성했습니다.");
                    }

                    else if(operation.equals("rename")) {
                        String dest = st.nextToken();
                        File f = new File(file.getPath().concat("\\" + name));
                        f.renameTo(new File(file.getPath().concat("\\" + dest)));
                        System.out.println("파일명을 변경했습니다.");
                    }
                }
                file = new File(newDir);
            }
            catch (NoSuchElementException e) {
                System.out.println("두 개의 파일명이 주어지지 않았습니다!");
            }
        }
        sc.close();
    }
}
