package entity;

public class FoodItem {
	 private int id;
	    private String name;
	    private double price;

	    public FoodItem(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	    @Override
	    public String toString() {
	        return "FoodItem [id=" + id + ", name=" + name + ", price=" + price + "]";
	    }
	}
