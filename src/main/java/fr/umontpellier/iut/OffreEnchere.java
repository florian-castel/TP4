package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;

public class OffreEnchere {

    private int prix;
    private int prixMax;
    private LocalDate date;
    private LocalTime heure;

    public OffreEnchere(int prixCourant, int prixMax) {
        this.date = LocalDate.now();
        this.heure = LocalTime.now();
        this.prix = prixCourant;
        this.prixMax = prixMax;
    }



    public int getPrix() {
        return prix;
    }

    public int getPrixMax() {
        return prixMax;
    }
// a quoi ca sert ?
    public void setPrix(int prix) {
        this.prix = prix;
    }
}
