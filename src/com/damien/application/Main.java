package com.damien.application;

import com.damien.entites.Adresse;
import com.damien.entites.Personne;

import static com.damien.application.Utils.afficher;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Adresse paris = new Adresse(2, "rue Victor Hugo", 75008, "Paris");

        Adresse nantes = new Adresse(17, "rue de la Republique", 44000, "Nantes");

        Adresse lille = new Adresse(55, "Bld de la Liberation", 59000, "Lille");

        Personne dupont = new Personne("Jean", "Dupont", 30, lille);
        afficher("Dupont", String.valueOf(dupont));

        Personne morin = new Personne("Bernard", "Morin", 45, paris);

        Personne durand = new Personne("Nathalie", "Durand", 35, paris);
        afficher("Vive les mariés !!", durand + "\n" + morin);

        dupont.setAdresse(new Adresse(44, "rue des docks", 33000, "Bordeaux"));
        afficher("Déménagement", String.valueOf(dupont));

    }
}
