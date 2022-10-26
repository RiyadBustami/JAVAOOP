class BaristaTest{
    public static void main(String[] args){
        Order order1=new Order();
        Order order2=new Order();
        Order order3=new Order("Riyad");
        Order order4=new Order("Reina");
        Order order5=new Order("Saeed");
        order1.addItem(new Item("Cafe",5));
        order1.addItem(new Item("Latte",12));
        order1.display();
        order2.addItem(new Item("Orange Juice",18));
        order2.addItem(new Item("Oreo Milkshake",18));
        order2.display();
        order3.addItem(new Item("Ahmad Tea",5));
        order3.addItem(new Item("Hot Chocolate",15));
        order3.display();
        order4.addItem(new Item("Mocha",16));
        order4.addItem(new Item("Cappuccino",20));
        order4.display();
        order5.addItem(new Item("Orange Juice",18));
        order5.addItem(new Item("Ahmad Tea",5));
        order5.display();
        order1.setReady();
        System.out.println(order1.getStatusMessage());
    }
}