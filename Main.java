public class Main {
    public static void main(String[] args) {
        
        Kopi cappuccino = new Kopi("Cappuccino", 30000, "Kopi Arabika");
        System.out.println(cappuccino.getInfo());

        Teh tehHijau = new Teh("Teh Hijau", 20000, "Rasa Mint");
        System.out.println(tehHijau.getInfo());

        KueKering kueCoklat = new KueKering("Kue Coklat", 15000, "Coklat");
        System.out.println(kueCoklat.getInfo());
    }
}