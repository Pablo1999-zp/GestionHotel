package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.Cliente;
import ec.edu.itq.programacion2.Hotel2.Empleado;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, Cliente> cliente;
    public static volatile SingularAttribute<Persona, Empleado> empleado;
    public static volatile SingularAttribute<Persona, Serializable> apellido;
    public static volatile SingularAttribute<Persona, String> correo;
    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile SingularAttribute<Persona, Integer> id;
    public static volatile SingularAttribute<Persona, Integer> telefono;
    public static volatile SingularAttribute<Persona, Serializable> nombre;

}