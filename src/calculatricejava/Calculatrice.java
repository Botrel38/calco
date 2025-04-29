package calculatricejava;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // création du scanner

        System.out.println("Bienvenue dans la calculatrice !");
        System.out.print("Entrez le premier nombre : ");
        double a = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double b = scanner.nextDouble();

        System.out.print("Choisissez une opération (+, -, *, /) : ");
        String op = scanner.next();

        double resultat;

        switch (op) {
            case "+":
                resultat = a + b;
                break;
            case "-":
                resultat = a - b;
                break;
            case "*":
                resultat = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Erreur : division par zéro !");
                    scanner.close(); // fermeture ici aussi
                    return;
                }
                resultat = a / b;
                break;
            default:
                System.out.println("Opération non reconnue.");
                scanner.close(); // fermeture
                return;
        }

        System.out.println("Résultat : " + resultat);

        scanner.close(); // on ferme le scanner à la fin
    }
}