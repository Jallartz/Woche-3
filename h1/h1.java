public class h1 {
    public static void main(String[] args) {
        
        int x = -5; // Beispielwert

        // 1. Betrag
        System.out.println("Betrag: " + (x < 0 ? -x : x));

        // 2. Quadrat
        System.out.println("Quadrat: " + (x * x));

        // 3. Gerade / ungerade
        if (x % 2 == 0) {
            System.out.println("Die Zahl ist gerade.");
        } else {
            System.out.println("Die Zahl ist ungerade.");
        }
    }
}
