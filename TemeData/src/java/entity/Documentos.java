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
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d")
    , @NamedQuery(name = "Documentos.findByCodDocs", query = "SELECT d FROM Documentos d WHERE d.codDocs = :codDocs")
    , @NamedQuery(name = "Documentos.findByTipDocs", query = "SELECT d FROM Documentos d WHERE d.tipDocs = :tipDocs")})
public class Documentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codDocs;
    @Size(max = 60)
    @Column(length = 60)
    private String tipDocs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codDocs")
    private List<Tramites> tramitesList;

    public Documentos() {
    }

    public Documentos(Integer codDocs) {
        this.codDocs = codDocs;
    }

    public Integer getCodDocs() {
        return codDocs;
    }

    public void setCodDocs(Integer codDocs) {
        this.codDocs = codDocs;
    }

    public String getTipDocs() {
        return tipDocs;
    }

    public void setTipDocs(String tipDocs) {
        this.tipDocs = tipDocs;
    }

    @XmlTransient
    public List<Tramites> getTramitesList() {
        return tramitesList;
    }

    public void setTramitesList(List<Tramites> tramitesList) {
        this.tramitesList = tramitesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codDocs != null ? codDocs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.codDocs == null && other.codDocs != null) || (this.codDocs != null && !this.codDocs.equals(other.codDocs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Documentos[ codDocs=" + codDocs + " ]";
    }
    
}
