package inlamning1;

public enum Näringsvätska {
    KRANVATTEN("kranvatten", "palm"),
    PROTEINDRYCK("proteindryck", "köttätande växt"),
    MINERALVATTEN("mineralvatten", "kaktus"),
    ;
    final String dryck;
    final String klassnamn;

    Näringsvätska(String dryck, String klassnamn) {
        this.dryck = dryck;
        this.klassnamn = klassnamn;

    }
}
