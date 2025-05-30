package entity;
import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("unused")
public class Cart {
	  private Map<FoodItem, Integer> items;

	    public Cart() {
	        items = new HashMap<>();
	    }

	    public void addItem(FoodItem foodItem, int quantity) {
	        items.put(foodItem, items.getOrDefault(foodItem, 0) + quantity);
	    }

	    public void removeItem(FoodItem foodItem) {
	        items.remove(foodItem);
	    }

	    public Map<FoodItem, Integer> getItems() {
	        return items;
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        double total = 0.0;
	        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
	            FoodItem food = entry.getKey();
	            int qty = entry.getValue();
	            double cost = food.getPrice() * qty;
	            sb.append("Food Item: ").append(food.getName())
	              .append(", Quantity: ").append(qty)
	              .append(", Cost: Rs. ").append(cost).append("\n");
	            total += cost;
	        }
	        sb.append("Total Cost: Rs. ").append(total);
	        return sb.toString();
	    }
	}
