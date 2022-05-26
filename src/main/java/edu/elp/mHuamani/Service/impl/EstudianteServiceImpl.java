package edu.elp.mHuamani.Service.impl;

import edu.elp.mHuamani.Dao.IEstudianteDao;
import edu.elp.mHuamani.Service.IEstudianteService;
import edu.elp.mHuamani.entidades.Estudiante;
import edu.elp.mHuamani.entidades.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listaEstudiante() {
        List<Estudiante> personasList= this.estudianteDao.findAll();
        for (Estudiante estudiante:personasList){
            System.out.println(estudiante.toString());
        }
          return this.estudianteDao.findAll();



    }

    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {
        return null;
    }
}
