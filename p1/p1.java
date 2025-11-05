public class p1 {
    public static void main(String[] args) {

        int wuerfel = 4; // Beispielwert, wird später beim Testen verändert

        if (wuerfel == 1 || wuerfel == 4) {
            System.out.println("Gewonnen!");
        } else if (wuerfel == 2) {
            System.out.println("Verloren!");
        } else if (wuerfel == 5) {
            System.out.println("Unentschieden!");
        } else {
            System.out.println("Lage unklar...");
        }
    }
}
