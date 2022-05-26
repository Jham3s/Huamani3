package edu.elp.mHuamani.Dao;

import edu.elp.mHuamani.entidades.Estudiante;
import edu.elp.mHuamani.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface IPersonaDao extends JpaRepository<Persona,Long> {

    Persona  findByEstudiante(Estudiante estudiante);
}
