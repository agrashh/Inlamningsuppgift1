package inlamning1;

import javax.swing.*;

public class KöttätandeVäxt extends Växt{
    private final String klassnamn = "köttätande växt";
    public KöttätandeVäxt(String namn, double höjdICentimeter) {
        super(namn, höjdICentimeter);
        this.näringsvätska = Näringsvätska.PROTEINDRYCK;
        this.näringsvärde = 0.1 + 0.2 * (this.höjdICentimeter)/100;
    }

    @Override
    public void printVäxt() {
        JOptionPane.showMessageDialog(null, this.namn + " är en " + getKlassnamn() +
                " och behöver " + this.näringsvärde + " liter " + this.näringsvätska.värde + " per dag.");
    }

    public String getKlassnamn() {
        return klassnamn;
    }
}
