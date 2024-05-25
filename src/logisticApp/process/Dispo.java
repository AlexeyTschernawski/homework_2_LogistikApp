package logisticApp.process;

import logisticApp.process.shipment.Driver;
import logisticApp.process.shipment.Status;
import logisticApp.process.shipment.Vehicle;
import logisticApp.process.shipment.Warehouse;
import org.springframework.beans.factory.annotation.Autowired;

public class Dispo {

    @Autowired
    private Driver driver;
    @Autowired
    private Vehicle vehicle;
    @Autowired
    private Warehouse warehouse;
    @Autowired
    private Status status;

//    public void setDriver(Driver driver) {
//        this.driver = driver;
//    }
//
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
//
//    public void setWarehouse(Warehouse warehouse) {
//        this.warehouse = warehouse;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }


    public void giveInfo() {
        driver.name();
        vehicle.name();
        warehouse.name();
        status.giveStatus();
    }
}
