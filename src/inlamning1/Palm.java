package inlamning1;

import javax.swing.*;

public class Palm extends Växt{

    public Palm(String namn, double höjdICentimeter) {
        super(namn, höjdICentimeter);
        this.näringsvätska = Näringsvätska.KRANVATTEN;
        this.näringsvärde = 0.5*(this.höjdICentimeter/100);
    }

    @Override
    public void printVäxt() {
        JOptionPane.showMessageDialog(null, this.namn + " är en " + this.getClass().getName().toLowerCase() +
                " och behöver " + this.näringsvärde + " liter " + this.näringsvätska.värde + " per dag.");
    }
}
