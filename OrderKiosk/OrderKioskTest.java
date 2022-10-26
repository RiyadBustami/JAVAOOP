public class OrderKioskTest{
    public static void main(String[] args){
        OrderKiosk kiosk = new OrderKiosk();
        kiosk.addMenuItem("Latte",2.2);
        kiosk.addMenuItem("Drip Coffee",3.5);
        kiosk.addMenuItem("Pecan Pie",5.2);
        kiosk.newOrder();

    }
}