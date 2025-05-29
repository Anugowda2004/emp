package service;
import entity.*;

import java.util.ArrayList;
import java.util.List;


public class CustomerService {
	private List<Customer> customers = new ArrayList<>();
    private AdminService adminService;

    public CustomerService(AdminService adminService) {
        this.adminService = adminService;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer created successfully!");
    }

    public void viewFoodItems() {
        adminService.viewRestaurantsAndMenus();
    }

    public void addFoodToCart(int customerId, int restaurantId, int foodItemId, int quantity) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            for (Restaurant restaurant : adminService.getRestaurants()) {
                if (restaurant.getId() == restaurantId) {
                    for (FoodItem item : restaurant.getMenu()) {
                        if (item.getId() == foodItemId) {
                            customer.getCart().addItem(item, quantity);
                            System.out.println("Food item added to cart!");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("Customer or Food item not found!");
    }
    public void viewCart(int customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            System.out.println(customer.getCart());
        } else {
            System.out.println("Customer not found!");
        }
    }

    public void placeOrder(int customerId) {
        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            int orderId = adminService.getOrders().size() + 1;
            Order order = new Order(orderId, customer);
            order.getItems().putAll(customer.getCart().getItems());
            adminService.addOrder(order);
            customer.getCart().getItems().clear(); // Clear cart after placing order
            System.out.println("Order placed successfully! Your order ID is: " + orderId);
        } else {
            System.out.println("Customer not found!");
        }
    }

    public void viewOrders(int customerId) {
        for (Order order : adminService.getOrders()) {
            if (order.getCustomer().getUserId() == customerId) {
                System.out.println(order);
            }
        }
    }

    private Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getUserId() == customerId) {
            	 return customer;
            }
        }
        return null;
    }
}


