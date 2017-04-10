/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;
import question1andquestion2.Boy;
import question1andquestion2.Girl;
import question1andquestion2.Commited;
/**
 *
 * @author sony
 */
public class choose_one_by_one {
    Boy b_check[]=new Boy[1000];
    Girl g_check[]=new Girl[1000];
    public void check(Girl g_check[],Boy b_check[],int no_g,int no_b){
        Commited com=new Commited();
        int no_of_couple=0;
        int count_b=0;
        int count_g=0;
        int sema_b ,sema_g;
        sema_g = 0;
        sema_b = 1;
        while(count_b<no_b&&count_g<no_g){
            if(sema_b==0){
                if(b_check[count_b].status==0){
                    int ith_girl;
                    ith_girl = -1;
                    int max_attract=b_check[count_b].min_attract;
                    for(int i=0;i<no_g;i++){
                        if(g_check[i].attractiveness>=max_attract&&g_check[i].status==0){
                            max_attract=g_check[i].attractiveness;
                            ith_girl=i;
                        }
                    }
                    if(ith_girl!=-1){
                        b_check[count_b].status=1;
                        g_check[ith_girl].status=1;
                        com.bg_commited(b_check[count_b],g_check[ith_girl],no_of_couple);
                        no_of_couple++;
                    }   
                }
                count_b++;
                sema_g=0;
                sema_b=1;
            }
            else if(sema_g==0){
                if(g_check[count_g].status==0){
                    int ith_boy=-1;
                    int max_budget=g_check[count_g].budget;
                    for(int i=0;i<no_b;i++){
                        if(b_check[i].budget>=max_budget&&b_check[i].status==0){
                            max_budget=b_check[i].budget;
                            ith_boy=i;
                        }
                    }
                    if(ith_boy!=-1){
                        b_check[ith_boy].status=1;
                        g_check[count_g].status=1;
                        com.bg_commited(b_check[ith_boy],g_check[count_g],no_of_couple);
                        no_of_couple++;
                    }
                }
                count_g++;
                sema_g=1;
                sema_b=0;
            }
        }
    }
}
