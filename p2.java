public class p2 {
    public static void main(String[] args) {

        int a = 1, b = 2, c = 3, d = 0; // Beispielwerte
        
        // E1: a == b
        if (a == b) {
            d++;
        }
        // E2: a == b oder a == c
        if (a == b || a == c) {
            d++;
        }
        // E3: a + b >= c
        if (a + b >= c) {
            d++;
        }
        // E4: a + b + c >= 100
        if (a + b + c >= 100) {
            d++;
        }

        System.out.println("Anzahl erfüllter Eigenschaften: " + d);
    }
}
