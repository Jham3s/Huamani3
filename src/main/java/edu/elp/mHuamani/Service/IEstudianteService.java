package edu.elp.mHuamani.Service;

import edu.elp.mHuamani.entidades.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> listaEstudiante();
    Estudiante obtenerEstudianteByCodigo(String codigo);

}
