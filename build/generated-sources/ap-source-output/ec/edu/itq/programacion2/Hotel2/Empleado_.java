package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.Persona;
import ec.edu.itq.programacion2.Hotel2.Puesto;
import ec.edu.itq.programacion2.Hotel2.Reservacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Date> horariotrabajo;
    public static volatile SingularAttribute<Empleado, Reservacion> reservacion;
    public static volatile SingularAttribute<Empleado, Puesto> puesto;
    public static volatile SingularAttribute<Empleado, Persona> persona;
    public static volatile SingularAttribute<Empleado, Integer> id;

}