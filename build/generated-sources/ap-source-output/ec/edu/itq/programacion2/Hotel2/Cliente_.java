package ec.edu.itq.programacion2.Hotel2;

import ec.edu.itq.programacion2.Hotel2.EstadoCivil;
import ec.edu.itq.programacion2.Hotel2.Facturacion;
import ec.edu.itq.programacion2.Hotel2.Genero;
import ec.edu.itq.programacion2.Hotel2.Nacionalidad;
import ec.edu.itq.programacion2.Hotel2.Persona;
import ec.edu.itq.programacion2.Hotel2.TipoCliente;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-02-28T22:11:02")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, TipoCliente> tipoCliente;
    public static volatile SingularAttribute<Cliente, Persona> persona;
    public static volatile SingularAttribute<Cliente, Integer> numerovisitas;
    public static volatile SingularAttribute<Cliente, Facturacion> facturacion;
    public static volatile SingularAttribute<Cliente, Genero> genero;
    public static volatile SingularAttribute<Cliente, EstadoCivil> estadoCivil;
    public static volatile SingularAttribute<Cliente, Integer> id;
    public static volatile SingularAttribute<Cliente, Serializable> empresa;
    public static volatile SingularAttribute<Cliente, Nacionalidad> nacionalidad;

}