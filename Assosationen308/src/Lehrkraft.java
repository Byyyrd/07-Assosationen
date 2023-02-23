public class Lehrkraft{
    private String name;
    private String besoldungsstufe = "A13";

    public Lehrkraft(String n) {
        this.name = n;
    }

    public String getBesoldungsstufe() {
        return besoldungsstufe;
    }

    public void setBesoldungsstufe(String s) {
        this.besoldungsstufe = s;
    }

    public String getName() {
        return name;
    }
}
