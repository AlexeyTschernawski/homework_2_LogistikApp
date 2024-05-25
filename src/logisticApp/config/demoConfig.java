package logisticApp.config;

import logisticApp.process.Dispo;
import logisticApp.process.Order;
import logisticApp.process.Sale;
import logisticApp.process.saleInfo.Customer;
import logisticApp.process.saleInfo.Product;
import logisticApp.process.shipment.Driver;
import logisticApp.process.shipment.Status;
import logisticApp.process.shipment.Vehicle;
import logisticApp.process.shipment.Warehouse;
import logisticApp.process.shipment.delivery.DeliveryStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class demoConfig {

    @Bean
    public Order order(){
        return new Order();
    }
    @Bean
    public Sale sale() {
        return new Sale();
    }
    @Bean
    public Dispo dispo () {
        return new Dispo();
    }
    @Bean
    public Status status() {
        return new Status();
    }

    @Bean
    public Warehouse warehouse() {
        return new Warehouse();
    }

    @Bean
    public Vehicle vehicle() {
        return new Vehicle();
    }

    @Bean
    public Driver driver() {
        return new Driver();
    }

    @Bean
    public Customer customer() {
        return new Customer();
    }

    @Bean
    public Product product() {
        return new Product();
    }
    @Bean
    public DeliveryStatus deliveryStatus() {
        return deliveryStatus();
    }
}
