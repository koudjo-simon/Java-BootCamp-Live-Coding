import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {

        /*for (int i=1; i<=5; i++){
            System.out.println("Boujour " + i);
        }*/
        /*
        int i = 1;
        while (i <= 5){
            System.out.println("Boujour " + i);
            i++; // i++ => i = i + 1
        }*/

        /*do {
            System.out.println("Boujour " + i);
            i++; // i++ => i = i + 1
        }while (i <= 5);*/


        // Exo N°1 et N°2
        /*Scanner input = new Scanner(System.in); // objet permettant de récuperer les valeurs saisi par l'utilisateur au clavier
        System.out.print("\nEntrer le nombre de ligne: ");
        int l = input.nextInt(); //Récupération du nombre de ligne
        System.out.print("\nEntrer le nombre de colonne: "); //Récupération du nombre de colonne
        int c = input.nextInt();*/

        /*for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print(" \uD83D\uDE00 ");
            }
            System.out.println();
        }*/

        /*for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == l){
                    System.out.print(" * ");
                }else {
                    if (j == 1 || j == c){
                        System.out.print(" * ");
                    }else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println(); // rétour à la ligne
        }*/

        // Exo N°5

        /*for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0){
                if (i % 10 == 1){
                    System.out.println(i);
                }
            }
        }*/

        for (int i = 0; i < 1000; i = i + 3) {
            if (i % 10 == 1){
                System.out.println(i);
            }
        }

    }
}
