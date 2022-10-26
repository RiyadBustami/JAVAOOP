import java.util.ArrayList;
public class Order{
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;
    public Order(){
        this.name="Guest";
        this.total=0.0;
        this.ready=false;
        this.items=new ArrayList<Item>();
    }
    public Order(String name){
        this.name=name;
        this.total=0.0;
        this.ready=false;
        this.items=new ArrayList<Item>();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setReady(){
        this.ready=true;
    }
    public void setNotReady(){
        this.ready=false;
    }
    public boolean isReady(){
        return this.ready;
    }
    public String getStatusMessage(){
        return (this.isReady()? "Your order is ready.":"Thank you for waiting. Your order will be ready soon.");
    }
    public void addItem(Item item){
        this.items.add(item);
        this.total+=item.getPrice();
    }
    public void addItem(String name,double price){
        Item item =new Item(name,price);
        this.items.add(item);
        this.total+=item.getPrice();
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public double getTotal(){
        return this.total;
    }
    public void  display(){
        System.out.println("Customer Name: "+this.name);
        for(int i=0;i<this.items.size();i++){
        System.out.println(this.items.get(i).getName()+" - $"+this.items.get(i).getPrice());
        }
        System.out.println("Total: $"+this.total);
    }
    public double getOrderTotal(){
        double sum=0.0;
        for(int i=0;i<this.items.size();i++){
            sum+=this.items.get(i).getPrice();
        }
        return sum;
    }
}