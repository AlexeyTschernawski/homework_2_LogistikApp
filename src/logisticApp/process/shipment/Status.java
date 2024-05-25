package logisticApp.process.shipment;

import logisticApp.process.shipment.delivery.DeliveryStatus;
import org.springframework.beans.factory.annotation.Autowired;

public class Status {

    @Autowired
    private DeliveryStatus deliveryStatus;

//    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
//        this.deliveryStatus = deliveryStatus;
//    }

    public void giveStatus() {
        deliveryStatus.info();
    }
}
