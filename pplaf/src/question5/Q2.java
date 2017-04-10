/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author sony
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import question1andquestion2.Boy;
import question1andquestion2.Generator_rand;
import question1andquestion2.Gifts;
import question1andquestion2.Girl;
import question1andquestion2.Boy_check_commit;
import question1andquestion2.Commited;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */

public class Q2 extends Q1_5{
    public void question2(){
        //Generator_rand me=new Generator_rand();
        //me.generate();
	int y=0;
        Gifts gif[] = new Gifts[1000];
                String csvFilegift ="C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\gift_rand.csv";
                String line = "";
		String csvSplit = ",";
		BufferedReader buff = null;
                line="";
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
                //check_commit check= new Boy_check_commit();
                //check.check1(b,g,no_b,no_g);
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
