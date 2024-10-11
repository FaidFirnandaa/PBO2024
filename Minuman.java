public class Minuman {
    private String namaMinuman;
    private double harga;

    // Constructor
    public Minuman(String namaMinuman, double harga) {
        this.namaMinuman = namaMinuman;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaMinuman() {
        return namaMinuman;
    }

    public void setNamaMinuman(String namaMinuman) {
        this.namaMinuman = namaMinuman;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk info
    public String getInfo() {
        return "Minuman: " + namaMinuman + ", Harga: Rp" + harga;
    }
}
