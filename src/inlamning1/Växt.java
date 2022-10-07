package inlamning1;

abstract class Växt implements VäxtInterface {
    protected final String namn;
    protected final double höjdICentimeter;
    protected double näringsBehov;

    protected Näringsvätska näringsvätska;

    public Växt(String namn, double höjdICentimeter) {
        this.namn = namn;
        this.höjdICentimeter = höjdICentimeter;
    }

    public String getNamn() {
        return namn;
    }

}
