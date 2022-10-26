import java.util.ArrayList;
public class OrderKiosk{
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;
    public OrderKiosk(){
        menu = new ArrayList<Item>();
        orders = new ArrayList<Order>();
    }
    public void addMenuItem(String name, double price){
        Item item = new Item(name,price);
        this.menu.add(item);
    }
    public void displayMenu(){
        for(int i=0;i<this.menu.size();i++){
            System.out.println(i+" "+this.menu.get(i).getName()+" -- $"+this.menu.get(i).getPrice());
        }
    }
    public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        
    	// Your code:
        Order order=new Order(name);
        // Show the user the menu, so they can choose items to add.
        this.displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            order.addItem(this.menu.get(Integer.parseInt(itemNumber)));
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        order.display();
    	// as the example below. You may use the order's display method.
        this.orders.add(order);
        
    }

}