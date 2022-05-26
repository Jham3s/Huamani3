package edu.elp.mHuamani.Service;

import edu.elp.mHuamani.entidades.Profesor;

import java.util.List;

public interface IProfesorService {

    List<Profesor> listarProfesor();
    Profesor obtenerpersonasBySalario(String salario);

}
