package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {

    private int num;
    private String desc;
    private int prixCourant; //quand update ?
    private LocalDate dateDebutEnchere;
    private LocalTime heureDebutEnchere;
    private int pas;
    private int coutParticipation;
    private boolean enCours;
    private boolean vendu;
    private ArrayList<OffreEnchere> listeEnchere = new ArrayList<OffreEnchere>();

    public Produit(int num, String desc, int prixCourant, int coutParticipation) {
        this.num = num;
        this.desc = desc;
        this.prixCourant = prixCourant;
        this.coutParticipation = coutParticipation;
        this.pas = 10;
        this.vendu = false;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    private void demarrerEnchere(){
        this.dateDebutEnchere = LocalDate.now();
        this.heureDebutEnchere = LocalTime.now();
        this.enCours = true;
    }

    private void arreterEnchere(){
        this.enCours = false;
        this.vendu = true;
    }

    public void ajouterOffre(OffreEnchere offre){
        if (((offre.getPrix() - this.prixCourant) > this.pas) && ((offre.getPrixMax() - offre.getPrix()) > this.pas)) {
            if (this.enCours && ! this.vendu) {
                this.listeEnchere.add(offre); // il faut supprimer une offre refaite par la meme personne ?
            }
        }
    }
}
