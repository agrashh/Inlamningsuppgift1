package inlamning1;

public enum Näringsvätska {
    KRANVATTEN ("kranvatten"),
    PROTEINDRYCK ("proteindryck"),
    MINERALVATTEN ("mineralvatten"),
    ;
    public final String värde;

    Näringsvätska(String s) {
        värde = s;
    }
}
