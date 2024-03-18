
package food;

import values.DishType;

public class Dish {
    //control+shit
   private DishType type;
   private String name;
   private String ingredients; //TODO:convertir a una lista
   private int price;
   private int qty; 

    public Dish(DishType type, String name, String ingredients, int price, int qty) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.qty = qty;
    }
   public DishType getType(){
       return this.type;
   }

    public String getName() {
        return name;
    }
   
}
