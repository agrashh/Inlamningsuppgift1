package inlamning1;

import javax.swing.*;

public class KöttätandeVäxt extends Växt {
    public KöttätandeVäxt(String namn, double höjdICentimeter) {
        super(namn, höjdICentimeter);
        näringsvätska = Näringsvätska.PROTEINDRYCK;
        näringsBehov = 0.1 + 0.2 * (höjdICentimeter) / 100;

    }

    @Override
    public void printVäxt() {
        JOptionPane.showMessageDialog(null, namn + " är en " + näringsvätska.klassnamn +
                " och behöver " + näringsBehov + " liter " + näringsvätska.dryck + " per dag.");
    }
}
