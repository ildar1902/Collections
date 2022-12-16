package transport;


import driver.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final Driver<?> driver;
    private final List<Mechanic<?>> mechanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume, Driver<?> driver) {
        if (StringUtils.isNotEmpty(brand)) {
            this.brand = brand;
        } else {
            this.brand = "Укажите марку";
        }
        if (StringUtils.isNotEmpty(model)) {
            this.model = model;
        } else {
            this.model = "Укажите модель";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.driver = driver;
    }

    public Driver<?> getDriver() {
        return driver;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public void addSponsor(Sponsor sponsor) {
        sponsors.add(sponsor);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void start();

    public abstract void stop();

    public abstract boolean diagnostics();


    @Override
    public String toString() {
        return "\"" + brand + "\" \"" +
                model +"\"" +
                ", объём двигателя: " + engineVolume;
    }

    public abstract void fix();
}
