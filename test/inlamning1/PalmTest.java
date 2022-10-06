package inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm palm = new Palm("palme", 123);
    Palm palm2 = new Palm("palme2", 456);

    @Test
    void getNamn() {
        assert (palm.getNamn().equals("palme"));
        assert (palm2.getNamn().equals("palme2"));
    }

    @Test
    void printVäxt() {
        assert (palm.getNamn().equals("palme"));
        assert (palm.näringsvätska.klassnamn.equals("palm"));
        assert (palm.näringsvätska.dryck.equals("kranvatten"));

        assert (palm2.getNamn().equals("palme2"));
        assert (palm2.näringsvätska.klassnamn.equals("palm"));
        assert (palm2.näringsvätska.dryck.equals("kranvatten"));
    }
}