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
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByCodUsu", query = "SELECT u FROM Usuarios u WHERE u.codUsu = :codUsu")
    , @NamedQuery(name = "Usuarios.findByDniUsu", query = "SELECT u FROM Usuarios u WHERE u.dniUsu = :dniUsu")
    , @NamedQuery(name = "Usuarios.findByNomUsu", query = "SELECT u FROM Usuarios u WHERE u.nomUsu = :nomUsu")
    , @NamedQuery(name = "Usuarios.findByApeUsu", query = "SELECT u FROM Usuarios u WHERE u.apeUsu = :apeUsu")
    , @NamedQuery(name = "Usuarios.findByEmailUsu", query = "SELECT u FROM Usuarios u WHERE u.emailUsu = :emailUsu")
    , @NamedQuery(name = "Usuarios.findByCelUsu", query = "SELECT u FROM Usuarios u WHERE u.celUsu = :celUsu")
    , @NamedQuery(name = "Usuarios.findByDirecUsu", query = "SELECT u FROM Usuarios u WHERE u.direcUsu = :direcUsu")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codUsu;
    @Size(max = 8)
    @Column(length = 8)
    private String dniUsu;
    @Size(max = 60)
    @Column(length = 60)
    private String nomUsu;
    @Size(max = 60)
    @Column(length = 60)
    private String apeUsu;
    @Size(max = 50)
    @Column(length = 50)
    private String emailUsu;
    @Size(max = 9)
    @Column(length = 9)
    private String celUsu;
    @Size(max = 60)
    @Column(length = 60)
    private String direcUsu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUsu")
    private List<Tramites> tramitesList;
    @JoinColumn(name = "CodUbig", referencedColumnName = "CodUbig", nullable = false)
    @ManyToOne(optional = false)
    private Ubigeo codUbig;

    public Usuarios() {
    }

    public Usuarios(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public Integer getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public String getDniUsu() {
        return dniUsu;
    }

    public void setDniUsu(String dniUsu) {
        this.dniUsu = dniUsu;
    }

    public String getNomUsu() {
        return nomUsu;
    }

    public void setNomUsu(String nomUsu) {
        this.nomUsu = nomUsu;
    }

    public String getApeUsu() {
        return apeUsu;
    }

    public void setApeUsu(String apeUsu) {
        this.apeUsu = apeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getCelUsu() {
        return celUsu;
    }

    public void setCelUsu(String celUsu) {
        this.celUsu = celUsu;
    }

    public String getDirecUsu() {
        return direcUsu;
    }

    public void setDirecUsu(String direcUsu) {
        this.direcUsu = direcUsu;
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
        hash += (codUsu != null ? codUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.codUsu == null && other.codUsu != null) || (this.codUsu != null && !this.codUsu.equals(other.codUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usuarios[ codUsu=" + codUsu + " ]";
    }
    
}
