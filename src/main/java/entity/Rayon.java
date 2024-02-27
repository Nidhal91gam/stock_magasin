package entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Rayon")
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long IdRayon ;

    private String codeRayon ;

    private String libelleRayon ;

    public Rayon() {

    }

    public Rayon(long idRayon, String codeRayon, String libelleRayon) {
        IdRayon = idRayon;
        this.codeRayon = codeRayon;
        this.libelleRayon = libelleRayon;
    }

    public long getIdRayon() {
        return IdRayon;
    }

    public void setIdRayon(long idRayon) {
        IdRayon = idRayon;
    }

    public String getCodeRayon() {
        return codeRayon;
    }

    public void setCodeRayon(String codeRayon) {
        this.codeRayon = codeRayon;
    }

    public String getLibelleRayon() {
        return libelleRayon;
    }

    public void setLibelleRayon(String libelleRayon) {
        this.libelleRayon = libelleRayon;
    }

    // relationShip Rayon Produit OneToMany

    @OneToMany
    private List<Produit> produit = new ArrayList<>();


}
