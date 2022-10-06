package inlamning1;

import javax.swing.*;
import java.util.ArrayList;

public class Växthotell {
    private final ArrayList<Växt> växtLista;

    public Växthotell() {
        växtLista = new ArrayList<>();
    }

    public void läggTillVäxt(Växt växt) {
        if (!växtLista.contains(växt)) {
            växtLista.add(växt);
        } else {
            System.out.println("Växten " + växt + "finns redan i hotellet.");
        }
    }

    public void printVäxt(String input) {
        boolean foundVäxt = false;
        String formattedInput = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        for (Växt v : växtLista) {
            if (formattedInput.equals(v.getNamn())) {
                v.printVäxt();
                foundVäxt = true;
            }
        }
        if (!foundVäxt) {
            JOptionPane.showMessageDialog(null, "Växten '" + input + "' kunde inte hittas.");
        }
    }

    public ArrayList<Växt> getVäxtLista() {
        return växtLista;
    }
    /*
    public void printAll() {
        for (Växt v : växtLista) {
            v.printVäxt();
        }
    }
 */
}
