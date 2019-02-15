package fr.umontpellier.iut;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private int solde; //quand et comment mettre le solde a jour ? Prix d'entrée 1 seule fois ?

    public Compte(String pseudo, String email, String adresse) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.solde = 0;
    }

    public void crediter(int montant){
        this.solde += montant;
    }

    private void creerOffre(Produit p, int prixCourant, int prixMax){
        p.ajouterOffre(new OffreEnchere(prixCourant, prixMax));
    }

}
