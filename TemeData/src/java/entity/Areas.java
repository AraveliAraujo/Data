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
    @NamedQuery(name = "Areas.findAll", query = "SELECT a FROM Areas a")
    , @NamedQuery(name = "Areas.findByCodA", query = "SELECT a FROM Areas a WHERE a.codA = :codA")
    , @NamedQuery(name = "Areas.findByNomA", query = "SELECT a FROM Areas a WHERE a.nomA = :nomA")
    , @NamedQuery(name = "Areas.findByDiasA", query = "SELECT a FROM Areas a WHERE a.diasA = :diasA")})
public class Areas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codA;
    @Size(max = 60)
    @Column(length = 60)
    private String nomA;
    private Integer diasA;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codA")
    private List<Tramites> tramitesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codA")
    private List<Empleados> empleadosList;

    public Areas() {
    }

    public Areas(Integer codA) {
        this.codA = codA;
    }

    public Integer getCodA() {
        return codA;
    }

    public void setCodA(Integer codA) {
        this.codA = codA;
    }

    public String getNomA() {
        return nomA;
    }

    public void setNomA(String nomA) {
        this.nomA = nomA;
    }

    public Integer getDiasA() {
        return diasA;
    }

    public void setDiasA(Integer diasA) {
        this.diasA = diasA;
    }

    @XmlTransient
    public List<Tramites> getTramitesList() {
        return tramitesList;
    }

    public void setTramitesList(List<Tramites> tramitesList) {
        this.tramitesList = tramitesList;
    }

    @XmlTransient
    public List<Empleados> getEmpleadosList() {
        return empleadosList;
    }

    public void setEmpleadosList(List<Empleados> empleadosList) {
        this.empleadosList = empleadosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codA != null ? codA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areas)) {
            return false;
        }
        Areas other = (Areas) object;
        if ((this.codA == null && other.codA != null) || (this.codA != null && !this.codA.equals(other.codA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Areas[ codA=" + codA + " ]";
    }
    
}
