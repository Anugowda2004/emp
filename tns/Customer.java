package entity;

public class Customer extends User{
	private Cart cart;

    public Customer(int userId, String username, long contactNo) {
        super(userId, username, contactNo);
        this.cart = new Cart(); // every customer has a cart
    }

    public Cart getCart() {
        return cart;
    }
}

