package com.web.amrap.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alumno implements Serializable {
    
    @Id
    private String id;
}
