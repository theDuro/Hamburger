/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbbb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Hamburger {

 static private Product bredRoll;
static private Product meat;
Hamburger(){
    
}
Hamburger(Product bredRoll,Product meat){
this.bredRoll = bredRoll;
this.meat = meat;
}
List<Product> additions = new ArrayList<>();   
public void addAddition(Product addit){
additions.add(addit);

}
public int  getBurgerCost(){
 return getBredRoll().getCost()+getMeat().getCost();
}
public int getFullCost(){
 int cost =getBurgerCost();
 for(int i = 0; i<additions.size()-1;i++){
 cost+=additions.get(i).getCost();
    
 }
  return cost;
}

    /**
     * @return the bredRoll
     */
    public Product getBredRoll() {
        return bredRoll;
    }

    /**
     * @param bredRoll the bredRoll to set
     */
    public void setBredRoll(Product bredRoll) {
        this.bredRoll = bredRoll;
    }

    /**
     * @return the meat
     */
    public Product getMeat() {
        return meat;
    }

    /**
     * @param meat the meat to set
     */
    public void setMeat(Product meat) {
        this.meat = meat;
    }
}

