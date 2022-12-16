package transport;

import transport.Transport;

import java.util.ArrayList;
import java.util.List;

public class Mechanic<T extends Transport> {
    private final String name;
    private final String surname;
    private String company;

    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public boolean service(T t) {
        return t.diagnostics();
    }

    public void fix(T t) {
        t.fix();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return name + " " + surname +
                " из компании \"" + company + "\"";
    }
}
