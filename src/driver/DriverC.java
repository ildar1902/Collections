package driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {
    public DriverC(String name, boolean haveDriverLicense, int experience) {
        super(name, haveDriverLicense, experience);
    }

    @Override
    public void startDrive(Truck transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Truck transport) {
        transport.stop();
    }

    @Override
    public void refillAuto(Truck transport) {
        System.out.println("Водитель " + getName() + " заправляет грузовик " + transport.getBrand());
    }
}
