import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("    Урок \"Коллекции\". ДЗ 1.");
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
                "Сергей Вачевский",
                true,
                8, DriverB.Category.B);

        Car toyota = new Car(
                "Toyota",
                "Altezza",
                2.0,
                dc1);
        toyota.addMechanic(fedor);
        toyota.addMechanic(petr);
        toyota.addSponsor(nikita);
        toyota.addSponsor(tnk);

        DriverB dc2 = new DriverB(
                "Станислав Родин",
                true,
                6, DriverB.Category.B);

        Car subaru = new Car(
                "Subaru",
                "Impreza",
                2.0,
                dc2);
        subaru.addMechanic(petr);
        subaru.addSponsor(tnk);

        DriverB dc3 = new DriverB(
                "Борис Макеев",
                true,
                7, DriverB.Category.B);
        Car honda = new Car(
                "Honda",
                "Accord",
                2.0,
                dc3);
        honda.addMechanic(fedor);
        honda.addSponsor(nikita);
        DriverB dc4 = new DriverB(
                "Роберт Ризванов",
                true,
                8, DriverB.Category.B);
        Car nissan = new Car(
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
                "Дуэйн Джонсон",
                true,
                6, DriverC.Category.C);

        Truck kamaz4310 = new Truck(
                "КамАЗ",
                "4310",
                10.8, dt1);
        kamaz4310.addMechanic(michael);
        kamaz4310.addSponsor(huawei);

        DriverC dt2 = new DriverC(
                "Райан Рейнольдс",
                true,
                12, DriverC.Category.C);

        Truck kamaz49250 = new Truck(
                "КамАЗ",
                "49250",
                11.8,
                dt2);
        kamaz49250.addMechanic(ivan);
        kamaz49250.addSponsor(lukoil);

        DriverC dt3 = new DriverC(
                "Хью Джекман",
                true,
                8, DriverC.Category.C);

        Truck kamaz49251 = new Truck(
                "КамАЗ",
                "49251",
                12.8, dt3);
        kamaz49251.addMechanic(michael);
        kamaz49251.addSponsor(samsung);

        DriverC dt4 = new DriverC(
                "Стив Роджерс",
                true,
                12, DriverC.Category.C);

        Truck kamaz49252 = new Truck(
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
                "Крис Эванс",
                true,
                9, DriverD.Category.D);

        Transport bus1 = new Bus(
                "Bus 1",
                "Bus Model 1",
                7.8, db1);
        bus1.addMechanic(konstantin);
        bus1.addSponsor(samsung);

        DriverD db2 = new DriverD(
                "Тони Старк",
                true,
                8, DriverD.Category.D);

        Transport bus2 = new Bus(
                "Bus 2",
                "Bus Model 2",
                8.5, db2);
        bus2.addMechanic(maks);
        bus2.addSponsor(lukoil);

        DriverD db3 = new DriverD(
                "Брюс Беннер",
                true,
                11, DriverD.Category.D);

        Transport bus3 = new Bus(
                "Bus 3",
                "Bus Model 3",
                9.0, db3);
        bus3.addMechanic(maks);
        bus3.addSponsor(nikita);

        DriverD db4 = new DriverD(
                "Питер Паркер",
                true,
                11, DriverD.Category.D);

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
        for (Transport value : competingAuto) {
            System.out.println(value);
        }
        System.out.println();
        for (Transport transport : competingAuto) {
            printInfo(transport);
        }
        System.out.println();
//        Дз2. Задание1
        System.out.println("    Урок \"Коллекции\". ДЗ2. Задание 1.");
        System.out.println();
        ServiceStation stoMasterov = new ServiceStation();
        stoMasterov.add(toyota);
        stoMasterov.add(subaru);
        stoMasterov.add(honda);
        stoMasterov.add(nissan);
        stoMasterov.add(kamaz4310);
        stoMasterov.add(kamaz49250);
        stoMasterov.add(kamaz49251);
        stoMasterov.add(kamaz49252);
        stoMasterov.service();
        System.out.println();
//Дз2. Задание 3.
        System.out.println("Дз 2. Задание 3.");
        example();
    }
    private static void example() {
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                biDemArrList.get(i).add(j,(i+j)%2==1 ? "●":"◯");
            }
        }


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void printInfo(Transport transport) {
        System.out.println("    Информация по транспорту \"" + transport.getBrand() + "\" \""
                + transport.getModel() + "\":");
        System.out.println("Водитель: " + transport.getDriver().toString());
        System.out.println("Спонсоры: " + transport.getSponsors());
        System.out.println("Механики: " + transport.getMechanics());
    }
}
