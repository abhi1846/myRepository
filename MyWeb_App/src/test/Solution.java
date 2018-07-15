package test;

import java.util.Formatter;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        Formatter fmt;
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                fmt=new Formatter();
//                for left justify use '-' before the number
                fmt.format("%-15s%03d", s1,x);
                System.out.println(fmt);
            }
            System.out.println("================================");
            sc.close();
    }
}

