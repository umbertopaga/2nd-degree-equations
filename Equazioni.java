// Definizione della classe principale del programma Equazioni
public class Equazioni {
    // Metodo principale che viene eseguito quando si avvia il programma
    public static void main(String[] args) {
        // Controllo se sono stati forniti esattamente 3 coefficienti come argomenti da
        // riga di comando
        if (args.length != 3) {
            // Stampa un messaggio di errore se non sono forniti esattamente 3 coefficienti
            System.out.println("Errore: Fornire 3 coefficienti");
        } else {
            // Estrazione dei coefficienti a, b e c dagli argomenti forniti
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            // Verifica se l'equazione è di primo grado (a = 0)
            if (a == 0) {
                // L'equazione è di primo grado, calcola e stampa la soluzione
                System.out.println("Equazione di primo grado: " + b + "x" + (c >= 0 ? "+" : "") + c + " = 0");
                System.out.println("Soluzione: " + (-c / b));
            } else {
                // L'equazione è di secondo grado
                System.out.println("Equazione di secondo grado: " + a + "x^2" + (b >= 0 ? "+" : "") + b + "x"
                        + (c >= 0 ? "+" : "") + c + " = 0");
                // Calcola il discriminante
                double delta = b * b - 4 * a * c;
                System.out.println("Il discriminante è: " + delta);

                // Verifica delle soluzioni in base al valore del discriminante
                if (delta >= 0) {
                    // L'equazione ha soluzioni reali
                    if (delta > 0) {
                        // L'equazione ha due soluzioni reali distinte
                        System.out.println("L'equazione ha due soluzioni reali:");
                        double soluzione1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double soluzione2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("x1 = " + soluzione1);
                        System.out.println("x2 = " + soluzione2);
                    } else {
                        // L'equazione ha una soluzione doppia reale
                        System.out.println("L'equazione ha una soluzione reale doppia:");
                        double soluzione = -b / (2 * a);
                        System.out.println("x = " + soluzione);
                    }
                } else {
                    // L'equazione ha soluzioni immaginarie
                    System.out.println("L'equazione ha soluzioni immaginarie:");
                    // Calcola parte reale e parte immaginaria delle soluzioni
                    double parteReale = -b / (2 * a);
                    double parteImmaginaria = Math.sqrt(-delta) / (2 * a);
                    // Stampa le soluzioni immaginarie nella forma a + bi
                    System.out.println("x1 = " + parteReale + " + i*" + parteImmaginaria + "i");
                    System.out.println("x2 = " + parteReale + " - i*" + parteImmaginaria + "i");
                }
            }
        }
    }
}
