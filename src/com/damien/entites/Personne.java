package com.damien.entites;

/**
 * The type Personne.
 */
public class Personne {
// Variables d'instance
    private String prenom;
    private String nom;
    private int age;
    /**
     * The Adresse.
     */
    Adresse adresse;

    /**
     * Gets prenom.
     *
     * @return the prenom
     */
// Getter Setter
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets prenom.
     *
     * @param prenom the prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets adresse.
     *
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * Sets adresse.
     *
     * @param adresse the adresse
     */
    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    /**
     * Instantiates a new Personne.
     *
     * @param prenom  the prenom
     * @param nom     the nom
     * @param age     the age
     * @param adresse the adresse
     */
//Constructeur de l'objet Personne
    public Personne(String prenom, String nom, int age, Adresse adresse) {
        setPrenom(prenom);
        setNom(nom);
        setAge(age);
        setAdresse(adresse);
    }

// Transformation des données en String pour l'affichage dans les box de dialogue
    public String toString(){
        return prenom + " " + nom + " " + age + " ans, habite au " + adresse;
    }


}
