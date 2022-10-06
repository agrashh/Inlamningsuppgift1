package inlamning1;

import javax.swing.*;

public class Main {
    Main() {
        Växthotell Greenest = new Växthotell();

        Kaktus Igge = new Kaktus("Igge", 20);
        Palm Laura = new Palm("Laura", 500);
        KöttätandeVäxt Meatloaf = new KöttätandeVäxt("Meatloaf", 700);
        Palm Putte = new Palm("Putte", 100);

        Greenest.läggTillVäxt(Igge);
        Greenest.läggTillVäxt(Laura);
        Greenest.läggTillVäxt(Meatloaf);
        Greenest.läggTillVäxt(Putte);

        String växtSkaFåVätska;
        do {
            växtSkaFåVätska = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
        } while (växtSkaFåVätska == null || växtSkaFåVätska.isEmpty());

        Greenest.printVäxt(växtSkaFåVätska);
    }

    public static void main(String[] args) {
        new Main();
    }
}
