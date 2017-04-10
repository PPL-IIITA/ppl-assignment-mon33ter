/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import question1andquestion2.Boy;

/**
 *
 * @author sony
 */
public class q7 {
    public static void main(String args[]){
        hashtable obj1=new hashtable();
        Q1 obj=new Q1();
        obj.question1();
        int choice=2;
        int i;
        i=0;
        Boy b[] = new Boy[1000];
        String csvFileboy = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\boy_find_rand.csv";
        String line = "";
		String csvSplit = ",";
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader(csvFileboy));
			while((line = buff.readLine() )!= null){
				String[] strb = line.split(csvSplit);
				b[i] = new Boy();
                                b[i].name = strb[0];
                                //System.out.println("str\t"+strb[0]);
				i++;
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
        int no_b=i;
        //System.out.println("no_b\t"+no_b);
       // for(i=0;i<no_b;i++)
           // System.out.println(b[i].name);
        switch(choice){
            case 0:
                for(i=0;i<no_b;i++)
                    obj1.print_girl_a(b[i]);
                break;
            case 1:
                for(i=0;i<no_b;i++)
                    obj1.print_girl_b(b[i]);
                break;
            default:
                for(i=0;i<no_b;i++)
                    obj1.print_girl_h(b[i]);
                break;
        }
    }
}
