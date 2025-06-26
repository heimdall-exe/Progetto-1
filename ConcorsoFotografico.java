import java.util.Scanner;

public class ConcorsoFotografico{
    public static void main(String[] args) {
        final int numFoto = 5;
        int[] voti = new int[numFoto];

        Scanner scanner  = new Scanner (System.in);

        for(int i = 0; i < numFoto; i++){
            System.out.println("Inserisci il voto per la foto n. " + (i + 1) + "(da 1 a 10): ");
            int voto = scanner.nextInt();

            while (voto < 1 || voto > 10){
                System.out.println("Voto non valido, riprova");
                voto = scanner.nextInt();
            }
            voti[i] = voto;
        }
    }
}
