package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity(name = "Detail_Facture")
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDetailFacture ;

    private Integer qte;

    private float prixTotal ;

    private Integer pourcentageRemise ;

    private Integer montantRemise ;

    public DetailFacture() {
    }

    public DetailFacture(Long idDetailFacture, Integer qte, float prixTotal, Integer pourcentageRemise, Integer montantRemise) {
        this.idDetailFacture = idDetailFacture;
        this.qte = qte;
        this.prixTotal = prixTotal;
        this.pourcentageRemise = pourcentageRemise;
        this.montantRemise = montantRemise;
    }

    public Long getIdDetailFacture() {
        return idDetailFacture;
    }

    public void setIdDetailFacture(Long idDetailFacture) {
        this.idDetailFacture = idDetailFacture;
    }

    public Integer getQte() {
        return qte;
    }

    public void setQte(Integer qte) {
        this.qte = qte;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Integer getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(Integer pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public Integer getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(Integer montantRemise) {
        this.montantRemise = montantRemise;
    }
}
