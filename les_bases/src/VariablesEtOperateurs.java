public class VariablesEtOperateurs {
    public static void main(String[] args) {
        int nbre1, nbre2;

        nbre1 = 10;
        nbre2 = 20;

        int nbre3 = nbre1 + nbre2;
        int nbre4 = nbre1 *  nbre2;
        int nbre5 = nbre1 % 3;

        System.out.println("Nbre3 vaut: " + nbre3 + "\nEt nbre4 vaut " + nbre4);
        System.out.println("nbre5 = " + nbre5);

        String salutation = null; // déclaration
        String personne = "Monsieur";
        salutation = "Bonjour !"; // affection


        System.out.println("Salutation = " + salutation);
        System.out.println("Personne = " + personne);

        System.out.println(salutation + " " + personne);

        System.out.println(salutation.toUpperCase());
        System.out.println(salutation.toLowerCase());

        String jour = "5"; // chaine de caractère
        int m = 30;

        int jourConv = Integer.parseInt(jour); // conversion de la variable jour en entier

        System.out.println(jourConv + m);

        float f = (float) 4.6;

        int a = 6;
        double b = a;

        char ch = 'p';

        String phrase = "ma phrase";

        System.out.println(phrase.charAt(5));


        int note = 10; //On imagine que la note maximale est 20
        switch (note) {
            case 0:
                System.out.println("Ouch !");
                break;
            case 10:
                System.out.println("Vous avez juste la moyenne.");
                break;
            case 20:
                System.out.println("Parfait !");
                break;
            default:
                System.out.println("Il faut davantage travailler.");
        }
    }
}
