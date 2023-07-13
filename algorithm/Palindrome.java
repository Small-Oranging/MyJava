package algorithm;
/*
给一个整数x，如果是回文数，返回true；否则，返回false
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x<=0){
            System.out.println("不是回文数");
        }else{
            int a=0;
            int b=0;
            int c=x;
            while(c!=0){
                a=c%10;
                b=b*10+a;
                c=c/10;
            }
            if(x==b){
                System.out.println("是回文数");
            }else{
                System.out.println("不是回文数");
            }
        }
    }
}
