package inlamning1;

abstract class Växt implements VäxtInterface {
    protected String namn;
    protected double höjdICentimeter;
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
