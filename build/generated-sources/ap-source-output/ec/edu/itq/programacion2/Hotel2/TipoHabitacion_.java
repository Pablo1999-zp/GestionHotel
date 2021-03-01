package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.Habitacion;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(TipoHabitacion.class)
public class TipoHabitacion_ { 

    public static volatile SingularAttribute<TipoHabitacion, String> descripcion;
    public static volatile SingularAttribute<TipoHabitacion, Boolean> estado;
    public static volatile SingularAttribute<TipoHabitacion, Habitacion> habitacion1;
    public static volatile SingularAttribute<TipoHabitacion, Integer> id;
    public static volatile SingularAttribute<TipoHabitacion, Serializable> nombre;
    public static volatile SingularAttribute<TipoHabitacion, Serializable> habitacion;

}