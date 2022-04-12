import java.util.Scanner;

public class TP1 {
    static final double TPS = 0.05;
    static final float  TVQ = 0.1f;

    public static void main(String[] args) {
        String produit;
        double prix;
        double total;
        double grandtotal;

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez une categorie");
        String categorie = clavier.nextLine();

        Scanner clavier2 = new Scanner(System.in);
        System.out.println("Entrez un nom");
        String nom = clavier2.nextLine();

        Scanner clavier3 = new Scanner(System.in);
        System.out.println("Entrez un prix");
        prix = clavier3.nextDouble();

        if  (categorie.equals("Fruit")) {
            System.out.println("Ne pas caluler TPS et TVQ");
        }

        if  (categorie.equals("Legume")){
            System.out.println("Ne pas caluler TPS et TVQ");
        }

        if  (categorie.equals("Epicerie nontaxable")) {
                System.out.println("Ne pas caluler TPS et TVQ");
            }

            else
                if  (categorie.equals("Epicerie taxable")) {
                System.out.println("");
            }
    }

    }



