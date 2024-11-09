package wareHouseMiniProject;

import java.util.Arrays;

public class Warehouse {
   public Product[] shelf = new Product[6];

   public void addProduct(Product item, int shelfNumber){
       if(shelf[shelfNumber-1] == null){
           System.out.println("This shelf already contains " + shelf[shelfNumber-1].getProductName() + "please add put your product in another shelf");
       }else{
           shelf[shelfNumber-1] = item;

       }
   }
   public String showProducts(){
       return Arrays.toString(shelf);
   }
}
