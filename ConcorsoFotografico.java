import java.util.Scanner;

public class ConcorsoFotografico {
    public static void main(String[] args) {
        final int numFoto = 5;
        final int numGiudice = 3;
        Scanner sc = new Scanner(System.in);

        int[][] voti = new int[numFoto][numGiudice];
        double[] mediaVoti = new double[numFoto];
        int fotoPremiate = 0;
        boolean almenoUnaSufficiente = false;

        // Inserimento voti
        for (int i = 0; i < numFoto; i++) {
            System.out.println("Inserisci i voti per la foto " + (i + 1) + ":");
            for (int j = 0; j < numGiudice; j++) {
                int voto;
                do {
                    System.out.print("  Giudice " + (j + 1) + ": ");
                    voto = sc.nextInt();
                    if (voto < 1 || voto > 10) {
                        System.out.println("    Voto non valido. Inserisci un valore da 1 a 10.");
                    }
                } while (voto < 1 || voto > 10);
                voti[i][j] = voto;
            }
        }

        // Calcolo medie e valutazione
        for (int i = 0; i < numFoto; i++) {
            int somma = 0;
            for (int j = 0; j < numGiudice; j++) {
                somma += voti[i][j];
            }
            mediaVoti[i] = somma / (double) numGiudice;

            if (mediaVoti[i] >= 6) {
                almenoUnaSufficiente = true;
            }

            if (mediaVoti[i] >= 8) {
                System.out.println("Foto " + (i+1) +" premiata con media"+ mediaVoti [i]);
                fotoPremiate++;
            } else{
                System.out.println("Media voti foto" + (i+1)  +": " + mediaVoti[i]);
            }
        }

        System.out.println("Numero totale di foto premiate: " + fotoPremiate);
        if (!almenoUnaSufficiente) {
            System.out.println("Concorso annullato");
        }

        sc.close();
    }
}
    


