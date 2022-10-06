package inlamning1;

import org.junit.jupiter.api.Test;

class VäxthotellTest {
    Växthotell hotell = new Växthotell();

    Palm palm = new Palm("erik", 111);
    Kaktus kaktus = new Kaktus("filip", 222);

    @Test
    void läggTillVäxt() {
        hotell.läggTillVäxt(palm);
        hotell.läggTillVäxt(kaktus);
        assert (hotell.getVäxtLista().contains(palm));
        assert (hotell.getVäxtLista().contains(kaktus));
    }

    @Test
    void printVäxt() {
        String test1 = "aaaa";
        String formattedTest = test1.substring(0, 1).toUpperCase() + test1.substring(1).toLowerCase();
        assert (formattedTest.equals("Aaaa"));

        String test2 = "euKaLyPtuZzz";
        String formattedTest2 = test2.substring(0, 1).toUpperCase() + test2.substring(1).toLowerCase();
        assert (formattedTest2.equals("Eukalyptuzzz"));

    }
}