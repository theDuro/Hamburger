/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbbb;


public class Deluxehamburger extends Hamburger {
  static private Product cheps = new Product("cheps", 5);
  static private Product drinck = new Product("drink",3);
  Deluxehamburger(){
      additions.add(cheps);
      additions.add(drinck);     
  }
  Deluxehamburger(Product bredRoll,Product meat){
      super( bredRoll,meat);
      additions.add(cheps);
      additions.add(drinck);      
  }
 @Override
 public void addAddition(Product addit){
  System.out.print(" w tym burgerze nie morzesz dodac extra dodatków");
  
}  
 
  }
    

