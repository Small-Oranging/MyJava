package algorithm;

import java.util.Scanner;

/*
* 给定数组nums和目标整数target，在数组中找出和为目标值的那两个整数，返回他们的下标
* */
public class AddOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("输入数组元素");
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
        System.out.println("输入目标值");//[I@17a7cec2
        Scanner sc1=new Scanner(System.in);
        int target=sc1.nextInt();
        int i;
        int j=0;
        int flag=0;
        for(i=0;i<arr.length;i++){
            for(j=i;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                break;
            }
        }
        System.out.println("["+i+","+j+"]");
    }

}