package entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity(name = "Detail_Produit")
public class DetailProduit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDetailProduit;

    @DateTimeFormat
    private Date dateCreation ;

    private Date dateDerniereModification;

    @Enumerated
    private CategorieProduit categorieProduit ;

    public DetailProduit() {
    }

    public DetailProduit(Long idDetailProduit, Date dateCreation, Date dateDerniereModification, CategorieProduit categorieProduit) {
        this.idDetailProduit = idDetailProduit;
        this.dateCreation = dateCreation;
        this.dateDerniereModification = dateDerniereModification;
        this.categorieProduit = categorieProduit;
    }

    public Long getIdDetailProduit() {
        return idDetailProduit;
    }

    public void setIdDetailProduit(Long idDetailProduit) {
        this.idDetailProduit = idDetailProduit;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateDerniereModification() {
        return dateDerniereModification;
    }

    public void setDateDerniereModification(Date dateDerniereModification) {
        this.dateDerniereModification = dateDerniereModification;
    }

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }
}
