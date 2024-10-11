public class Teh extends Minuman {
    private String rasaTeh;

    // Constructor
    public Teh(String namaMinuman, double harga, String rasaTeh) {
        super(namaMinuman, harga);
        this.rasaTeh = rasaTeh;
    }

    // Overriding method getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Rasa: " + rasaTeh;
    }
}
