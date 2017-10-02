/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e")
    , @NamedQuery(name = "Empleados.findByCodEmp", query = "SELECT e FROM Empleados e WHERE e.codEmp = :codEmp")
    , @NamedQuery(name = "Empleados.findByDniEmp", query = "SELECT e FROM Empleados e WHERE e.dniEmp = :dniEmp")
    , @NamedQuery(name = "Empleados.findByNomEmp", query = "SELECT e FROM Empleados e WHERE e.nomEmp = :nomEmp")
    , @NamedQuery(name = "Empleados.findByApeEmp", query = "SELECT e FROM Empleados e WHERE e.apeEmp = :apeEmp")
    , @NamedQuery(name = "Empleados.findByEmailEmp", query = "SELECT e FROM Empleados e WHERE e.emailEmp = :emailEmp")
    , @NamedQuery(name = "Empleados.findByCelEmp", query = "SELECT e FROM Empleados e WHERE e.celEmp = :celEmp")
    , @NamedQuery(name = "Empleados.findByDirecEmp", query = "SELECT e FROM Empleados e WHERE e.direcEmp = :direcEmp")
    , @NamedQuery(name = "Empleados.findByUserEmp", query = "SELECT e FROM Empleados e WHERE e.userEmp = :userEmp")
    , @NamedQuery(name = "Empleados.findByPssEmp", query = "SELECT e FROM Empleados e WHERE e.pssEmp = :pssEmp")
    , @NamedQuery(name = "Empleados.findByLevelEmp", query = "SELECT e FROM Empleados e WHERE e.levelEmp = :levelEmp")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer codEmp;
    @Size(max = 8)
    @Column(length = 8)
    private String dniEmp;
    @Size(max = 60)
    @Column(length = 60)
    private String nomEmp;
    @Size(max = 60)
    @Column(length = 60)
    private String apeEmp;
    @Size(max = 50)
    @Column(length = 50)
    private String emailEmp;
    @Size(max = 9)
    @Column(length = 9)
    private String celEmp;
    @Size(max = 60)
    @Column(length = 60)
    private String direcEmp;
    @Size(max = 60)
    @Column(length = 60)
    private String userEmp;
    @Size(max = 10)
    @Column(length = 10)
    private String pssEmp;
    @Size(max = 60)
    @Column(length = 60)
    private String levelEmp;
    @JoinColumn(name = "CodA", referencedColumnName = "CodA", nullable = false)
    @ManyToOne(optional = false)
    private Areas codA;
    @JoinColumn(name = "CodUbig", referencedColumnName = "CodUbig", nullable = false)
    @ManyToOne(optional = false)
    private Ubigeo codUbig;

    public Empleados() {
    }

    public Empleados(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public Integer getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Integer codEmp) {
        this.codEmp = codEmp;
    }

    public String getDniEmp() {
        return dniEmp;
    }

    public void setDniEmp(String dniEmp) {
        this.dniEmp = dniEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getApeEmp() {
        return apeEmp;
    }

    public void setApeEmp(String apeEmp) {
        this.apeEmp = apeEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getCelEmp() {
        return celEmp;
    }

    public void setCelEmp(String celEmp) {
        this.celEmp = celEmp;
    }

    public String getDirecEmp() {
        return direcEmp;
    }

    public void setDirecEmp(String direcEmp) {
        this.direcEmp = direcEmp;
    }

    public String getUserEmp() {
        return userEmp;
    }

    public void setUserEmp(String userEmp) {
        this.userEmp = userEmp;
    }

    public String getPssEmp() {
        return pssEmp;
    }

    public void setPssEmp(String pssEmp) {
        this.pssEmp = pssEmp;
    }

    public String getLevelEmp() {
        return levelEmp;
    }

    public void setLevelEmp(String levelEmp) {
        this.levelEmp = levelEmp;
    }

    public Areas getCodA() {
        return codA;
    }

    public void setCodA(Areas codA) {
        this.codA = codA;
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
        hash += (codEmp != null ? codEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.codEmp == null && other.codEmp != null) || (this.codEmp != null && !this.codEmp.equals(other.codEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Empleados[ codEmp=" + codEmp + " ]";
    }
    
}
