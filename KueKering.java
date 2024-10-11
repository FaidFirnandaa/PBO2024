public class KueKering extends Kue {
    private String jenisKue;

    // Constructor
    public KueKering(String namaKue, double harga, String jenisKue) {
        super(namaKue, harga); 
        this.jenisKue = jenisKue;
    }

    // Overriding method getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Jenis: " + jenisKue;
    }
}
