public class Volumen { //Rechnet Volumen eines Quaders aus
    double laenge;
    double breite;
    double hoehe;

    Volumen(double iLaenge, double iBreite, double iHoehe) {
        laenge = iLaenge;
        breite = iBreite;
        hoehe = iHoehe;
    }

    Volumen(double iLaenge, double iBreite) {
        laenge = iLaenge;
        breite = iBreite;
    }

    double addeLaenge(double zahl) {
        return laenge += zahl;
    }

    double addeBreite(double zahl) {
        return breite += zahl;
    }

    double addeHoehe(double zahl) {
        return hoehe += zahl;
    }

    void rechneVolumen() {
        System.out.println("Der Quader hat ein Volumen von " + laenge * breite * hoehe);
    }

    void rechneFlaeche() {
        System.out.println("Die Fläche des Rechtecks beträgt: " + laenge * breite);
    }
}
