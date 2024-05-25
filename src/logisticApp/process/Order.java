package logisticApp.process;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

    @Autowired
    private Dispo dispo;
    @Autowired
    private Sale sale;

//    public void setDispo(Dispo dispo) {
//        this.dispo = dispo;
//    }
//
//    public void setSale(Sale sale) {
//        this.sale = sale;
//    }

    public void giveOrder() {
        sale.giveInfo();
        dispo.giveInfo();
    }
}
