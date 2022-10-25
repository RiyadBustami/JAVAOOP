import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1=new Item();
        item1.name="Mocha";
        item1.price=12;
        Item item2=new Item();
        item2.name="Latte";
        item2.price=11;
        Item item3=new Item();
        item3.name="Drip Coffee";
        item3.price=18;
        Item item4=new Item();
        item4.name="Capuccino";
        item4.price=15;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        order1.name="Cindhuri";
        order1.total=0;
        order1.ready=True;
        order2.name="Jimmy";
        order2.total=0;
        order2.ready=True;
        order2.items.add(item1);
        order3.name="Noah";
        order3.total=0;
        order3.ready=false;
        order3.items.add(item4);
        order4.name="Sam";
        order4.total=0;
        order4.ready=false;
        order4.items.add(item2);
        order4.items.add(item2);
        System.out.println(order1);
        
        // or
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.print(order1.items.get(1).name);
    }
}
