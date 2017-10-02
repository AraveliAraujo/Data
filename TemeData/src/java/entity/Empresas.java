/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Araveli Araujo
 */
@Entity
@Table(catalog = "TRAMITEDOC", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findByCodEmpre", query = "SELECT e FROM Empresas e WHERE e.codEmpre = :codEmpre")
    , @NamedQuery(name = "Empresas.findByNomEmpre", query = "SELECT e FROM Empresas e WHERE e.nomEmpre = :nomEmpre")
    , @NamedQuery(name = "Empresas.findByRucEmpre", query = "SELECT e FROM Empresas e WHERE e.rucEmpre = :rucEmpre")
    , @NamedQuery(name = "Empresas.findByDirecEmpre", query = "SELECT e FROM Empresas e WHERE e.direcEmpre = :direcEmpre")
    , @NamedQuery(name = "Empresas.findByTelEmpre", query = "SELECT e FROM Empresas e WHERE e.telEmpre = :telEmpre")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codEmpre;
    @Size(max = 60)
    @Column(length = 60)
    private String nomEmpre;
    @Size(max = 21)
    @Column(length = 21)
    private String rucEmpre;
    @Size(max = 60)
    @Column(length = 60)
    private String direcEmpre;
    @Size(max = 9)
    @Column(length = 9)
    private String telEmpre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEmpre")
    private List<Tramites> tramitesList;
    @JoinColumn(name = "CodUbig", referencedColumnName = "CodUbig", nullable = false)
    @ManyToOne(optional = false)
    private Ubigeo codUbig;

    public Empresas() {
    }

    public Empresas(Integer codEmpre) {
        this.codEmpre = codEmpre;
    }

    public Integer getCodEmpre() {
        return codEmpre;
    }

    public void setCodEmpre(Integer codEmpre) {
        this.codEmpre = codEmpre;
    }

    public String getNomEmpre() {
        return nomEmpre;
    }

    public void setNomEmpre(String nomEmpre) {
        this.nomEmpre = nomEmpre;
    }

    public String getRucEmpre() {
        return rucEmpre;
    }

    public void setRucEmpre(String rucEmpre) {
        this.rucEmpre = rucEmpre;
    }

    public String getDirecEmpre() {
        return direcEmpre;
    }

    public void setDirecEmpre(String direcEmpre) {
        this.direcEmpre = direcEmpre;
    }

    public String getTelEmpre() {
        return telEmpre;
    }

    public void setTelEmpre(String telEmpre) {
        this.telEmpre = telEmpre;
    }

    @XmlTransient
    public List<Tramites> getTramitesList() {
        return tramitesList;
    }

    public void setTramitesList(List<Tramites> tramitesList) {
        this.tramitesList = tramitesList;
    }

    public Ubigeo getCodUbig() {
        return codUbig;
    }

    public void setCodUbig(Ubigeo codUbig) {
        this.codUbig = codUbig;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEmpre != null ? codEmpre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.codEmpre == null && other.codEmpre != null) || (this.codEmpre != null && !this.codEmpre.equals(other.codEmpre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Empresas[ codEmpre=" + codEmpre + " ]";
    }
    
}
