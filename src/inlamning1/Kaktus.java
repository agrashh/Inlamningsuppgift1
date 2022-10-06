package inlamning1;

import javax.swing.*;

public class Kaktus extends Växt {
    public Kaktus(String namn, double höjdICentimeter) {
        super(namn, höjdICentimeter);
        näringsvätska = Näringsvätska.MINERALVATTEN;
    }

    @Override
    public void printVäxt() {
        JOptionPane.showMessageDialog(null, namn + " är en " + näringsvätska.klassnamn +
                " och behöver 2 centiliter " + näringsvätska.dryck + " per dag.");
    }
}
