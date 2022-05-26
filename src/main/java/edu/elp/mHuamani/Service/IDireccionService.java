package edu.elp.mHuamani.Service;

import edu.elp.mHuamani.entidades.Direccion;
import edu.elp.mHuamani.entidades.Persona;

import java.util.List;

public interface IDireccionService {

    List<Direccion> listaDireccion();

    Persona obtenerPersonaByCodigo(String codigo);


}
