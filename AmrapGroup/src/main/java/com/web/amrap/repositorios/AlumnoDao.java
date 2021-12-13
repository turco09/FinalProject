
package com.web.amrap.repositorios;

import com.web.amrap.entidades.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlumnoDao extends JpaRepository<Alumno,Long>{
    
}
