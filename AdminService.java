package service;
import entity.*;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
    private List<Restaurant> restaurants = new ArrayList<>();
    private List<DeliveryPerson> deliveryPersons = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
        System.out.println("Restaurant added successfully!");
    }

    public void addFoodItemToRestaurant(int restaurantId, FoodItem foodItem) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {
                restaurant.addFoodItem(foodItem);
                System.out.println("Food item added successfully!");
                return;
            }
        }
        System.out.println("Restaurant not found!");
    }

    public void removeFoodItemFromRestaurant(int restaurantId, int foodItemId) {
        for (Restaurant restaurant : restaurants) {
            if (restaurant.getId() == restaurantId) {
                restaurant.removeFoodItem(foodItemId);
                System.out.println("Food item removed successfully!");
                return;
            }
        }
        System.out.println("Restaurant not found!");
    }

    public void viewRestaurantsAndMenus() {
        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant ID: " + restaurant.getId() + ", Name: " + restaurant.getName());
            for (FoodItem item : restaurant.getMenu()) {
                System.out.println("- Food Item ID: " + item.getId() + ", Name: " + item.getName() + ", Price: Rs. " + item.getPrice());
            }
        }
    }

    public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
        deliveryPersons.add(deliveryPerson);
        System.out.println("Delivery person added successfully!");
    }

    public void viewOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void assignDeliveryPerson(int orderId, int deliveryPersonId) {
        Order order = findOrderById(orderId);
        DeliveryPerson deliveryPerson = findDeliveryPersonById(deliveryPersonId);
        if (order != null && deliveryPerson != null) {
            order.setDeliveryPerson(deliveryPerson);
            System.out.println("Delivery person assigned to order successfully!");
        } else {
            System.out.println("Order or Delivery Person not found!");
        }
    }
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    private Order findOrderById(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    private DeliveryPerson findDeliveryPersonById(int deliveryPersonId) {
        for (DeliveryPerson deliveryPerson : deliveryPersons) {
            if (deliveryPerson.getDeliveryPersonId() == deliveryPersonId) {
                return deliveryPerson;
            }
        }
        return null;
    }
}



