public class Kopi extends Minuman {
    private String jenisKopi;

    // Constructor
    public Kopi(String namaMinuman, double harga, String jenisKopi) {
        super(namaMinuman, harga); 
        this.jenisKopi = jenisKopi;
    }

    // Overriding method getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis: " + jenisKopi;
    }
}
