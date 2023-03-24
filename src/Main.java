public class Main {
    public static void main(String[] args) {

        Produkt p = new Produkt("Tennissocken", 2.4, 2.9, 12);
        Produkt g = new Produkt("Sandspielzeug", 9.3, 18.5);


        p.lieferung(8);
        p.verkaufe();
        p.verkaufe(10);
        p.schreibe();
        g.schreibe();


    }
}