import java.util.Scanner;

public class ConcorsoFotografico {
    public static void main(String[] args) {

        // Dichiariamo il numero fisso di foto e di giudici 
        final int numFoto = 5;
        final int numGiudice = 3;
        Scanner sc = new Scanner(System.in);  // Creazione oggetto scanner

        // Matrice per gestire le foto e i giudici
        int[][] voti = new int[numFoto][numGiudice];
        double[] mediaVoti = new double[numFoto];             // Array per la media dei voti
        int fotoPremiate = 0;                                 // Ci serve per vedere quante foto vengono effettivamente premiate
        boolean almenoUnaSufficiente = false;                 // Variabile booleana per vedere se ci sta almeno una foto sufficiente

        // Ciclo for per ripete in base al numero delle foto ( colonne della matrice )
        for (int i = 0; i < numFoto; i++) {
            System.out.println("Inserisci i voti per la foto " + (i + 1) + ":");   

            // Ciclo for per ripetere in base al numero di giudici ( Righe della matrice )
            for (int j = 0; j < numGiudice; j++) {
                int voto;         // Variabile dove salveremo il voto

                // Ciclo do per inserire i voti
                do {
                    System.out.print("  Giudice " + (j + 1) + ": ");
                    voto = sc.nextInt();
                    if (voto < 1 || voto > 10) {         // se il voto non è valido stampa errore e fa reinserire
                        System.out.println("    Voto non valido. Inserisci un valore da 1 a 10.");
                    }
                } while (voto < 1 || voto > 10);        // continua fino a che i foti non sono validi ( condizione di uscita del do )
                voti[i][j] = voto;               // inserimento del voto nella matrice
            }
        }

        // Calcolo delle medie dei voti per ogni foto
        for (int i = 0; i < numFoto; i++) {
            int somma = 0;
            for (int j = 0; j < numGiudice; j++) {
                somma += voti[i][j];            // aggiungiamo i voti alla variabile in comune su cui dopo andremo a calcolare la media
            }
            mediaVoti[i] = somma / (double) numGiudice;  // Calcolo della media

            // Se la nella media ci sta anche solo 1 6 o superiore settiamo la variabile booleana su true
            if (mediaVoti[i] >= 6) {
                almenoUnaSufficiente = true;
            }

            // se la media è uguale o superiore ad 8 aggiungiamo alla variabile FOTO PREMIATE la foto stessa 
            if (mediaVoti[i] >= 8) {
                System.out.println("Foto " + (i+1) +" premiata con media"+ mediaVoti [i]);
                fotoPremiate++;

                // altrimenti stampiamo solo la media della foto senza premiazione
            } else{
                System.out.println("Media voti foto" + (i+1)  +": " + mediaVoti[i]);
            }
        }

        // stampiano il numero totale delle foto premiate 
        System.out.println("Numero totale di foto premiate: " + fotoPremiate);
        // se nessuna è sufficiente stampiamo concorso annullato
        if (!almenoUnaSufficiente) {
            System.out.println("Concorso annullato");
        }

        sc.close();       // chiusura dello scanner
    }
}
    


