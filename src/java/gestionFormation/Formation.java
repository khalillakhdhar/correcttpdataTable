/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionFormation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Formation {
    private String titre,description;
    private int prix,nbjour;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getNbjour() {
        return nbjour;
    }

    public void setNbjour(int nbjour) {
        this.nbjour = nbjour;
    }

    public Formation() {
    }

    public Formation(String titre, String description, int prix, int nbjour) {
        this.titre = titre;
        this.description = description;
        this.prix = prix;
        this.nbjour = nbjour;
    }
    
    
    
    
}
