package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.CaracteristicasHabitacion;
import ec.edu.itq.programacion2.Hotel2.Reservacion;
import ec.edu.itq.programacion2.Hotel2.TipoHabitacion;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(Habitacion.class)
public class Habitacion_ { 

    public static volatile SingularAttribute<Habitacion, Reservacion> reservacion;
    public static volatile SingularAttribute<Habitacion, Boolean> estado;
    public static volatile SingularAttribute<Habitacion, CaracteristicasHabitacion> caracteristicasHabitacion;
    public static volatile SingularAttribute<Habitacion, Serializable> tipohabitacion;
    public static volatile SingularAttribute<Habitacion, Integer> id;
    public static volatile SingularAttribute<Habitacion, TipoHabitacion> tipoHabitacion;
    public static volatile SingularAttribute<Habitacion, Serializable> nombre;
    public static volatile SingularAttribute<Habitacion, Integer> capacidad;

}