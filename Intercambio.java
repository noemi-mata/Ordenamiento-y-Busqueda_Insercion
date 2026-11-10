//Noemi Mata Ruiz
//Angel de Jesus Nolasco Rivera
//GTID244
//Pseudocodigo implementado a java

import java.util.Scanner;

public class Intercambio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] fila = new int[6];
        int i, j, aux;
        boolean huboCambio;

        // Leer los 6 números (en Java los índices van de 0 a 5)
        for (i = 0; i < 6; i++) {
            System.out.print("Numero del compañero " + (i + 1) + ": ");
            fila[i] = sc.nextInt();
        }

        huboCambio = true;
        i = 1;

        while (i < 6 && huboCambio) {
            huboCambio = false;

            // Comparar vecinos: en PSeInt era j = 1 hasta 6 - i
            for (j = 0; j < 6 - i; j++) {
                if (fila[j] > fila[j + 1]) {
                    aux = fila[j];
                    fila[j] = fila[j + 1];
                    fila[j + 1] = aux;
                    huboCambio = true;
                }
            }

            // Mostrar cómo quedó la fila en esta pasada
            System.out.print("Pasada " + i + ": ");
            for (j = 0; j < 6; j++) {
                System.out.print(fila[j] + " ");
            }
            System.out.println();

            i = i + 1;
        }

        System.out.println("Pasadas: " + (i - 1));

        sc.close();
    }
}
