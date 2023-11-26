import java.util.Random;
import java.util.Scanner;

public class JeuxPlusOuMois {

    public static void main(String[] args) {

        int nbreDeChances = 0;
        int nbreAl = 0;

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        // System.out.println(random.nextInt(1, 100));

        boolean choixValid = false;
        do {
            // Affichage du meu de choix à l'utilisateur
            System.out.println("**************** CHOIX DE NIVEAU *********************");
            System.out.println("1. Facile");
            System.out.println("2. Moyen");
            System.out.println("3. Difficile");
            System.out.print("choix $>> ");
            // Récupération de la valeur saisi par le Joueur
            int choix = sc.nextInt();

            switch (choix){
                case 1 -> {
                    nbreDeChances = 15;
                    choixValid = true;
                }
                case 2 -> {
                    nbreDeChances = 10;
                    choixValid = true;
                }
                case 3 -> {
                    nbreDeChances = 5;
                    choixValid = true;
                }
                default -> System.out.println("Veuillez entrer un choix valide");
            }
            System.out.println();
        }while (!choixValid);

        // Generer le Nbre aléatoire
        nbreAl = random.nextInt(1, 100);

        // System.out.println("La valeur à trouver est: "+nbreAl);

        int userInput = 0;
        do {
            System.out.print("Deviner le nombre $>> ");
            userInput = sc.nextInt();

            System.out.println();
            if (userInput < nbreAl){
                System.out.println("La valeur à trouver est plus grande !");
                System.out.println("Il vous reste "+(nbreDeChances = nbreDeChances - 1));
            }else if (userInput > nbreAl){
                System.out.println("La valeur à trouver est plus petite !");
                System.out.println("Il vous reste "+(nbreDeChances = nbreDeChances - 1));
            }else {
                System.out.println("Bravo !!! Vous avez trouvez la valeur !");
            }
        }while (nbreAl != userInput && nbreDeChances > 0);

    }

}
