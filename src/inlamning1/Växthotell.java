package inlamning1;

import javax.swing.*;
import java.util.ArrayList;

public class Växthotell {
    private String namn;
    private ArrayList<Växt> växtLista;

    public Växthotell(String namn) {
        this.namn = namn;
        växtLista = new ArrayList<>();
    }

    public void läggTillVäxt(Växt växt) {
        växtLista.add(växt);
    }

    public void taBortVäxt(Växt växt) {
        växtLista.remove(växt);
    }
    public int antalVäxter() {
        return växtLista.size();
    }

    public ArrayList<Växt> växtLista() {
        return this.växtLista;
    }
    public void printVäxt(String input) {
        boolean foundVäxt = false;
        String formattedInput = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        for (Växt v : this.växtLista) {
            if (formattedInput.equals(v.getNamn())) {
                v.printVäxt();
                foundVäxt = true;
            }
        }
        if (!foundVäxt) {
            JOptionPane.showMessageDialog(null, "Växten " + input + " kunde inte hittas.");
        }
    }
    public void printAll() {
        for (Växt v : växtLista) {
            v.printVäxt();
        }
    }
}
