package inlamning1;

import javax.swing.*;

public class Palm extends Växt {

    public Palm(String namn, double höjdICentimeter) {
        super(namn, höjdICentimeter);
        näringsvätska = Näringsvätska.KRANVATTEN;
        näringsBehov = 0.5 * (höjdICentimeter / 100);
    }

    @Override
    public void printVäxt() {
        JOptionPane.showMessageDialog(null, namn + " är en " + näringsvätska.klassnamn +
                " och behöver " + näringsBehov + " liter " + näringsvätska.dryck + " per dag.");
    }
}
