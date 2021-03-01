/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.Hotel2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "Habitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitacion.findAll", query = "SELECT h FROM Habitacion h")})
public class Habitacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private Serializable nombre;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "capacidad")
    private Integer capacidad;
    @Column(name = "tipohabitacion")
    private Serializable tipohabitacion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "habitacion1", fetch = FetchType.LAZY)
    private TipoHabitacion tipoHabitacion;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private CaracteristicasHabitacion caracteristicasHabitacion;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Reservacion reservacion;

    public Habitacion() {
    }

    public Habitacion(Integer id) {
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

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Serializable getTipohabitacion() {
        return tipohabitacion;
    }

    public void setTipohabitacion(Serializable tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public CaracteristicasHabitacion getCaracteristicasHabitacion() {
        return caracteristicasHabitacion;
    }

    public void setCaracteristicasHabitacion(CaracteristicasHabitacion caracteristicasHabitacion) {
        this.caracteristicasHabitacion = caracteristicasHabitacion;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
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
        if (!(object instanceof Habitacion)) {
            return false;
        }
        Habitacion other = (Habitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.Hotel2.Habitacion[ id=" + id + " ]";
    }
    
}
