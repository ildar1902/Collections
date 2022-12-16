import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("    Урок \"Коллекции\". Задание 1.");
        System.out.println();
        Mechanic<Car> fedor = new Mechanic<>(
                "Фёдор",
                "Фёдоров",
                "Garage");

        Mechanic<Car> petr = new Mechanic<>(
                "Пётр",
                "Петров",
                "Garage");

        Sponsor nikita = new Sponsor(
                "ИП \"Никита\"",
                800_000);
        nikita.sponsored();

        Sponsor tnk = new Sponsor(
                "ТНК-НВ",
                3_000_000);
        tnk.sponsored();

        Sponsor lukoil = new Sponsor(
                "Лукойл",
                3_500_000);
        lukoil.sponsored();

        Sponsor huawei = new Sponsor(
                "Huawei",
                1_500_000);
        huawei.sponsored();

        Sponsor samsung = new Sponsor("Samsung", 2_500_000);
        DriverB dc1 = new DriverB(
                "name1",
                true,
                8);

        Transport toyota = new Car(
                "Toyota",
                "Altezza",
                2.0,
                dc1);
        toyota.addMechanic(fedor);
        toyota.addMechanic(petr);
        toyota.addSponsor(nikita);
        toyota.addSponsor(tnk);

        DriverB dc2 = new DriverB(
                "name2",
                true,
                6);

        Transport subaru = new Car(
                "Subaru",
                "Impreza",
                2.0,
                dc2);
        subaru.addMechanic(petr);
        subaru.addSponsor(tnk);

        DriverB dc3 = new DriverB(
                "name3",
                true,
                7);
        Transport honda = new Car(
                "Honda",
                "Accord",
                2.0,
                dc3);
        honda.addMechanic(fedor);
        honda.addSponsor(nikita);
        DriverB dc4 = new DriverB(
                "name10",
                true,
                8);
        Transport nissan = new Car(
                "Nissan",
                "Skyline",
                2.4,
                dc4);
        nissan.addMechanic(fedor);
        nissan.addMechanic(petr);
        nissan.addSponsor(samsung);

        Mechanic<Truck> michael = new Mechanic<>(
                "Михаил",
                "Михайлов",
                "СТО \"У Михалыча\"");

        Mechanic<Truck> ivan = new Mechanic<>(
                "Иван",
                "Иванов",
                "СТО \"У Михалыча\"");

        DriverC dt1 = new DriverC(
                "name4",
                true,
                6);

        Transport kamaz4310 = new Truck(
                "КамАЗ",
                "4310",
                10.8, dt1);
        kamaz4310.addMechanic(michael);
        kamaz4310.addSponsor(huawei);

        DriverC dt2 = new DriverC(
                "name11",
                true,
                12);

        Transport kamaz49250 = new Truck(
                "КамАЗ",
                "49250",
                11.8,
                dt2);
        kamaz49250.addMechanic(ivan);
        kamaz49250.addSponsor(lukoil);

        DriverC dt3 = new DriverC(
                "name5",
                true,
                8);

        Transport kamaz49251 = new Truck(
                "КамАЗ",
                "49251",
                12.8, dt3);
        kamaz49251.addMechanic(michael);
        kamaz49251.addSponsor(samsung);

        DriverC dt4 = new DriverC(
                "name6",
                true,
                12);

        Transport kamaz49252 = new Truck(
                "КамАЗ",
                "49252",
                17.2, dt4);
        kamaz49252.addMechanic(ivan);
        kamaz49252.addSponsor(tnk);

        Mechanic<Bus> konstantin = new Mechanic<>(
                "Костя",
                "Хабенский",
                "\"Fix Auto Premium Grand Plus Max\"");

        Mechanic<Bus> maks = new Mechanic<>(
                "Максим",
                "Лавров",
                "\"Fix Auto Premium Grand Plus Max\"");

        DriverD db1 = new DriverD(
                "name7",
                true,
                9);

        Transport bus1 = new Bus(
                "Bus 1",
                "Bus Model 1",
                7.8, db1);
        bus1.addMechanic(konstantin);
        bus1.addSponsor(samsung);

        DriverD db2 = new DriverD(
                "name8",
                true,
                8);

        Transport bus2 = new Bus(
                "Bus 2",
                "Bus Model 2",
                8.5, db2);
        bus2.addMechanic(maks);
        bus2.addSponsor(lukoil);

        DriverD db3 = new DriverD(
                "name9",
                true,
                11);

        Transport bus3 = new Bus(
                "Bus 3",
                "Bus Model 3",
                9.0, db3);
        bus3.addMechanic(maks);
        bus3.addSponsor(nikita);

        DriverD db4 = new DriverD(
                "name12",
                true,
                11);

        Transport bus4 = new Bus(
                "Bus 4",
                "Bus Model 4",
                9.5, db4);
        bus4.addMechanic(maks);
        bus4.addSponsor(huawei);

        List<Transport> competingAuto = List.of(
                toyota, subaru, honda, nissan,
                kamaz4310, kamaz49250, kamaz49251, kamaz49252,
                bus1, bus2, bus3, bus4);
        System.out.println();
        printInfo(toyota);
        System.out.println();

        System.out.println("    Список всех участников: ");
        for (int i = 0; i < competingAuto.size(); i++) {
            System.out.println(competingAuto.get(i));
        }
    }

    public static void printInfo(Transport transport) {
        System.out.println("    Информация по транспорту \"" + transport.getBrand() + "\" \""
                + transport.getModel() + "\":");
        System.out.println("Водитель: " + transport.getDriver().getName());
        System.out.println("Спонсоры:");
        for (int i = 0; i < transport.getSponsors().size(); i++) {
            System.out.println(transport.getSponsors().get(i).getName());
        }
        System.out.println("Механики:");
        for (int i = 0; i < transport.getMechanics().size(); i++) {
            System.out.println(transport.getMechanics().get(i).getSurname() + " "
                    + transport.getMechanics().get(i).getName());
        }
    }
}
