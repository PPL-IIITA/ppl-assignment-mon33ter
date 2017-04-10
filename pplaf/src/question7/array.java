/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import question1andquestion2.Boy;
//import static question1andquestion2.Commited.length;
import question1andquestion2.Girl;

/**
 *
 * @author sony
 */
public class array {
    static Boy b_committed[]= new Boy[1000];
    static Girl g_committed[] = new Girl[1000];
    public static int length;//no. of couples
    public void bg_commited(Boy temp_b,Girl temp_g,int i){
        b_committed[i]=new Boy();
        b_committed[i]=temp_b;
        g_committed[i]=new Girl();
        g_committed[i]=temp_g;
        length=i;
        //System.out.println("\nlength==\t\t"+length);
        //System.out.println(b_committed[i].name+"   "+b_committed[i].type+"   "+b_committed[i].attractiveness+"  "+b_committed[i].budget+"   "+b_committed[i].intelligence+"   "+b_committed[i].min_attract+"   "+b_committed[i].happiness);
        //System.out.println(g_committed[i].name+"   "+g_committed[i].type+"   "+g_committed[i].attractiveness+"  "+g_committed[i].budget+"   "+g_committed[i].intelligence+"   "+g_committed[i].happiness);
                     
    }
    public void print_girl_a(Boy temp){
        //System.out.println("length="+length);
        //System.out.println("temp\t\t"+temp.name);
        for(int i=0;i<length;i++){
            //System.out.println("b\t"+b_committed[i].name);
            if((temp.name).equalsIgnoreCase(b_committed[i].name)){
                System.out.println(g_committed[i].name);
                return ;
            }    
        }
        //System.out.println(temp.name);
        System.out.println("Not committed");
    }
       
}
