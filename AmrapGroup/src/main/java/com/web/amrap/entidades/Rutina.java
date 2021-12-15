package com.web.amrap.entidades;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Rutina implements Serializable {
    
    @Id
    private String id;
    private String objetivo;
    
//    @OneToMany
//    private Ejercicio ejercicio;
}
