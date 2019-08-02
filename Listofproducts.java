/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fbbb;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public  class Listofproducts {
private static Map<String , Product> listOfprod = new HashMap<>();
public void addProduct(String kay, Product productTOadd){
 listOfprod.put(kay, productTOadd);
}
public Product getProductFromTher(String productKay ){
return listOfprod.get(productKay);
}
public static boolean itKeyIsTrue(String productKay ){//niewiem czy poprawnie
return listOfprod.containsKey(productKay);
}
}
