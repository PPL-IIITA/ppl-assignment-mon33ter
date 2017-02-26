/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sony
 */
public class BOY {
    String name;
    String type;
    int  attractiveness;
    int budget;
    int intelligence;
    int min_attract; 
    int happiness;
    public int cost_of_gifts;
    /*public BOY(String name,String type,int budget,int intelligence,int min_attract,int attractiveness){
        this.name=name;
        this.type=type;
        this.budget=budget;
        this.min_attract=min_attract;
        this.intelligence=intelligence;
        this.attractiveness=attractiveness;
    }*/
    /*int commit(int budget1,int attract1){
      //  System.out.println("     "+this.budget+"  >   "+budget1+"   && "+this.min_attract+"  >   "+attract1);
            
        if(this.budget>=budget1 && this.min_attract<attract1){
           System.out.println("     "+this.budget+"  >   "+budget1+"   && "+this.min_attract+"  >   "+attract1);
           return 1;
        }
        return -1;
    } */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAttractiveness() {
        return attractiveness;
    }

    public void setAttractiveness(int attractiveness) {
        this.attractiveness = attractiveness;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMin_attract() {
        return min_attract;
    }

    public void setMin_attract(int min_attract) {
        this.min_attract = min_attract;
    }
}
