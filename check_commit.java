
//import static commited.b_committed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */
public class check_commit {
    BOY b_check[]= new BOY[1000];
    Girl g_check[] = new Girl[1000];
		
     void check1(BOY b_check[],Girl g_check[],int no_b,int no_g){
         commited com=new commited();
         int k=0;
         int [] com_g=new int[no_g];
         for(int i=0;i<no_g;i++)
             com_g[i]=0;
         for(int i=0;i<no_b;i++){
             for(int j=0;j<no_g;j++){
                 if((b_check[i].budget>=g_check[j].budget) &&(b_check[i].min_attract<=g_check[j].attractiveness)&&(com_g[j]==0)){
                     com.bg_commited(b_check[i],g_check[j],k);
                     com_g[j]=1;
                    // System.out.println("BOY======\t\t\t"+b_check[i].name+"\t"+b_check[i].type+"\t"+b_check[i].attractiveness+"\t"+b_check[i].budget+"\t"+b_check[i].intelligence+"\t"+b_check[i].min_attract+"\t"+b_check[i].happiness);
                    // System.out.println("Girl======\t\t\t"+g_check[j].name+"\t"+g_check[j].type+"\t"+g_check[j].attractiveness+"\t"+g_check[j].budget+"\t"+g_check[j].intelligence+"\t"+g_check[j].happiness);
                     
                     k++;
                     break;
                 }
                 
             }
         }
     }
}
