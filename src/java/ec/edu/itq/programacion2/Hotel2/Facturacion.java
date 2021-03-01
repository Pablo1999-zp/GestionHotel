/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.Hotel2;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "Facturacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturacion.findAll", query = "SELECT f FROM Facturacion f")})
public class Facturacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "precio")
    private BigInteger precio;
    @Column(name = "subtotal")
    private BigInteger subtotal;
    @Column(name = "total")
    private BigInteger total;
    @Column(name = "iva")
    private BigInteger iva;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "facturacion", fetch = FetchType.LAZY)
    private Reservacion reservacion;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "facturacion", fetch = FetchType.LAZY)
    private Cliente cliente;

    public Facturacion() {
    }

    public Facturacion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigInteger subtotal) {
        this.subtotal = subtotal;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    public BigInteger getIva() {
        return iva;
    }

    public void setIva(BigInteger iva) {
        this.iva = iva;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        if (!(object instanceof Facturacion)) {
            return false;
        }
        Facturacion other = (Facturacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.Hotel2.Facturacion[ id=" + id + " ]";
    }
    
}
