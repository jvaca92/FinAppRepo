/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.finapp.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jenda
 */
@Entity
@Table(name = "costs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costs.findAll", query = "SELECT c FROM Costs c"),
    @NamedQuery(name = "Costs.findById", query = "SELECT c FROM Costs c WHERE c.costsPK.id = :id"),
    @NamedQuery(name = "Costs.findByCostname", query = "SELECT c FROM Costs c WHERE c.costname = :costname"),
    @NamedQuery(name = "Costs.findByDate", query = "SELECT c FROM Costs c WHERE c.costsPK.date = :date"),
    @NamedQuery(name = "Costs.findByPrice", query = "SELECT c FROM Costs c WHERE c.price = :price")})
public class Costs implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostsPK costsPK;
    @Basic(optional = false)
    @Column(name = "Cost_name")
    private String costname;
    @Basic(optional = false)
    @Column(name = "Price")
    private int price;

    public Costs() {
    }

    public Costs(CostsPK costsPK) {
        this.costsPK = costsPK;
    }

    public Costs(CostsPK costsPK, String costname, int price) {
        this.costsPK = costsPK;
        this.costname = costname;
        this.price = price;
    }

    public Costs(int id, Date date) {
        this.costsPK = new CostsPK(id, date);
    }

    public CostsPK getCostsPK() {
        return costsPK;
    }

    public void setCostsPK(CostsPK costsPK) {
        this.costsPK = costsPK;
    }

    public String getCostname() {
        return costname;
    }

    public void setCostname(String costname) {
        this.costname = costname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costsPK != null ? costsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costs)) {
            return false;
        }
        Costs other = (Costs) object;
        if ((this.costsPK == null && other.costsPK != null) || (this.costsPK != null && !this.costsPK.equals(other.costsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.finapp.db.Costs[ costsPK=" + costsPK + " ]";
    }
    
}
