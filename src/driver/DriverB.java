package driver;

import transport.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String name, boolean haveDriverLicense, int experience) {
        super(name, haveDriverLicense, experience);
    }

    @Override
    public void startDrive(Car transport) {
        transport.start();
    }

    @Override
    public void stopDrive(Car transport) {
        transport.stop();
    }

    @Override
    public void refillAuto(Car transport) {
        System.out.println("Водитель " + getName() + " заправляет автомобиль " + transport.getBrand());
    }

}
