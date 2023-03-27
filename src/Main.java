public class Main {
    public static void main(String[] args) {

        Volumen p = new Volumen(2, 5, 3);
        Volumen g = new Volumen(4, 6);

        p.rechneVolumen();
        p.addeLaenge(10);
        p.rechneVolumen();

        g.rechneFlaeche();
        g.addeBreite(10);
        g.rechneFlaeche();
        g.addeHoehe(3);
        g.rechneVolumen();
    }
}