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
    @NamedQuery(name = "Ubigeo.findAll", query = "SELECT u FROM Ubigeo u")
    , @NamedQuery(name = "Ubigeo.findByCodUbig", query = "SELECT u FROM Ubigeo u WHERE u.codUbig = :codUbig")
    , @NamedQuery(name = "Ubigeo.findByDpto", query = "SELECT u FROM Ubigeo u WHERE u.dpto = :dpto")
    , @NamedQuery(name = "Ubigeo.findByProv", query = "SELECT u FROM Ubigeo u WHERE u.prov = :prov")
    , @NamedQuery(name = "Ubigeo.findByDist", query = "SELECT u FROM Ubigeo u WHERE u.dist = :dist")})
public class Ubigeo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codUbig;
    @Size(max = 60)
    @Column(length = 60)
    private String dpto;
    @Size(max = 60)
    @Column(length = 60)
    private String prov;
    @Size(max = 60)
    @Column(length = 60)
    private String dist;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUbig")
    private List<Usuarios> usuariosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUbig")
    private List<Empresas> empresasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codUbig")
    private List<Empleados> empleadosList;

    public Ubigeo() {
    }

    public Ubigeo(Integer codUbig) {
        this.codUbig = codUbig;
    }

    public Integer getCodUbig() {
        return codUbig;
    }

    public void setCodUbig(Integer codUbig) {
        this.codUbig = codUbig;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @XmlTransient
    public List<Empresas> getEmpresasList() {
        return empresasList;
    }

    public void setEmpresasList(List<Empresas> empresasList) {
        this.empresasList = empresasList;
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
        hash += (codUbig != null ? codUbig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubigeo)) {
            return false;
        }
        Ubigeo other = (Ubigeo) object;
        if ((this.codUbig == null && other.codUbig != null) || (this.codUbig != null && !this.codUbig.equals(other.codUbig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Ubigeo[ codUbig=" + codUbig + " ]";
    }
    
}
