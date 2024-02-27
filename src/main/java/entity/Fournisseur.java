package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity(name = "Fournisseur")
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFournisseur ;

    private String codeFournisseur ;

    private String libelleFournisseur ;

    public Fournisseur() {
    }

    public Fournisseur(Long idFournisseur, String codeFournisseur, String libelleFournisseur) {
        this.idFournisseur = idFournisseur;
        this.codeFournisseur = codeFournisseur;
        this.libelleFournisseur = libelleFournisseur;
    }

    public Long getIdFournisseur() {
        return idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getCodeFournisseur() {
        return codeFournisseur;
    }

    public void setCodeFournisseur(String codeFournisseur) {
        this.codeFournisseur = codeFournisseur;
    }

    public String getLibelleFournisseur() {
        return libelleFournisseur;
    }

    public void setLibelleFournisseur(String libelleFournisseur) {
        this.libelleFournisseur = libelleFournisseur;
    }
}
