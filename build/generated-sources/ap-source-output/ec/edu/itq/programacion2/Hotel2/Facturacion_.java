package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.Cliente;
import ec.edu.itq.programacion2.Hotel2.Reservacion;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Reservacion> reservacion;
    public static volatile SingularAttribute<Facturacion, Cliente> cliente;
    public static volatile SingularAttribute<Facturacion, BigInteger> precio;
    public static volatile SingularAttribute<Facturacion, BigInteger> total;
    public static volatile SingularAttribute<Facturacion, BigInteger> iva;
    public static volatile SingularAttribute<Facturacion, BigInteger> subtotal;
    public static volatile SingularAttribute<Facturacion, Integer> id;

}