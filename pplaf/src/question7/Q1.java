/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;
import question1andquestion2.Boy;
import question1andquestion2.Generator_rand;
import question1andquestion2.Girl;
import question1andquestion2.Boy_check_commit;
/**
 *
 * @author sony
 */
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import question1andquestion2.Commited;
/**
 *
 * 
 */
public class Q1 {

    /**
     */
    public void question1() {
                Generator_rand me=new Generator_rand();
                me.generate();
                int i,j;
		i=0;
		j=0;
		Boy b[] = new Boy[1000];
                Girl g[] = new Girl[1000];
		String csvFileb = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\boy_rand.csv";
		String csvFileg = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\girl_rand.csv";
		//String csvFilegift ="C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\src\\csvgift.csv";
                String line = "";
		String csvSplit = ",";
		BufferedReader buff = null;
		try{
			buff = new BufferedReader(new FileReader(csvFileb));
			while((line = buff.readLine() )!= null){
				String[] strb = line.split(csvSplit);
				b[i] = new Boy();
                                b[i].name = strb[0];
				b[i].type = strb[1];
				b[i].attractiveness = Integer.parseInt(strb[2]);
				b[i].budget = Integer.parseInt(strb[3]);
				b[i].intelligence = Integer.parseInt(strb[4]); 
				b[i].min_attract = Integer.parseInt(strb[5]); 
				b[i].happiness=Integer.parseInt(strb[6]);
                                b[i].compatibility=Integer.parseInt(strb[7]);
                                b[i].status=Integer.parseInt(strb[7]);
                                //b[i].girl="";
				//b[i].status = boy[5];
				i++;
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                try{
			buff = new BufferedReader(new FileReader(csvFileg));
			while((line = buff.readLine() )!= null){
				String[] strg = line.split(csvSplit);
				g[j] = new Girl();
                                g[j].name = strg[0];
				g[j].type=strg[1];
                                g[j].attractiveness = Integer.parseInt(strg[2]);
				g[j].budget = Integer.parseInt(strg[3]);
				g[j].intelligence = Integer.parseInt(strg[4]); 
				g[j].happiness=Integer.parseInt(strg[5]);
                                g[j].status=Integer.parseInt(strg[6]);
                                j++;
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                line="";
                int no_b,no_g;
                no_b=i;
                no_g=j;
                Boy_check_commit_7 check= new Boy_check_commit_7();
                check.check1(b,g,no_b,no_g);
                //Commited com_print=new Commited();
                //com_print.print();
                /*
                for(int k=0;k<no_b;k++)
                {
                    System.out.println(b[k].name+"   "+b[k].type+"   "+b[k].attractiveness+"  "+b[k].budget+"   "+b[k].intelligence+"   "+b[k].compatibility);
                }*/
                        
        // TODO code application logic here
                
                
    }
}