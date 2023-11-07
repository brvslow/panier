package fr.wasson;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        System.out.print("Combien avez-vous d'articles ? ");
        Scanner scan = new Scanner(System.in);   
        int nbArticles = scan.nextInt();
        double total = 0;
        double prix = 0;
        
        for (int i = 1; i <= nbArticles; i++) {
            System.out.print("Quel est le prix de l'article n°" + i + " ? ");
            prix = scan.nextDouble();
            total = total + prix;
        }

        scan.close();
        System.out.println("Le prix total est : " + total);
    }
    
}
