package edu.elp.mHuamani.Service.impl;

import edu.elp.mHuamani.Dao.IEstudianteDao;
import edu.elp.mHuamani.Dao.IPersonaDao;
import edu.elp.mHuamani.Service.IPersonaService;
import edu.elp.mHuamani.entidades.Estudiante;
import edu.elp.mHuamani.entidades.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;

    @Autowired
    private IEstudianteDao iEstudianteDao;

    @Override
    public List<Persona> listaPersona() {
        return personaDao.findAll();
    }

    @Override
    public Persona obtenerPersonaByCodigo(String codigo) {
        Estudiante estudiante= new Estudiante();
        estudiante=  iEstudianteDao.findByCodigo(codigo);
        if(estudiante!=null){
            return personaDao.findByEstudiante(estudiante);
        }
 return null;

    }

    @Override
    public void registrar(Persona persona) {

        personaDao.save(persona);

    }

    @Override
    public void eliminar(long idpersona) {
        personaDao.deleteById(idpersona);
    }
}
