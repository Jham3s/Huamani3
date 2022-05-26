package edu.elp.mHuamani.Service;


import edu.elp.mHuamani.entidades.Persona;

import java.util.List;

public interface IPersonaService {

  List<Persona> listaPersona();
  Persona obtenerPersonaByCodigo(String codigo);

  void registrar(Persona persona);

  void eliminar(long idpersona);
}
