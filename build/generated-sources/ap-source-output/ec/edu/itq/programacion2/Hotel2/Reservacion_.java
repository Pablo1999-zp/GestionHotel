package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.Empleado;
import ec.edu.itq.programacion2.Hotel2.Facturacion;
import ec.edu.itq.programacion2.Hotel2.Habitacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Date> fechainicio;
    public static volatile SingularAttribute<Reservacion, Boolean> estado;
    public static volatile SingularAttribute<Reservacion, Double> precio;
    public static volatile SingularAttribute<Reservacion, Integer> npersonas;
    public static volatile SingularAttribute<Reservacion, Facturacion> facturacion;
    public static volatile SingularAttribute<Reservacion, Empleado> empleado;
    public static volatile SingularAttribute<Reservacion, Date> fechafin;
    public static volatile SingularAttribute<Reservacion, Integer> id;
    public static volatile SingularAttribute<Reservacion, Habitacion> habitacion;

}