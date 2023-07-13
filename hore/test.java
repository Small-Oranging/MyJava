package hero_class;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入：0代表普攻，1代表一技能，2代表二技能");
        soldier player1=new soldier("kuangTie",100,3,21,25,30);
        tank player2=new tank("yaSuo",100,5,17,20,26);
        int flag=0;
        int num,num2;
        while(player1.blood>0&&player2.blood>0){
            if(flag==0){
                System.out.println("现在该player1发起攻击");
                Scanner choice=new Scanner(System.in);
                num=choice.nextInt();
                if(num==0){
                    player1.commonAttack(player2);
                }else if(num==1){
                    player1.skillOne(player2);
                }else{
                    player1.skillTwo(player2);
                }
                flag=1;
            }else{
                System.out.println("现在该player2发起攻击");
                Scanner choice1=new Scanner(System.in);
                num2=choice1.nextInt();
                if(num2==0){
                    player2.commonAttack(player1);
                }else if(num2==1){
                    player2.skillOne(player1);
                }else{
                    player2.skillTwo(player1);
                }
                flag=0;
            }
        }
    }
}
