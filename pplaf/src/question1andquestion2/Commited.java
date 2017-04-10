package question1andquestion2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
//import question6.Girl_check_commit_6;
//compatibility->>>>b_committed[i].compatibility
//couple_happiness->>>b_committed[i].happiness

public class Commited {
   static Boy b_committed[]= new Boy[1000];
   static Girl g_committed[] = new Girl[1000];
   static Gifts gift[] = new Gifts[1000];
   //static Boy temp_b= new Boy();
   //static Girl temp_g= new Girl();
   static Boy b_committed_comp[]= new Boy[1000];
   static Girl g_committed_comp[] = new Girl[1000];
   static Boy b_committed_happ[]= new Boy[1000];
   static Girl g_committed_happ[] = new Girl[1000];
   static Boy b_committed_happ_build[]= new Boy[1000];
   static Girl g_committed_happ_build[] = new Girl[1000]; 
   
    /**
     *
     */
    public static int length;//no. of couples
    public static int no_gift;
    public void bg_commited(Boy temp_b,Girl temp_g,int i){
        b_committed[i]=new Boy();
        b_committed[i]=temp_b;
        g_committed[i]=new Girl();
        g_committed[i]=temp_g;
        length=i;
        //System.out.println("\nlength==\t\t"+length);
        //System.out.println(b_committed[i].name+"   "+b_committed[i].type+"   "+b_committed[i].attractiveness+"  "+b_committed[i].budget+"   "+b_committed[i].intelligence+"   "+b_committed[i].min_attract+"   "+b_committed[i].happiness);
        //System.out.println(g_committed[i].name+"   "+g_committed[i].type+"   "+g_committed[i].attractiveness+"  "+g_committed[i].budget+"   "+g_committed[i].intelligence+"   "+g_committed[i].happiness);
                     
    } //used to make an array of couples
    public void sortcomp(Boy b_committed_comp[],Girl g_committed_comp[]){
        System.out.println("COUPLES IN HIGHEST COMPATIBILITY ORDER");
        /*Logger logger = Logger.getLogger("MyLogsortcomp");  
        FileHandler fh;  

        try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\src\\MyLogsortcomp.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
        // logger.info("My first log");
        } 
        catch (SecurityException e) {  
            e.printStackTrace();  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        } */ 
        for(int i=0;i<length;i++){
              for(int j=0;j<length;j++){
                  if(b_committed_comp[i].compatibility>b_committed_comp[j].compatibility){
                      Boy temp=new Boy();
                      temp=b_committed_comp[i];
                      b_committed_comp[i]=b_committed_comp[j];
                      b_committed_comp[j]=temp;
                      Girl temp1=new Girl();
                      temp1=g_committed_comp[i];
                      g_committed_comp[i]=g_committed_comp[j];
                      g_committed_comp[j]=temp1;
                      
                  }
              }
        }
        for(int i=0;i<length;i++){
            System.out.println(b_committed_comp[i].name+"\t"+g_committed_comp[i].name);
            //System.out.println(+"\t"+g_committed_comp[i].type+"\t"+g_committed_comp[i].attractiveness+"\t"+g_committed_comp[i].budget+"\t"+g_committed_comp[i].intelligence+"\t"+g_committed_comp[i].happiness);
            //logger.info(b_committed_comp[i].name+"\t"+g_committed_comp[i].name);
            //logger.info();
            
        }
    }//
    public void sorthapp(Boy b_committed_happ[],Girl g_committed_happ[]){
        System.out.println("COUPLES IN HIGHEST HAPPIEST ORDER");
        /*Logger logger = Logger.getLogger("MyLogsorthapp");  
        FileHandler fh;  

        try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\src\\MyLogsorthapp.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

        // the following statement is used to log any messages  
       // logger.info("My first log");  

        } 
        catch (SecurityException e) {  
            e.printStackTrace();  
         } 
        catch (IOException e) {  
            e.printStackTrace();  
        } */
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                  if(b_committed_happ[i].happiness>b_committed_happ[j].happiness){
                      Boy temp=new Boy();
                      temp=b_committed_happ[i];
                      b_committed_happ[i]=b_committed_happ[j];
                      b_committed_happ[j]=temp;
                      Girl temp1=new Girl();
                      temp1=g_committed_happ[i];
                      g_committed_happ[i]=g_committed_happ[j];
                      g_committed_happ[j]=temp1;
                      
                  }
              }
        }
        for(int i=0;i<length;i++){
            b_committed_happ_build[i]=b_committed_happ[i];
            g_committed_happ_build[i]=g_committed_happ[i];
        }
        for(int i=0;i<length;i++){
            System.out.println(b_committed_happ[i].name+"\t"+g_committed_happ[i].name);
            //System.out.println(b_committed_happ[i].name+"\t"+b_committed_happ[i].type+"\t"+b_committed_happ[i].attractiveness+"\t"+b_committed_happ[i].budget+"\t"+b_committed_happ[i].intelligence+"\t"+b_committed_happ[i].min_attract+"\t"+b_committed_happ[i].happiness+"\t"+b_committed_happ[i].compatibility);
            //System.out.println(g_committed_happ[i].name+"\t"+g_committed_happ[i].type+"\t"+g_committed_happ[i].attractiveness+"\t"+g_committed_happ[i].budget+"\t"+g_committed_happ[i].intelligence+"\t"+g_committed_happ[i].happiness);
            //logger.info(b_committed_happ[i].name+"\t"+g_committed_happ[i].name);
            //logger.info(g_committed_comp\\[i].name);
        }
    }
    public void sortgift(int no__gift){
        for(int i=0;i<no__gift;i++){
            for(int j=0;j<no__gift;j++){
                if(gift[i].price>gift[j].price){
                    Gifts temp;
                    temp=gift[i];
                    gift[i]=gift[j];
                    gift[j]=temp;
                }
            }
        }
    }
    public void giftarray(Gifts temp,int i){
        gift[i]=new Gifts();
        gift[i]=temp;
        no_gift=i;
       //System.out.println(gift[i].type+"   "+gift[i].price+"   "+gift[i].status);
    }
    public void cal_happiness(int no_gifts){
        
        //System.out.println("cal_happiness");
        Logger logger = Logger.getLogger("MyLoggift");  
        FileHandler fh;  
        
        try {  

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\src\\MyLoggift.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
        // logger.info("My first log");  

        } 
        catch (SecurityException e) {  
            e.printStackTrace();  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
        //check_commit check1= new check_commit();
      //  check1.check1(b_committed, g_committed, no_b, no_g);
        //System.out.println(no_b+"dasda\n\n");
       /* for(int i=0;i<no_b;i++)
                {
                       System.out.println("ghjhjj==\t\t"+g_committed[i].budget);
        //             System.out.println(b_committed[i].name+"   "+b_committed[i].type+"   "+b_committed[i].attractiveness+"  "+b_committed[i].budget+"   "+b_committed[i].intelligence+"   "+b_committed[i].min_attract+"   "+b_committed[i].happiness+"   "+b_committed[i].compatibility);
        //             System.out.println(g_committed[i].name+"   "+g_committed[i].type+"   "+g_committed[i].attractiveness+"  "+g_committed[i].budget+"   "+g_committed[i].intelligence+"   "+g_committed[i].happiness);
        }*/
        //System.out.println("no_gifts=\t"+no_gifts);
        sortgift(no_gifts);
        for(int i=0;i<no_gifts;i++){
            
            //System.out.println(gift[i].type+"   "+gift[i].price+"   "+gift[i].status+"   "+gift[i].value);
        }
       

       // logger.info("Hi How r u?");  
        int count=0;
        int i,k=0,cost=0,x=no_gifts,value=0,flag=0;
        for( i=0;i<length;i++){
            //System.out.println("i=\t"+i+"count\t"+count);
            cost=0;
            flag=0;
            value=0;
            k=0;
           // System.out.println(g_committed[i].type+"     g_committed[i].budget");
            if((b_committed[i].type.equalsIgnoreCase("Miser"))){
               // logger.log(Level.INFO, "MIser   {0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
                //System.out.println("g_committed[i].budget\t\t"+g_committed[i].budget+"cost==\t\t"+cost);
                while((g_committed[i].budget)>cost){
                    if(gift[k].status!=1){
                        logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                        count++;
                        //System.out.println("dsadsa\n\n\n");
                        cost+=gift[k].price;
                        value+=gift[k].value;
                        if(gift[k].type.equalsIgnoreCase("Luxury")){
                            b_committed[i].compatibility+=2*gift[k].price;
                        }
                        else{
                            b_committed[i].compatibility+=gift[k].price;
                        }
                        //logger.log(Level.INFO, "MIser    cost==\t{0}", cost);
                        gift[k].status=1;
                    }
                    k++;
                    if(k>=no_gifts)
                        if(count>=no_gifts)
                            break;
                        else{
                            if(flag==0){
                                k=0;
                                flag=1;
                            }
                            else
                                break;
                        }
                    //logger.info("\ni===\t"+i+"\tk==\t"+k);
                }
                b_committed[i].happiness=b_committed[i].budget-cost;
                if(b_committed[i].happiness<0)
                    b_committed[i].happiness=0;
              //  logger.log(Level.INFO, "b_committed[i].happiness== {0}   cost==  {1}", new Object[]{b_committed[i].happiness, cost});
                if(g_committed[i].type.equalsIgnoreCase("Choosy")){
                //    logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double t=Math.log(b_committed[i].compatibility+1);
                   // System.out.println("t==  "+t);
                    g_committed[i].happiness=(int)t;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                 //   logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Normal")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    g_committed[i].happiness=cost+value;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                 //   logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Desperate")){
                    //logger.log(Level.INFO, "MIser   {0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
                    double m=Math.log(cost);
                    g_committed[i].happiness=(int)m;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                 //   logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
             //   logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
              //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    
            }
            else if(b_committed[i].type.equalsIgnoreCase("Generous")){
                //logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
                while(b_committed[i].budget>=cost){
                    //System.out.println("fghghf\n");    
                    if(gift[k].status!=1){
                    logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                    count++;
                    cost+=gift[k].price;
                        value+=gift[k].value;
                        gift[k].status=1;
                    }
                    k++;
                    if(k>=no_gifts)
                        if(count>=no_gifts)
                            break;
                        else{
                            if(flag==0){
                                k=0;
                                flag=1;
                            }
                            else
                                break;
                        }
                            
                    // logger.info("\ni===\t"+i+"\tx==\t"+x);
                }
                b_committed[i].compatibility=cost;
               // logger.log(Level.INFO, "b_committed[i].happiness== {0}   cost==  {1}", new Object[]{b_committed[i].happiness, cost});
                if(g_committed[i].type.equalsIgnoreCase("Choosy")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double t=Math.log(b_committed[i].compatibility);
                    g_committed[i].happiness=(int)t;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                   // logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Normal")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    g_committed[i].happiness=cost+value;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Desperate")){
                 //   logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double m=Math.log(b_committed[i].compatibility);
                    g_committed[i].happiness=(int)m;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                   // logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                b_committed[i].happiness=g_committed[i].happiness;
                if(b_committed[i].happiness<0)
                    b_committed[i].happiness=0;
              //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
              //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    
            }
            else if(b_committed[i].type.equalsIgnoreCase("Geeks")){
                //logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
               // logger.log(Level.INFO, "g_committed[i].budget== {0}   cost==  {1}  k=== {2}", new Object[]{g_committed[i].budget, cost,k});
                while(g_committed[i].budget>=cost){
                    if(gift[k].status!=1){
                    //logger.info("b_committed[i].name==\t\t"+i+"\tgift[k].type===\t"+k+"\tg_committed[i].name==\t"+i);
                    logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                    count++;
                    cost+=gift[k].price;
                    value+=gift[k].value;
                    gift[k].status=1;
                    }
                    k++;
                    if(k>=no_gifts)
                        if(count>=no_gifts)
                            break;
                        else{
                            if(flag==0){
                                k=0;
                                flag=1;
                            }
                            else
                                break;
                        }
                    //logger.info("\ni===\t"+i+"\tk==\t"+k);
                }
                b_committed[i].compatibility=cost;
                int z=k;
                while(z<no_gifts){
                    if(gift[z].type.equalsIgnoreCase("Luxury")){
                        if((cost+gift[z].price)<b_committed[i].budget){
                            logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                            count++;
                            cost+=gift[z].price;
                            b_committed[i].compatibility=cost+gift[z].price;
                            break;
                        }
                    }
                    z++;
                    if(z>=no_gifts)
                        if(count>=no_gifts)
                            break;
                        else{
                            if(flag==0){
                                z=0;
                                flag=1;
                            }
                            else
                                break;
                        }
                    
                }
                
                b_committed[i].happiness=g_committed[i].intelligence;
                if(b_committed[i].happiness<0)
                    b_committed[i].happiness=0;
               // logger.log(Level.INFO, "b_committed[i].happiness== {0}   cost==  {1}", new Object[]{b_committed[i].happiness, cost});
                if(g_committed[i].type.equalsIgnoreCase("Choosy")){
                 //   logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double t=Math.log(b_committed[i].compatibility);
                    g_committed[i].happiness=(int)t;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Normal")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    g_committed[i].happiness=cost+value;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Desperate")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double m=Math.log(cost);
                    g_committed[i].happiness=(int)m;
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
               // logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].compatibility});
               // logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});    
            }
            b_committed[i].happiness+=g_committed[i].happiness;
            b_committed[i].compatibility=(b_committed[i].budget)-(g_committed[i].budget)+Math.abs((b_committed[i].attractiveness)-(g_committed[i].attractiveness))+Math.abs((b_committed[i].intelligence)-(g_committed[i].intelligence));
            //logger.log(Level.INFO, "b_committed[i].happiness== {0}", b_committed[i].happiness);
            //logger.log(Level.INFO, "b_committed[i].compatibility== {0}", b_committed[i].compatibility);        
        }
        //System.out.println("sorting");
        sorthapp(b_committed,g_committed);
        sortcomp(b_committed,g_committed);
    }
    public  void print(){
        Logger logger = Logger.getLogger("MyLogcouple");  
        FileHandler fh;  

        try {
            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\src\\MyLogcouple.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  

            // the following statement is used to log any messages  
            // logger.info("My first log");  

        } 
        catch (SecurityException e) {  
            e.printStackTrace();  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
        //System.out.println("no_b===\t\t"+no_b);
        //System.out.println(length);
        logger.info("----------------COMMITTED----------------");
        //System.out.println("length==\t"+length);
        for(int i=0;i<=length;i++)
                {
                    //System.out.println("fsafa\n");
                    // logger.info("b_committed[i].name==\t\t"+b_committed[i].name+"g_committed[i].name==\t\t"+g_committed[i].name+"\ti==\t"+i);
                    if(g_committed[i].happiness<0)
                        g_committed[i].happiness=0;
                    logger.info(g_committed[i].name+"\t"+b_committed[i].name);
                    //logger.info(b_committed[i].name);
                }
    }//used to write on MyLogcouple log file
    public void new_assign(int k){
        //System.out.println("name"+g_committed_happ_build[0].name);
        Girl unhappy[]= new Girl[k];
        int j=0;
        for(int i=length-k;i<length;i++){
            g_committed_happ_build[i].status=0;
            b_committed_happ_build[i].status=0;
            unhappy[j]=g_committed_happ_build[i];
            // System.out.println("unhappy\t\t=="+unhappy[j].status);
            // unhappy[j].status=0;
            //System.out.println("unhappy\t\t=="+g_committed_happ_build[i].status);
            //g_committed_happ[i].status=0;
            j++;
        }
        int i=0;
        Boy b_assign[] = new Boy[1000];
        String csvFileb = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\boy_rand.csv";
        String line = "";
	String csvSplit = ",";
	BufferedReader buff = null;
	try{
		buff = new BufferedReader(new FileReader(csvFileb));
		while((line = buff.readLine() )!= null){
			String[] strb = line.split(csvSplit);
			b_assign[i] = new Boy();
                        b_assign[i].name = strb[0];
			b_assign[i].type = strb[1];
                        b_assign[i].attractiveness = Integer.parseInt(strb[2]);
			b_assign[i].budget = Integer.parseInt(strb[3]);
			b_assign[i].intelligence = Integer.parseInt(strb[4]); 
			b_assign[i].min_attract = Integer.parseInt(strb[5]); 
			b_assign[i].happiness=Integer.parseInt(strb[6]);
                        b_assign[i].compatibility=Integer.parseInt(strb[7]);
                        b_assign[i].status=Integer.parseInt(strb[8]);
                        //b[i].girl="";
				//b[i].status = boy[5];
                        i++;        
                    }
        }
	catch(FileNotFoundException e){
            e.printStackTrace();
	}
        catch(IOException e){
            e.printStackTrace();
	}
        
        for(j=0;j<length-k;j++){
            for(int z=0;z<i;z++){
                if(b_committed_happ_build[j].name==b_assign[z].name){
                    b_assign[z].status=1;
                }
            }
        }
        Girl_check_commit obj1=new Girl_check_commit();
        obj1.check1(unhappy,b_assign,k,i);
    }
    public void new_assign_1(int k){
        //System.out.println("name"+g_committed_happ_build[0].name);
        Girl unhappy[]= new Girl[k];
        int j=0;
        for(int i=length-k;i<length;i++){
            g_committed_happ_build[i].status=0;
            b_committed_happ_build[i].status=0;
            unhappy[j]=g_committed_happ_build[i];
            // System.out.println("unhappy\t\t=="+unhappy[j].status);
            // unhappy[j].status=0;
            //System.out.println("unhappy\t\t=="+g_committed_happ_build[i].status);
            //g_committed_happ[i].status=0;
            j++;
        }
        int i=0;
        Boy b_assign[] = new Boy[1000];
        String csvFileb = "C:\\Users\\sony\\Documents\\NetBeansProjects\\pplaf\\boy_rand.csv";
        String line = "";
	String csvSplit = ",";
	BufferedReader buff = null;
	try{
		buff = new BufferedReader(new FileReader(csvFileb));
		while((line = buff.readLine() )!= null){
			String[] strb = line.split(csvSplit);
			b_assign[i] = new Boy();
                        b_assign[i].name = strb[0];
			b_assign[i].type = strb[1];
                        b_assign[i].attractiveness = Integer.parseInt(strb[2]);
			b_assign[i].budget = Integer.parseInt(strb[3]);
			b_assign[i].intelligence = Integer.parseInt(strb[4]); 
			b_assign[i].min_attract = Integer.parseInt(strb[5]); 
			b_assign[i].happiness=Integer.parseInt(strb[6]);
                        b_assign[i].compatibility=Integer.parseInt(strb[7]);
                        b_assign[i].status=Integer.parseInt(strb[8]);
                        //b[i].girl="";
				//b[i].status = boy[5];
                        i++;        
                    }
        }
	catch(FileNotFoundException e){
            e.printStackTrace();
	}
        catch(IOException e){
            e.printStackTrace();
	}
        
        for(j=0;j<length-k;j++){
            for(int z=0;z<i;z++){
                if(b_committed_happ_build[j].name==b_assign[z].name){
                    b_assign[z].status=1;
                }
            }
        }
        Girl_check_commit_6 obj1=new Girl_check_commit_6();
        obj1.check1(unhappy,b_assign,k,i);
    }
    public void replace_bf(Girl g_broke[],Boy b_new_bf[],int no_g){
        //print();
        for(int i=0;i<no_g;i++){
            for(int j=0;j<length;j++){
                if(g_broke[i].name==g_committed[j].name){
                    b_committed[j]=b_new_bf[i];
                }
            }
        }
        //System.out.println("replace");
        //print();
        cal_happiness(no_gift);
    }
}