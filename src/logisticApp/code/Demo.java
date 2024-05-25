package logisticApp.code;

import logisticApp.process.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Demo {
    public static void main(String[] args) {

        // option NON Spring

//        DeliveryStatus deliveryStatus = new DeliveryStatus();
//
//        Driver driver = new Driver();
//        Vehicle vehicle = new Vehicle();
//        Warehouse warehouse = new Warehouse();
//        Status status = new Status();
//        status.setDeliveryStatus(deliveryStatus);
//
//
//        Customer customer = new Customer();
//        Product product = new Product();
//
//        Sale sale = new Sale();
//        sale.setCustomer(customer);
//        sale.setProduct(product);
//
//        Dispo dispo = new Dispo();
//        dispo.setDriver(driver);
//        dispo.setVehicle(vehicle);
//        dispo.setWarehouse(warehouse);
//        dispo.setStatus(status);
//
//        Order order = new Order();
//        order.setSale(sale);
//        order.setDispo(dispo);
//
//        order.giveOrder();

        // option WITH Spring

        AbstractApplicationContext context = new AnnotationConfigApplicationContext("app.config");
        Order order = context.getBean(Order.class);
        order.giveOrder();
    }
}
