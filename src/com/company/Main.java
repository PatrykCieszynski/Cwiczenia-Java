package com.company;

import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human("Patryk", "Cieszyński", "123456789");
        Phone nokia = new Phone("3310", "Nokia", 1990, 5.0, "Android", me);
        Human brother = new Human("Jan", "Nowak", "123456789");
        me.cash = 150.0;
        brother.cash = 125.0;

        me.phone.sell(me, brother, 5.0);
        Application teams = new Application("Teams", "1.0.2", 5.0);
        Application skype = new Application("Skype", "2.3.8", 2.1);
        Application x = new Application("X", "3.12", 50.0);
        Application a = new Application("Aaaa", "13.2", 2.2);
        Phone.findFreeApps();
        System.out.println(nokia.checkIfInstalled(skype));
        System.out.println(nokia.checkIfInstalled("Skype"));
        nokia.installApp(skype);
        System.out.println(nokia.checkIfInstalled(skype));
        System.out.println(nokia.checkIfInstalled("Skype"));
        System.out.println(nokia.checkAppsValue());
        nokia.installApp(teams);
        nokia.installApp(x);
        nokia.installApp(a);
        System.out.println(nokia.checkAppsValue());
        nokia.appSortByName();
        nokia.appSortByPrice();
    }
}
