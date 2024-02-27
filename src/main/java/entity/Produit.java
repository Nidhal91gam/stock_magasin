package entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "Produit")
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    public Produit() {
    }

    public Produit(Long idProduit, String codeProduit, String libelleProduit, float prixUnitaire) {
        this.idProduit = idProduit;
        this.codeProduit = codeProduit;
        this.libelleProduit = libelleProduit;
        this.prixUnitaire = prixUnitaire;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public String getLibelleProduit() {
        return libelleProduit;
    }

    public void setLibelleProduit(String libelleProduit) {
        this.libelleProduit = libelleProduit;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    @ManyToOne
    private Rayon rayon;
}
