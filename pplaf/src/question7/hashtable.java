/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.HashMap;
import question1andquestion2.Boy;
import question1andquestion2.Girl;

/**
 *
 * @author sony
 */
public class hashtable extends binarySearch{
    HashMap<String,String> commit = new HashMap<String,String>(); 
        
    public void print_girl_h(Boy temp){
        //System.out.println("hash");
        for(int i=0;i<length;i++){
            commit.put(b_committed[i].name,g_committed[i].name);
        }
        if(commit.containsKey(temp.name))
            System.out.println(commit.get(temp.name));
        else
            System.out.println("Not Committed");
    }
}
