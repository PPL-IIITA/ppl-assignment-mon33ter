/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */

    

import java.io.*;
import java.util.*;
public class Generator_rand {    
    void generate(){
        try{
            FileWriter t = new FileWriter("boy_rand.csv");
            FileWriter r = new FileWriter("girl_rand.csv");
            FileWriter q = new FileWriter("gift_rand.csv");
            int j;
            Random a = new Random();
            Random h = new Random();
            Random p = new Random();
            for(j=0;j<=100;j++){
                String[] strb={"Miser","Generous","Geek"};
		int y=h.nextInt(2);
		t.write("Boy"+j+","+strb[y]+","+a.nextInt(50)+","+a.nextInt(400)+","+a.nextInt(100)+","+a.nextInt(50)+","+0+","+0+"\n");
            }
            for(j=0;j<=100;j++){
                String[] strg={"Choosy","Normal","Desperate"};
                int x=h.nextInt(2);
		r.write("Girl"+j+","+strg[x]+","+h.nextInt(50)+","+h.nextInt(500)+","+h.nextInt(100)+","+0+"\n");
            }
            for(j=0;j<=100;j++){
                String[] strgift={"Luxury","Utitlity","Essentials"};
		int y=p.nextInt(2);
		q.write(strgift[y]+","+p.nextInt(100)+","+0+","+p.nextInt(50)+"\n");
            }
            t.close();
            r.close();
            q.close();
	}
        catch(IOException e){		
	}
    }	    
}
