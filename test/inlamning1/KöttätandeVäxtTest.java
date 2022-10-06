package inlamning1;

import org.junit.jupiter.api.Test;


class KöttätandeVäxtTest {
    KöttätandeVäxt kv = new KöttätandeVäxt("adam", 123);
    KöttätandeVäxt kv2 = new KöttätandeVäxt("eva", 345);

    @Test
    void getNamn() {
        assert (kv.getNamn().equals("adam"));
        assert (kv2.getNamn().equals("eva"));
    }

    @Test
    void printVäxt() {
        assert (kv.getNamn() == "adam");
        assert (kv.näringsvätska.klassnamn.equals("köttätande växt"));
        assert (kv.näringsvätska.dryck.equals("proteindryck"));
    }
}