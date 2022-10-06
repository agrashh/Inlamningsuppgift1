package inlamning1;

import org.junit.jupiter.api.Test;

class KaktusTest {

    Kaktus kaktus = new Kaktus("kaktus", 111);
    Kaktus kaktus2 = new Kaktus("kaktus", 112);
    Kaktus kaktus3 = new Kaktus("den tredje", 113);
    Kaktus kaktus4 = new Kaktus("", 114);
    Kaktus kaktus5 = new Kaktus(null, 114);


    // Om namnet är tomt eller null kommer det inte gå att söka på i växthotellet.

    @Test
    void getNamn() {
        assert (kaktus.getNamn().equals("kaktus"));
        assert (kaktus2.getNamn().equals("kaktus"));
        assert (kaktus3.getNamn().equals("den tredje"));
        assert (kaktus4.getNamn().equals(""));
        assert (kaktus5.getNamn() == null);
    }

    @Test
    void printVäxt() {
        assert (kaktus.getNamn().equals("kaktus"));
        assert (kaktus.näringsvätska.klassnamn.equals("kaktus"));
        assert (kaktus.näringsvätska.dryck.equals("mineralvatten"));
    }
}