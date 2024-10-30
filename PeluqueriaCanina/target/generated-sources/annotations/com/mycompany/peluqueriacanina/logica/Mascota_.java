package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.logica.Duenio;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-08-16T16:58:49", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, String> Nombre;
    public static volatile SingularAttribute<Mascota, String> Raza;
    public static volatile SingularAttribute<Mascota, Integer> id_Mascota;
    public static volatile SingularAttribute<Mascota, String> Color;
    public static volatile SingularAttribute<Mascota, String> observaciones;
    public static volatile SingularAttribute<Mascota, Duenio> unDuenio;
    public static volatile SingularAttribute<Mascota, String> Alergico;
    public static volatile SingularAttribute<Mascota, String> atencionEspecial;

}