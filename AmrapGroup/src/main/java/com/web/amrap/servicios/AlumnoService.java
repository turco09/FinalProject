
package com.web.amrap.servicios;

import com.web.amrap.entidades.Alumno;
import java.util.List;


public interface AlumnoService {
    
    public List<Alumno> listarAlumnos();
    
    public void Guardar(Alumno persona);
    
    public void eliminarAlumno(Alumno persona);
    
    public Alumno encontrarAlumno(Alumno persona);
}
