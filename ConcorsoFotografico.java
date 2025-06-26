import java.util.Scanner;

public class ConcorsoFotografico{
    public static void main(String[] args) {
        final int numFoto = 5;
        int[] voti = new int[numFoto];

        Scanner scanner  = new Scanner (System.in);
        System.out.println("Quanti giudici ci sono");
        int numGiudici = scanner.nextInt();

        for(int i = 0; i < numGiudici; i++){
            System.out.println("\nGiudice: " + (i + 1));
            for(int j = 0; j < numFoto; j++){
                int voto = (int) (Math.random() * 10);
                System.out.println("Voto per la foto " + (j + 1) + ": " + voto);
                voti[j] += voto;
            } 
        }
        
/* 
        for(int i = 0; i < numFoto; i++){
            System.out.println("Inserisci il voto per la foto n. " + (i + 1) + "(da 1 a 10): ");
            int voto = scanner.nextInt();

            while (voto < 1 || voto > 10){
                System.out.println("Voto non valido, riprova");
                voto = scanner.nextInt();
            }
            voti[i] = voto;
        }
            */
    }
}
