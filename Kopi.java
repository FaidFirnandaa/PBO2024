// File: Kopi.java

public class Kopi extends Minuman {
    private String jenisKopi;

    // Constructor
    public Kopi(String namaMinuman, double harga, String jenisKopi) {
        super(namaMinuman, harga); // Memanggil constructor Minuman
        this.jenisKopi = jenisKopi;
    }

    // Overriding method getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis: " + jenisKopi;
    }
}
