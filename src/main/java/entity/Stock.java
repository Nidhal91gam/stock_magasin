package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity(name = "Stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idStock;

    private Integer qteStock;

    private Integer qteMin;

    private String libelleStock;

    public Stock() {
    }

    public Stock(Long idStock, Integer qteStock, Integer qteMin, String libelleStock) {
        this.idStock = idStock;
        this.qteStock = qteStock;
        this.qteMin = qteMin;
        this.libelleStock = libelleStock;
    }

    public Long getIdStock() {
        return idStock;
    }

    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }

    public Integer getQteStock() {
        return qteStock;
    }

    public void setQteStock(Integer qteStock) {
        this.qteStock = qteStock;
    }

    public Integer getQteMin() {
        return qteMin;
    }

    public void setQteMin(Integer qteMin) {
        this.qteMin = qteMin;
    }

    public String getLibelleStock() {
        return libelleStock;
    }

    public void setLibelleStock(String libelleStock) {
        this.libelleStock = libelleStock;
    }
}
