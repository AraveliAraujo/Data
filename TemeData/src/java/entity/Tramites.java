/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Araveli Araujo
 */
@Entity
@Table(catalog = "TRAMITEDOC", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tramites.findAll", query = "SELECT t FROM Tramites t")
    , @NamedQuery(name = "Tramites.findByCodTram", query = "SELECT t FROM Tramites t WHERE t.codTram = :codTram")
    , @NamedQuery(name = "Tramites.findByFechTram", query = "SELECT t FROM Tramites t WHERE t.fechTram = :fechTram")
    , @NamedQuery(name = "Tramites.findByEstadTram", query = "SELECT t FROM Tramites t WHERE t.estadTram = :estadTram")
    , @NamedQuery(name = "Tramites.findByRptaTram", query = "SELECT t FROM Tramites t WHERE t.rptaTram = :rptaTram")
    , @NamedQuery(name = "Tramites.findByObserTram", query = "SELECT t FROM Tramites t WHERE t.obserTram = :obserTram")
    , @NamedQuery(name = "Tramites.findByFoliacion", query = "SELECT t FROM Tramites t WHERE t.foliacion = :foliacion")
    , @NamedQuery(name = "Tramites.findByAsuntoTram", query = "SELECT t FROM Tramites t WHERE t.asuntoTram = :asuntoTram")})
public class Tramites implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codTram;
    @Temporal(TemporalType.DATE)
    private Date fechTram;
    @Size(max = 60)
    @Column(length = 60)
    private String estadTram;
    @Size(max = 60)
    @Column(length = 60)
    private String rptaTram;
    @Size(max = 120)
    @Column(length = 120)
    private String obserTram;
    @Size(max = 4)
    @Column(length = 4)
    private String foliacion;
    @Size(max = 120)
    @Column(length = 120)
    private String asuntoTram;
    @JoinColumn(name = "CodA", referencedColumnName = "CodA", nullable = false)
    @ManyToOne(optional = false)
    private Areas codA;
    @JoinColumn(name = "CodDocs", referencedColumnName = "CodDocs", nullable = false)
    @ManyToOne(optional = false)
    private Documentos codDocs;
    @JoinColumn(name = "CodEmpre", referencedColumnName = "CodEmpre", nullable = false)
    @ManyToOne(optional = false)
    private Empresas codEmpre;
    @JoinColumn(name = "CodUsu", referencedColumnName = "CodUsu", nullable = false)
    @ManyToOne(optional = false)
    private Usuarios codUsu;

    public Tramites() {
    }

    public Tramites(Integer codTram) {
        this.codTram = codTram;
    }

    public Integer getCodTram() {
        return codTram;
    }

    public void setCodTram(Integer codTram) {
        this.codTram = codTram;
    }

    public Date getFechTram() {
        return fechTram;
    }

    public void setFechTram(Date fechTram) {
        this.fechTram = fechTram;
    }

    public String getEstadTram() {
        return estadTram;
    }

    public void setEstadTram(String estadTram) {
        this.estadTram = estadTram;
    }

    public String getRptaTram() {
        return rptaTram;
    }

    public void setRptaTram(String rptaTram) {
        this.rptaTram = rptaTram;
    }

    public String getObserTram() {
        return obserTram;
    }

    public void setObserTram(String obserTram) {
        this.obserTram = obserTram;
    }

    public String getFoliacion() {
        return foliacion;
    }

    public void setFoliacion(String foliacion) {
        this.foliacion = foliacion;
    }

    public String getAsuntoTram() {
        return asuntoTram;
    }

    public void setAsuntoTram(String asuntoTram) {
        this.asuntoTram = asuntoTram;
    }

    public Areas getCodA() {
        return codA;
    }

    public void setCodA(Areas codA) {
        this.codA = codA;
    }

    public Documentos getCodDocs() {
        return codDocs;
    }

    public void setCodDocs(Documentos codDocs) {
        this.codDocs = codDocs;
    }

    public Empresas getCodEmpre() {
        return codEmpre;
    }

    public void setCodEmpre(Empresas codEmpre) {
        this.codEmpre = codEmpre;
    }

    public Usuarios getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Usuarios codUsu) {
        this.codUsu = codUsu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTram != null ? codTram.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramites)) {
            return false;
        }
        Tramites other = (Tramites) object;
        if ((this.codTram == null && other.codTram != null) || (this.codTram != null && !this.codTram.equals(other.codTram))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tramites[ codTram=" + codTram + " ]";
    }
    
}
