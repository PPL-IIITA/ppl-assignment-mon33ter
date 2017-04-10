/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;
import java.util.Random;
import question3.Q2;
import question1andquestion2.Commited;
import java.util.Scanner;

/**
 *
 * @author sony
 */
public class q6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Commited obj2=new Commited();
        Q2 obj=new Q2();
        obj.question1();
        obj.question2();
        Random a = new Random();
        int t=a.nextInt(20);//no of days
        int k=6;
        int count=30/t;//for 1 month
        while(count>0){
            obj2.new_assign_1(k);
            count--;
        }
        obj2.print();
    }
}