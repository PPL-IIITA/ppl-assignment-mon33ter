/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;
import java.util.Random;
import question1andquestion2.Girl_check_commit;
import question1andquestion2.Commited;
import java.util.Scanner;
/**
 *
 * @author sony
 */
public class q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Q2 obj1=new Q2();
        obj1.question1();
        obj1.question2();
        Random a = new Random();
        int k=a.nextInt(10);//k least happy couple 
        Commited obj2=new Commited();
        obj2.new_assign(k);
        obj2.print();
    }
}
