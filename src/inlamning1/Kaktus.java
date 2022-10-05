package inlamning1;

import javax.swing.*;

public class Kaktus extends Växt{
    public Kaktus(String namn, double höjdICentimeter) {
        super(namn, höjdICentimeter);
        this.näringsvätska = Näringsvätska.MINERALVATTEN;
    }

    @Override
    public void printVäxt() {
        JOptionPane.showMessageDialog(null, this.namn + " är en " + this.getClass().getName().toLowerCase() +
                " och behöver 2 centiliter " + this.näringsvätska.värde + " per dag.");
    }
}
