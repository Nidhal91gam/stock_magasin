package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "Facture")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFacture;

    private float montantRemise;

    private float montantFacture;

    private Date dateFacture;

    private Boolean active;

    public Facture() {
    }

    public Facture(Long idFacture, float montantRemise, float montantFacture, Date dateFacture, Boolean active) {
        this.idFacture = idFacture;
        this.montantRemise = montantRemise;
        this.montantFacture = montantFacture;
        this.dateFacture = dateFacture;
        this.active = active;
    }

    public Long getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }

    public float getMontantRemise() {
        return montantRemise;
    }

    public void setMontantRemise(float montantRemise) {
        this.montantRemise = montantRemise;
    }

    public float getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(float montantFacture) {
        this.montantFacture = montantFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
