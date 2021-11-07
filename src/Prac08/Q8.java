package Prac08;

import java.io.File;
public class Q8 {
    public static void main(String[] args) {
        File f = new File("C:\\");
        File [] subFiles = f.listFiles();
        long max = 0;
        String name = "";
        for(int i = 0; i < subFiles.length; i++) {
            File temp = subFiles[i];
            if (max < temp.length()) {
                max = temp.length();
                name = temp.getName();
            }
        }
        System.out.println("가장 큰 파일은 " + name + " " + max + "바이트");
    }
}


