package com.web.amrap.implementacion;

import com.web.amrap.entidades.Alumno;
import com.web.amrap.servicios.AlumnoService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AlumnoImplement implements AlumnoService{

    @Override
    public List<Alumno> listarAlumnos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Guardar(Alumno persona) {
    }

    @Override
    public void eliminarAlumno(Alumno persona) {
    }

    @Override
    public Alumno encontrarAlumno(Alumno persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
