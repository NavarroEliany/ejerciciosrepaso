
package com.mycompany.restaurantApp;

import people.Customer;
import values.CustomerRole;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer (CustomerRole.STUDENT, "asd", "Fulanito de tal");
        student.sellFood();
        
        Customer administrative = new Customer (CustomerRole.ADMINISTRATIVE, "hfdvuhds", "fulanito de tal");
        administrative.sellFood();

    }

}
