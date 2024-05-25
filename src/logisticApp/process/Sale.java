package logisticApp.process;

import logisticApp.process.saleInfo.Customer;
import logisticApp.process.saleInfo.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class Sale {

    @Autowired
    private Customer customer;
    @Autowired
    private Product product;

//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }

    public void giveInfo(){
        customer.name();
        product.name();
    }
}
