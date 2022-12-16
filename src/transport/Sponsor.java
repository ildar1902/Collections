package transport;

import transport.Transport;

public class Sponsor {
    private final String name;
    private double amountOfSupport;

    public Sponsor(String name, double amountOfSupport) {
        this.name = name;
        setAmountOfSupport(amountOfSupport);
    }

    public void sponsored() {
        System.out.println("Спонсор \""+  getName() + "\"" + " спонсирует заезд на сумму " + amountOfSupport);
    }

    public String getName() {
        return name;
    }

    public double getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(double amountOfSupport) {
        if (amountOfSupport <= 0) {
            this.amountOfSupport = 100_000;
        } else {
            this.amountOfSupport = amountOfSupport;
        }
    }
}
