
//import static Commited.b_committed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */
package question1andquestion2;

public class Boy_check_commit {
    Boy b_check[]= new Boy[1000];
    Girl g_check[] = new Girl[1000];

    /**
     *
     * @param b_check
     * @param g_check
     * @param no_b
     * @param no_g
     */
    public void check1(Boy b_check[],Girl g_check[],int no_b,int no_g){
         Commited com=new Commited();
         int no_of_couple=0;
         //int [] com_g=new int[no_g];
         //for(int i=0;i<no_g;i++)
           //  com_g[i]=0;
         for(int i=0;i<no_g;i++){
             for(int j=0;j<no_b;j++){
                 if((b_check[j].budget>=g_check[i].budget) &&(b_check[j].min_attract<=g_check[i].attractiveness)&&(b_check[j].status==0)){
                     b_check[j].status=1;
                     g_check[i].status=1;
                     com.bg_commited(b_check[j],g_check[i],no_of_couple);
                     //com_g[j]=1;
                    // System.out.println("Boy======\t\t\t"+b_check[i].name+"\t"+b_check[i].type+"\t"+b_check[i].attractiveness+"\t"+b_check[i].budget+"\t"+b_check[i].intelligence+"\t"+b_check[i].min_attract+"\t"+b_check[i].happiness);
                    // System.out.println("Girl======\t\t\t"+g_check[j].name+"\t"+g_check[j].type+"\t"+g_check[j].attractiveness+"\t"+g_check[j].budget+"\t"+g_check[j].intelligence+"\t"+g_check[j].happiness);
                     no_of_couple++;
                     break;
                 }
                 
             }
         }
     }
}
