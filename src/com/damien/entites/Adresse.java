package com.damien.entites;

/**
 * The type Adresse.
 */
public class Adresse {
    /**
     *
     */
    private int numeroRue;
    private String nomRue;
    private int codePostal;
    private String ville;

    /**
     * Gets numero rue.
     *
     * @return the numero rue
     */
    public int getNumeroRue() {
        return numeroRue;
    }

    /**
     * Sets numero rue.
     *
     * @param numeroRue the numero rue
     */
    public void setNumeroRue(final int numeroRue) {
        this.numeroRue = numeroRue;
    }

    /**
     * Gets nom rue.
     *
     * @return the nom rue
     */
    public String getNomRue() {
        return nomRue;
    }

    /**
     * Sets nom rue.
     *
     * @param nomRue the nom rue
     */
    public void setNomRue(final String nomRue) {
        this.nomRue = nomRue;
    }

    /**
     * Gets code postal.
     *
     * @return the code postal
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     * Sets code postal.
     *
     * @param codePostal the code postal
     */
    public void setCodePostal(final int codePostal) {
        this.codePostal = codePostal;
    }

    /**
     * Gets ville.
     *
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Sets ville.
     *
     * @param ville the ville
     */
    public void setVille(final String ville) {
        this.ville = ville;
    }

    /**
     * Instantiates a new Adresse.
     *
     * @param numeroRue  the numero rue
     * @param nomRue     the nom rue
     * @param codePostal the code postal
     * @param ville      the ville
     */
    public Adresse(final int numeroRue,
                   final String nomRue,
                   final int codePostal,
                   final String ville) {

        setNumeroRue(numeroRue); // this.numeroRue = numeroRue;
        setNomRue(nomRue); // this.nomRue = nomRue;
        setCodePostal(codePostal); //this.codePostal = codePostal;
        setVille(ville); //this.ville = ville;

    }

    public String toString() {
        StringBuilder resultat = new StringBuilder(
                numeroRue
                        + " "
                        + nomRue
                        + ", "
                        + codePostal
                        + " "
                        + ville);

        return resultat.toString();
    }

}
