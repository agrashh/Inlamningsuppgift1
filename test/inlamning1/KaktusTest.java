package inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Kaktus kaktus = new Kaktus("kaktus", 100);
    @Test
    void printVäxt() {
        assert (kaktus.getNamn() == "kaktus");
    }
}