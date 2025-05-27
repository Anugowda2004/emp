package main;
import entity.*;
import service.*;

import java.util.Scanner;


public class FoodDeliveryApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdminService adminService = new AdminService();
        CustomerService customerService = new CustomerService(adminService);

        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    adminMenu(sc, adminService);
                    break;
                case 2:
                    customerMenu(sc, customerService);
                    break;
                case 3:
                    System.out.println("Exiting Application!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void adminMenu(Scanner sc, AdminService adminService) {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add Restaurant");
            System.out.println("2. Add Food Item to Restaurant");
            System.out.println("3. Remove Food Item from Restaurant");
            System.out.println("4. View Restaurants and Menus");
            System.out.println("5. View Orders");
            System.out.println("6. Add Delivery Person");
            System.out.println("7. Assign Delivery Person to Order");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Restaurant ID: ");
                    int rid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Restaurant Name: ");
                    String rname = sc.nextLine();
                    adminService.addRestaurant(new Restaurant(rid, rname));
                    break;
                case 2:
                    System.out.print("Enter Restaurant ID: ");
                    int restId = sc.nextInt();
                    System.out.print("Enter Food Item ID: ");
                    int fid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Food Item Name: ");
                    String fname = sc.nextLine();
                    System.out.print("Enter Food Item Price: ");
                    double fprice = sc.nextDouble();
                    adminService.addFoodItemToRestaurant(restId, new FoodItem(fid, fname, fprice));
                    break;
                case 3:
                    System.out.print("Enter Restaurant ID: ");
                    int restId2 = sc.nextInt();
                    System.out.print("Enter Food Item ID to Remove: ");
                    int fid2 = sc.nextInt();
                    adminService.removeFoodItemFromRestaurant(restId2, fid2);
                    break;
                case 4:
                    adminService.viewRestaurantsAndMenus();
                    break;
                case 5:
                    adminService.viewOrders();
                    break;
                case 6:
                    System.out.print("Enter Delivery Person ID: ");
                    int dpId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Delivery Person Name: ");
                    String dpName = sc.nextLine();
                    System.out.print("Enter Contact No.: ");
                    long dpContact = sc.nextLong();
                    adminService.addDeliveryPerson(new DeliveryPerson(dpId, dpName, dpContact));
                    break;
                case 7:
                    System.out.print("Enter Order ID: ");
                    int oid = sc.nextInt();
                    System.out.print("Enter Delivery Person ID: ");
                    int dpid = sc.nextInt();
                    adminService.assignDeliveryPerson(oid, dpid);
                    break;
                case 8:
                    System.out.println("Exiting Admin Module");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void customerMenu(Scanner sc, CustomerService customerService) {
        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. View Food Items");
            System.out.println("3. Add Food to Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. View Orders");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Username: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter Contact No.: ");
                    long contact = sc.nextLong();
                    customerService.addCustomer(new Customer(uid, uname, contact));
                    break;
                case 2:
                    customerService.viewFoodItems();
                    break;
                case 3:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter Restaurant ID: ");
                    int restid = sc.nextInt();
                    System.out.print("Enter Food Item ID: ");
                    int fid = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    customerService.addFoodToCart(cid, restid, fid, qty);
                    break;
                case 4:
                	System.out.print("Enter Customer ID: ");
                    int cid2 = sc.nextInt();
                    customerService.viewCart(cid2);
                    break;
                case 5:
                    System.out.print("Enter Customer ID: ");
                    int cid3 = sc.nextInt();
                    customerService.placeOrder(cid3);
                    break;
                case 6:
                    System.out.print("Enter Customer ID: ");
                    int cid4 = sc.nextInt();
                    customerService.viewOrders(cid4);
                    break;
                case 7:
                    System.out.println("Exiting Customer Module");
                    return;
                default:
                	System.out.println("Invalid option.");
                    
            }
        }
    }
}


