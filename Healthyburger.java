/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbbb;


public class Healthyburger extends Hamburger {
    static private Product salat = new Product("salat", 5);
  static private Product fitdeep = new Product("fitdeep",3);
  Healthyburger(){
  additions.add(salat);
  additions.add(fitdeep);    
  }
  Healthyburger(Product bredRoll,Product meat){
      super(bredRoll,meat);
      additions.add(salat);
      additions.add(fitdeep);      
  }
 @Override
 public void addAddition(Product addit){
  if(additions.size()<6) additions.add(addit);
  else System.out.print("nie morzesz dodac wiecej dodatkow");
}
 
    
}
