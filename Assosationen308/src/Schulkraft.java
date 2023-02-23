public class Schulkraft{
    private int beliebtheit;
    private String name;
    private Lehrkraft klassenlehrkraft;
    public Schulkraft(Lehrkraft kl) {
        this.klassenlehrkraft = kl;
    }

    public int getBeliebtheit() {
        return beliebtheit;
    }

    public void setBeliebtheit(int wert) {
        this.beliebtheit = beliebtheit;
    }

    public String getName() {
        return name;
    }
}
