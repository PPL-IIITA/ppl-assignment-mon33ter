
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.lang.reflect.*;
import static java.lang.Math.*;
import java.util.logging.Level;
 //compatibility->>>>b_committed[i].cost_of_gifts
//couple_happiness->>>b_committed[i].happiness

public class commited {
   static BOY b_committed[]= new BOY[1000];
   static Girl g_committed[] = new Girl[1000];
   static Gifts gift[] = new Gifts[1000];
   //static BOY temp_b= new BOY();
   //static Girl temp_g= new Girl();
   static BOY b_committed_comp[]= new BOY[1000];
   static Girl g_committed_comp[] = new Girl[1000];
   static BOY b_committed_happ[]= new BOY[1000];
   static Girl g_committed_happ[] = new Girl[1000];
   
    static int length;
    void bg_commited(BOY temp_b,Girl temp_g,int i){
        b_committed[i]=new BOY();
        b_committed[i]=temp_b;
        g_committed[i]=new Girl();
        g_committed[i]=temp_g;
        length=i;
       // System.out.println("\nlength==\t\t"+length);
      //  System.out.println(b_committed[i].name+"   "+b_committed[i].type+"   "+b_committed[i].attractiveness+"  "+b_committed[i].budget+"   "+b_committed[i].intelligence+"   "+b_committed[i].min_attract+"   "+b_committed[i].happiness);
       // System.out.println(g_committed[i].name+"   "+g_committed[i].type+"   "+g_committed[i].attractiveness+"  "+g_committed[i].budget+"   "+g_committed[i].intelligence+"   "+g_committed[i].happiness);
                     
    } 
    void sortcomp(BOY b_committed_comp[],Girl g_committed_comp[]){
        System.out.println("COUPLES IN HIGHEST COMPATIBILITY ORDER");
        Logger logger = Logger.getLogger("MyLogsortcomp");  
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
        }  
        for(int i=0;i<length;i++){
              for(int j=0;j<length;j++){
                  if(b_committed_comp[i].cost_of_gifts>b_committed_comp[j].cost_of_gifts){
                      BOY temp=new BOY();
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
            System.out.println(b_committed_comp[i].name+"\t"+b_committed_comp[i].type+"\t"+b_committed_comp[i].attractiveness+"\t"+b_committed_comp[i].budget+"\t"+b_committed_comp[i].intelligence+"\t"+b_committed_comp[i].min_attract+"\t"+b_committed_comp[i].happiness+"\t"+b_committed_comp[i].cost_of_gifts);
            System.out.println(g_committed_comp[i].name+"\t"+g_committed_comp[i].type+"\t"+g_committed_comp[i].attractiveness+"\t"+g_committed_comp[i].budget+"\t"+g_committed_comp[i].intelligence+"\t"+g_committed_comp[i].happiness);
          //  logger.info(b_committed_comp[i].name+"\t"+b_committed_comp[i].type+"\t"+b_committed_comp[i].attractiveness+"\t"+b_committed_comp[i].budget+"\t"+b_committed_comp[i].intelligence+"\t"+b_committed_comp[i].min_attract+"\t"+b_committed_comp[i].happiness+"\t"+b_committed_comp[i].cost_of_gifts);
           // logger.info(g_committed_comp[i].name+"\t"+g_committed_comp[i].type+"\t"+g_committed_comp[i].attractiveness+"\t"+g_committed_comp[i].budget+"\t"+g_committed_comp[i].intelligence+"\t"+g_committed_comp[i].happiness);
            
        }
    }
    void sorthapp(BOY b_committed_happ[],Girl g_committed_happ[]){
        System.out.println("COUPLES IN HIGHEST HAPPIEST ORDER");
        Logger logger = Logger.getLogger("MyLogsorthapp");  
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
        } 
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                  if(b_committed_happ[i].happiness>b_committed_happ[j].happiness){
                      BOY temp=new BOY();
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
            System.out.println(b_committed_happ[i].name+"\t"+b_committed_happ[i].type+"\t"+b_committed_happ[i].attractiveness+"\t"+b_committed_happ[i].budget+"\t"+b_committed_happ[i].intelligence+"\t"+b_committed_happ[i].min_attract+"\t"+b_committed_happ[i].happiness+"\t"+b_committed_happ[i].cost_of_gifts);
            System.out.println(g_committed_happ[i].name+"\t"+g_committed_happ[i].type+"\t"+g_committed_happ[i].attractiveness+"\t"+g_committed_happ[i].budget+"\t"+g_committed_happ[i].intelligence+"\t"+g_committed_happ[i].happiness);
           // logger.info(b_committed_comp[i].name+"\t"+b_committed_comp[i].type+"\t"+b_committed_comp[i].attractiveness+"\t"+b_committed_comp[i].budget+"\t"+b_committed_comp[i].intelligence+"\t"+b_committed_comp[i].min_attract+"\t"+b_committed_comp[i].happiness+"\t"+b_committed_comp[i].cost_of_gifts);
            //logger.info(g_committed_comp[i].name+"\t"+g_committed_comp[i].type+"\t"+g_committed_comp[i].attractiveness+"\t"+g_committed_comp[i].budget+"\t"+g_committed_comp[i].intelligence+"\t"+g_committed_comp[i].happiness);
            
        }
    }
    public void giftarray(Gifts temp,int i){
        gift[i]=new Gifts();
        gift[i]=temp;
       //System.out.println(gift[i].type+"   "+gift[i].price+"   "+gift[i].status);
    }
    void cal_happiness(int no_gifts){
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
        //             System.out.println(b_committed[i].name+"   "+b_committed[i].type+"   "+b_committed[i].attractiveness+"  "+b_committed[i].budget+"   "+b_committed[i].intelligence+"   "+b_committed[i].min_attract+"   "+b_committed[i].happiness+"   "+b_committed[i].cost_of_gifts);
        //             System.out.println(g_committed[i].name+"   "+g_committed[i].type+"   "+g_committed[i].attractiveness+"  "+g_committed[i].budget+"   "+g_committed[i].intelligence+"   "+g_committed[i].happiness);
        }
        for(int i=0;i<no_gifts;i++)
            System.out.println(gift[i].type+"   "+gift[i].price+"   "+gift[i].status+"   "+gift[i].value);
        
        */

       // logger.info("Hi How r u?");  
    
        int i,k=0,cost=0,x=no_gifts,value=0;
        for( i=0;i<length;i++){
            cost=0;value=0;k=0;
           // System.out.println(g_committed[i].type+"     g_committed[i].budget");
            if((b_committed[i].type.equalsIgnoreCase("Miser"))){
               // logger.log(Level.INFO, "MIser   {0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
                //System.out.println("g_committed[i].budget\t\t"+g_committed[i].budget+"cost==\t\t"+cost);
                while((g_committed[i].budget)>cost){
                    if(gift[k].status!=1){
                    logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                    //System.out.println("dsadsa\n\n\n");
                    cost+=gift[k].price;
                    value+=gift[k].value;
                    if(gift[k].type.equalsIgnoreCase("Luxury")){
                        b_committed[i].cost_of_gifts+=2*gift[k].price;
                    }
                    else{
                    b_committed[i].cost_of_gifts+=gift[k].price;
                    }
                    //logger.log(Level.INFO, "MIser    cost==\t{0}", cost);
                    gift[k].status=1;
                    }
                    k++;
                    if(k>=no_gifts)
                        break;
                    //logger.info("\ni===\t"+i+"\tk==\t"+k);
                }
                b_committed[i].happiness=b_committed[i].budget-cost;
              //  logger.log(Level.INFO, "b_committed[i].happiness== {0}   cost==  {1}", new Object[]{b_committed[i].happiness, cost});
                if(g_committed[i].type.equalsIgnoreCase("Choosy")){
                //    logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double t=Math.log(b_committed[i].cost_of_gifts+1);
                   // System.out.println("t==  "+t);
                    g_committed[i].happiness=(int)t;
                 //   logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Normal")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    g_committed[i].happiness=cost+value;
                 //   logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Desperate")){
                    //logger.log(Level.INFO, "MIser   {0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
                    double m=Math.log(cost);
                    g_committed[i].happiness=(int)m;
                 //   logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
             //   logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
              //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    
            }
            else if(b_committed[i].type.equalsIgnoreCase("Generous")){
                //logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
                while(b_committed[i].budget>=cost){
                    //System.out.println("fghghf\n");    
                    if(gift[k].status!=1){
                    logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                    cost+=gift[k].price;
                        value+=gift[k].value;
                        gift[k].status=1;
                    }
                    k++;
                    if(k>=no_gifts-1)
                        break;
                    // logger.info("\ni===\t"+i+"\tx==\t"+x);
                }
                b_committed[i].cost_of_gifts=cost;
               // logger.log(Level.INFO, "b_committed[i].happiness== {0}   cost==  {1}", new Object[]{b_committed[i].happiness, cost});
                if(g_committed[i].type.equalsIgnoreCase("Choosy")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double t=Math.log(b_committed[i].cost_of_gifts);
                    g_committed[i].happiness=(int)t;
                   // logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Normal")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    g_committed[i].happiness=cost+value;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Desperate")){
                 //   logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double m=Math.log(b_committed[i].cost_of_gifts);
                    g_committed[i].happiness=(int)m;
                   // logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                b_committed[i].happiness=g_committed[i].happiness;
              //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
              //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    
            }
            else if(b_committed[i].type.equalsIgnoreCase("Geeks")){
                //logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
               // logger.log(Level.INFO, "g_committed[i].budget== {0}   cost==  {1}  k=== {2}", new Object[]{g_committed[i].budget, cost,k});
                while(g_committed[i].budget>=cost){
                    if(gift[k].status!=1){
                    //logger.info("b_committed[i].name==\t\t"+i+"\tgift[k].type===\t"+k+"\tg_committed[i].name==\t"+i);
                    logger.info(b_committed[i].name+"\tgives\t"+gift[k].type+"\tto\t"+g_committed[i].name);
                    cost+=gift[k].price;
                    value+=gift[k].value;
                    gift[k].status=1;
                    }
                    k++;
                    if(k>=no_gifts-1)
                        break;
                    //logger.info("\ni===\t"+i+"\tk==\t"+k);
                }
                b_committed[i].cost_of_gifts=cost;
                int z=k;
                while(z<no_gifts){
                    if(gift[z].type.equalsIgnoreCase("Luxury")){
                        if((cost+gift[z].price)<b_committed[i].budget){
                            logger.info(b_committed[i].name+"\tgives\t"+gift[z].type+"\tto\t"+g_committed[i].name);
                    
                            cost+=gift[z].price;
                            b_committed[i].cost_of_gifts=cost+gift[z].price;
                            break;
                        }
                    }
                    z++;
                    if(z>=no_gifts-1)
                        break;
                    
                }
                
                b_committed[i].happiness=g_committed[i].intelligence;
               // logger.log(Level.INFO, "b_committed[i].happiness== {0}   cost==  {1}", new Object[]{b_committed[i].happiness, cost});
                if(g_committed[i].type.equalsIgnoreCase("Choosy")){
                 //   logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double t=Math.log(b_committed[i].cost_of_gifts);
                    g_committed[i].happiness=(int)t;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Normal")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    g_committed[i].happiness=cost+value;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
                else if(g_committed[i].type.equalsIgnoreCase("Desperate")){
                  //  logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});
                    double m=Math.log(cost);
                    g_committed[i].happiness=(int)m;
                  //  logger.log(Level.INFO, "g_committed[i].happiness== {0}", g_committed[i].happiness);
                
                }
               // logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}   {6}  {7}", new Object[]{b_committed[i].name, b_committed[i].type, b_committed[i].attractiveness, b_committed[i].budget, b_committed[i].intelligence, b_committed[i].min_attract, b_committed[i].happiness,b_committed[i].cost_of_gifts});
               // logger.log(Level.INFO, "{0}   {1}   {2}  {3}   {4}   {5}", new Object[]{g_committed[i].name, g_committed[i].type, g_committed[i].attractiveness, g_committed[i].budget, g_committed[i].intelligence, g_committed[i].happiness});    
            }
            b_committed[i].happiness+=g_committed[i].happiness;
            b_committed[i].cost_of_gifts=(b_committed[i].budget)-(g_committed[i].budget)+Math.abs((b_committed[i].attractiveness)-(g_committed[i].attractiveness))+Math.abs((b_committed[i].intelligence)-(g_committed[i].intelligence));
            //logger.log(Level.INFO, "b_committed[i].happiness== {0}", b_committed[i].happiness);
            //logger.log(Level.INFO, "b_committed[i].cost_of_gifts== {0}", b_committed[i].cost_of_gifts);        
        }
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
    logger.info("----------------COMMITTED----------------");
         for(int i=0;i<length;i++)
                {
                    //System.out.println("fsafa\n");
                    // logger.info("b_committed[i].name==\t\t"+b_committed[i].name+"g_committed[i].name==\t\t"+g_committed[i].name+"\ti==\t"+i);
                     logger.info("length==\t\t"+length+"\t\t"+b_committed[i].name+"   "+b_committed[i].type+"   "+b_committed[i].attractiveness+"  "+b_committed[i].budget+"   "+b_committed[i].intelligence+"   "+b_committed[i].min_attract+"   "+b_committed[i].happiness+"   "+b_committed[i].cost_of_gifts);
                     logger.info(g_committed[i].name+"   "+g_committed[i].type+"   "+g_committed[i].attractiveness+"  "+g_committed[i].budget+"   "+g_committed[i].intelligence+"   "+g_committed[i].happiness);
                }
    }
}