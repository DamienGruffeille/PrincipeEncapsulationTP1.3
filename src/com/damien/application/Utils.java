package com.damien.application;

import javax.swing.*;

/**
 * The type Utils.
 */
public class Utils {

    /**
     * Afficher.
     *
     * @param title    the title
     * @param personne the personne
     */
    public static void afficher(String title, String personne){
        JOptionPane.showMessageDialog(
                null,
                "" + personne.toString(),
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }

}
