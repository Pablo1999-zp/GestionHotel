/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.Hotel2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "TipoHabitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoHabitacion.findAll", query = "SELECT t FROM TipoHabitacion t")})
public class TipoHabitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private Serializable nombre;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "habitacion")
    private Serializable habitacion;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Habitacion habitacion1;

    public TipoHabitacion() {
    }

    public TipoHabitacion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Serializable getNombre() {
        return nombre;
    }

    public void setNombre(Serializable nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Serializable getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Serializable habitacion) {
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion1() {
        return habitacion1;
    }

    public void setHabitacion1(Habitacion habitacion1) {
        this.habitacion1 = habitacion1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoHabitacion)) {
            return false;
        }
        TipoHabitacion other = (TipoHabitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.Hotel2.TipoHabitacion[ id=" + id + " ]";
    }
    
}
