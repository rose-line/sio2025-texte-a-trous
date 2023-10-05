package fr.pgah;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    // Récupération des 4 entrées
    // NB : l'utilisation de next() (plutôt que nextLine())
    // permet d'éviter le bug du "tampon non vide"
    // sans avoir à vider le tampon
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez un premier mot : ");
    String mot1 = clavier.next();
    System.out.print("Entrez un nombre : ");
    int nombre = clavier.nextInt();
    System.out.print("Entrez un deuxième mot : ");
    String mot2 = clavier.next();
    System.out.print("Entrez un adjectif : ");
    String adjectif = clavier.next();

    // On libère la ressource clavier
    clavier.close();

    // Construction de la phrase et affectation dans une string
    String phrase = "Il était une fois un " + mot1 + " qui avait " + nombre + " " + mot2
        + ". Cela le rendait très " + adjectif + ".";

    // Affichage
    System.out.println(phrase);
  }
}
