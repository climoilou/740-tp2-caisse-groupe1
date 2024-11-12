package org.example;

public class Caisse {
    int montant = 0;

    public boolean estVide(){
        return montant == 0;
    }

    /**
     * Permet d'ajouter 5 au montant initial.
     */
    public void ajouterUnBilletDeCinqDollars(){
        montant = montant + 5;
    }
}