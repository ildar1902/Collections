package driver;

import transport.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String name, boolean haveDriverLicense, int experience) {
        super(name, haveDriverLicense, experience);
    }

    @Override
    public void startDrive(Bus transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Bus transport) {
        transport.stop();
    }

    @Override
    public void refillAuto(Bus transport) {
        System.out.println("Водитель " + getName() + " заправляет автобус " + transport.getBrand());
    }
}
