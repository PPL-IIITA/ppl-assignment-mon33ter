/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1andquestion2;

/**
 *
 * @author sony
 */
public class Girl_check_commit {
    Boy b_check[]= new Boy[1000];
    Girl g_check[] = new Girl[1000];
    
    /**
     *
     * @param b_check
     * @param g_check
     * @param no_b
     * @param no_g
     */
    public void check1(Girl g_check[],Boy b_check[],int no_g,int no_b){
        Commited obj=new Commited();
        Boy b_commit[]=new Boy[no_g];
        int k=0;
        //System.out.println("no_g\t"+no_g+"no_b\t"+no_b);
        for(int i=0;i<no_g;i++){
             for(int j=0;j<no_b;j++){
                 if((b_check[j].budget>=g_check[i].budget) &&(b_check[j].min_attract<=g_check[i].attractiveness)&&(b_check[j].status==0)){
                     b_check[j].status=1;
                     g_check[i].status=1;
                     b_commit[i]=b_check[j]; 
                     System.out.println(g_check[i].name+"\t"+g_check[i].type+"\t"+g_check[i].attractiveness+"\t"+g_check[i].budget+"\t"+g_check[i].intelligence+"\t"+g_check[i].happiness+"\t"+g_check[i].status);
                     System.out.println(b_check[j].name+"\t"+b_check[j].type+"\t"+b_check[j].attractiveness+"\t"+b_check[j].budget+"\t"+b_check[j].intelligence+"\t"+b_check[j].min_attract+"\t"+b_check[j].happiness+"\t"+b_check[j].status);
                     break;
                 }
                 
             }
         }
        obj.replace_bf(g_check,b_commit,no_g);
        //if(k==no_g){
            
        //}
     }
}
