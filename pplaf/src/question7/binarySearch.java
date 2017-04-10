/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import question1andquestion2.Boy;
import question1andquestion2.Girl;

/**
 *
 * @author sony
 */
public class binarySearch extends array {
    void sort(){         
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(((b_committed[i].name).compareTo(b_committed[j].name))>0){
                    Boy temp_b=b_committed[i];
                    b_committed[i]=b_committed[j];
                    b_committed[j]=temp_b;
                    Girl temp_g=g_committed[i];
                    g_committed[i]=g_committed[j];
                    g_committed[j]=temp_g;
                }
            }
        }
    }
    public String binary_search(Boy guy,int l,int h){
        if(h>=l){
            int m = l + (h-1)/2;
            if((b_committed[m].name).equals(guy.name))
                return g_committed[m].name;
            if((b_committed[m].name).compareTo(guy.name)>0){
                return binary_search(guy,l,m-1);
            }
            else
                return binary_search(guy,m+1,h);
        }
        return "Not committed";
    }
    public void print_girl_b(Boy temp){
        array me =new array();
        sort();
        //System.out.println("binary");
        String str=binary_search(temp,0,length);
        //System.out.println(str);
        me.print_girl_a(temp);
    }
}
