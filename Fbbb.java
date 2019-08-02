/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbbb;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Fbbb {
    // tu reczne pozmienialem ceny itp urzylem ploskich nazw normalnie bym zrobil do tego metody
 public static void chen(){
     Listofproducts lista = new Listofproducts();
     Product typicalbred = new Product("normalbredRoll",7);
     Product typicalmeat = new Product("beef",13);
     Hamburger testOfhamburger = new Hamburger(typicalbred,typicalmeat);
      typicalbred.newCostAndName("brown rye bread roll", 20);
      
      typicalmeat.newCostAndName("fitbeef", 30);     
 Healthyburger testOfheal = new Healthyburger(typicalbred,typicalmeat);
 typicalbred.newCostAndName("vip bread roll", 21);
      typicalmeat.newCostAndName("no stres beef", 36);     
 Deluxehamburger testOfdelux = new Deluxehamburger(typicalbred,typicalmeat);
 Product marchewka = new Product("carrot",7);
 lista.addProduct("marchewka", marchewka);
 Product ser = new Product("ches",9);
  lista.addProduct("ser", ser);
  Product okon = new Product("fish",11);
   lista.addProduct("okon", okon);
  
 

 }

    static Scanner scanner = new Scanner(System.in);
     static Listofproducts map = new Listofproducts();
    public static void main(String[] args) {
        chen();
        Scanner scan = new Scanner(System.in);
       // String xd = scan.nextLine();
       // System.out.print(xd);
       int liczba;
       System.out.println("jaki burger chcialbys zamówic 1 clasichamburger 2 helfyHamburger 3 DeluxeHamBurger");
       liczba = scan.nextInt();       
        switch(liczba){
            case(1):
         Hamburger burger = new Hamburger();
         additionsAndCost(burger);
         break;
             case(2):
         Healthyburger healthyBurger = new Healthyburger();
         additionsAndCost(healthyBurger);
         break;
             case(3):
         Deluxehamburger deluxeHamburger = new Deluxehamburger();
         additionsAndCost(deluxeHamburger);
         break;
            default:
            
        }  
     
    }
    // nie wiedzialem gdzie to wsadzic
     private static void additionsAndCost(Hamburger burger) {
       
         
       
      int zmienna ;
      boolean sprawdzenie = true;
      while(sprawdzenie){      
      System.out.print(" co chciałbyś zrobić 1 zobaczyc bazowy koszt 2 zobaczyć calkowity koszt 3 dodać dodatek 4 kupic burgera ");
      zmienna = scanner.nextInt();
      switch(zmienna){
       case(1):
       System.out.print(burger.getBurgerCost());
        break;
        case(2):
       System.out.print(burger.getFullCost());
        break;
         case(3):
       System.out.print("napisz nazwe dodatku \n");
       String dodatek = scanner.nextLine();
       if(map.itKeyIsTrue(dodatek)){
       burger.addAddition(map.getProductFromTher(dodatek));        
       }
       else{
        System.out.print("niestety nie mamy tego dodatku \n");
       }  
         case(4):
         System.out.print("dziekujemy za zakupy do zapłaty " +burger.getFullCost() + " $");
             break;
             default:
           System.out.print("wybrałeś niepoprawny dodatek");
 
       }     
      }   
        }
      public static void additionsAndCost(Deluxehamburger burger) {
       
         
       
      int zmienna ;
      boolean sprawdzenie = true;
      while(sprawdzenie){      
      System.out.print(" co chciałbyś zrobić 1 zobaczyc bazowy koszt 2 zobaczyć calkowity koszt 3 dodać dodatek 4 kupic burgera ");
      zmienna = scanner.nextInt();
      switch(zmienna){
       case(1):
       System.out.print(burger.getBurgerCost());
        break;
        case(2):
       System.out.print(burger.getFullCost());
        break;
         case(3):
       System.out.print("napisz nazwe dodatku \n");
       String dodatek = scanner.nextLine();
               
               
       if(map.itKeyIsTrue(dodatek)){
       burger.addAddition(map.getProductFromTher(dodatek));        
       }
              
       else{
        System.out.print("niestety nie mamy tego dodatku\n");
       }  
         case(4):
         System.out.print("dziekujemy za zakupy do zapłaty \n" +burger.getFullCost());
             break;
             default:
           System.out.print("wybrałeś niepoprawny dodatek \n");
 
       }     
      }   
        }
   private static void additionsAndCost(Healthyburger burger) {
       
         
       
      
      
      int zmienna =0 ;
              
      while( zmienna !=4 ){
      System.out.print(zmienna);// test
                  
      System.out.print(" co chciałbyś zrobić 1 zobaczyc bazowy koszt 2 zobaczyć calkowity koszt 3 dodać dodatek 4 kupic burgera ");
      zmienna = scanner.nextInt();
      switch(zmienna){
       case(1):
       System.out.print(burger.getBurgerCost());
        break;
        case(2):
       System.out.print(burger.getFullCost());
        break;
         case(3):
       System.out.print("napisz nazwe dodatku \n");
       String dodatek = scanner.nextLine();// cos sie stało ze scanem i nie chce mi pobierac  stringa w rzadnym programie
       //System.out.println(dodatek);
       
       if(map.itKeyIsTrue(dodatek )){
       burger.addAddition(map.getProductFromTher(dodatek));        
       }
       else{
        System.out.print("niestety nie mamy tego dodatku \n");
       }  
        
            
         case(4):
         System.out.print("dziekujemy za zakupy do zapłaty \n" +burger.getFullCost()+ '$');
       
             break;
             default:
           System.out.print("wybrałeś niepoprawny dodatek \n");
 
       }     
      }   
        }
          
    
    
}
