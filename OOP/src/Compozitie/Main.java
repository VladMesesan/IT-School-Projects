package Compozitie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Introduceti modelul primului telefon: ");
    Telefon telefon1 = new Telefon(reader.nextLine());
    telefon1.setMemorie(10);
    telefon1.setDiagonala(8);

        System.out.println("Introduceti modelul celui de-al doilea telefon: ");
    Telefon telefon2 = new Telefon(reader.nextLine());
    telefon2.setMemorie(12);
    telefon2.setDiagonala(10);

    cardSIM cardSim1 = new cardSIM(3, "Vodafone");
    cardSIM cardSim2 = new cardSIM(5, "Orange");

    telefon1.setSim(cardSim1);
    telefon2.setSim(new cardSIM(5, "Orange")); //asta e echivalent cu "cardSim2"
    }
}
