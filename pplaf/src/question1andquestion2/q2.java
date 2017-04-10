/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1andquestion2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */

public class q2 {
    public static void main(String args[]){
        Generator_rand me=new Generator_rand();
        me.generate();
        int i,j;
		i=0;
		j=0;
		Boy b[] = new Boy[1000];
                Girl g[] = new Girl[1000];
		String csvFileb = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\boy_rand.csv";
		String csvFileg = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\girl_rand.csv";
	int y=0;
        Gifts gif[] = new Gifts[1000];
                String csvFilegift ="C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\gift_rand.csv";
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
                                b[i].status=Integer.parseInt(strb[8]);
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
                
                try{
			buff = new BufferedReader(new FileReader(csvFilegift));
			while((line = buff.readLine() )!= null){
				String[] strgif = line.split(csvSplit);
				gif[y] = new Gifts();
                                //gif[j].price = strgif[0];
				//gif[j].value=strgif[1];
                                //System.out.println(strgif[0]+"   ");
                                gif[y].type = strgif[0];
				gif[y].price = Integer.parseInt(strgif[1]);
				gif[y].status = Integer.parseInt(strgif[2]); 
				gif[y].value = Integer.parseInt(strgif[3]); 
                            //	System.out.println("jjbmhbkj");
                                //System.out.println(gif[y].price+"   "+gif[y].status+"   "+gif[y].value);
                                y++;
			}
                }
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                Boy_check_commit check= new Boy_check_commit();
                check.check1(b,g,no_b,no_g);
                Commited com=new Commited();
               // com.print(no_b);
                
                int no_gifts;
                no_gifts=y;
                //commited  com=new Commited();
                
                for(int k=0;k<no_gifts;k++)
                {
                    //System.out.println(gif[k].type+"   "+gif[k].price+"   "+gif[k].status);
                    com.giftarray(gif[k], k);
                }
              //commited  com1=new Commited();
                //System.out.println("tertert5324\n");
                //System.out.println("no_gits==\t\t\t"+no_gifts);
                com.cal_happiness(no_gifts);
                   //com.print(no_b);
                 com.print();
    }            
}
