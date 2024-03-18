
package com.mycompany.restaurantApp;

import food.Dish;
import food.Menu;
import people.Customer;
import values.CustomerRole;
import values.DishType;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer (CustomerRole.STUDENT, "asd", "Fulanito de tal");
        student.sellFood();
        
        Customer administrative = new Customer (CustomerRole.ADMINISTRATIVE, "hfdvuhds", "fulanito de tal");
        administrative.sellFood();
        
        Menu menu = new Menu();
        
        Dish breakfast1 = new Dish(DishType.BREACKFAST, "Huevo Fritos", "Huevos, sal y pimienta", 2400 , 20);
        Dish breakfast2 = new Dish(DishType.BREACKFAST, "Papa rellena", "Huevos, carne y papa", 2400 , 14);
        Dish lunch1 = new Dish(DishType.LUNCH, "Carne asada", "Arroz, papa, Patacones y ensalada", 2400 , 28);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        
        System.out.println(menu.getDishesPerType(DishType.BREACKFAST)); 
    }

}
