public class Kue {
    private String namaKue;
    private double harga;

    // Constructor
    public Kue(String namaKue, double harga) {
        this.namaKue = namaKue;
        this.harga = harga;
    }

    // Getter dan Setter
    public String getNamaKue() {
        return namaKue;
    }

    public void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk info
    public String getInfo() {
        return "Kue: " + namaKue + ", Harga: Rp" + harga;
    }
}
