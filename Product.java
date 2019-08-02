/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbbb;

/**
 *
 * @author LENOVO
 */
public class Product {
    private String name;
    private int cost;
   public  Product(String name,int cost){
    this.cost = cost > 0 ? cost : 0;
    this.name =name;
    }
   public void newCostAndName(String newName, int newCost){
  cost = newCost > 0 ? newCost : 0; 
  name = newName;
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }
    
    
    
}
