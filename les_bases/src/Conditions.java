import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Exercice 1
        /*  // Création de l'objet scanner

        System.out.print("Veillez entrer un nombre: ");
        int userInput = clavier.nextInt(); // Récupération de ce que l'utilisateur à saisi

        // int resp = userInput % 2;

        if ((userInput % 2) == 0){
            System.out.println("Le nombre est pair !");
        }else {
            System.out.println("Le nobre est impair !");
        }*/

        /*System.out.print("Entrer votre âge: ");
        int userAge = clavier.nextInt();

        if (userAge > 0 && userAge < 14){
            System.out.println("Vous êtes mineur");
        } else if (userAge >= 14 && userAge < 18){
            System.out.println("Vous êtes Ado");
        }else {
            System.out.println("Vous êtes majeur");
        }

        if (userAge >= 18){
            System.out.println("Vous êtes majeur");
        }else if (userAge >= 14){
            System.out.println("Vous êtes Ado");
        }else {
            System.out.println("Vous êtes mineur");
        }*/

        // Exercice 5
        System.out.print("Entrer le mot de passe: ");
        String motDePasse = clavier.nextLine();

        /*switch (motDePasse){
            case "admin":
                System.out.println("Vous êtes Admin");
                break;
            case "user":
                System.out.println("Vous êtes un simple utilisateur");
                break;
            default:
                System.out.println("Vous n'êtes pas autorisé.");
        }*/

        switch (motDePasse){
            case "admin" -> System.out.println("Vous êtes Admin");
            case "user" -> System.out.println("Vous êtes un simple utilisateur");
            default -> System.out.println("Vous n'êtes pas autorisé.");
        }

    }

}
