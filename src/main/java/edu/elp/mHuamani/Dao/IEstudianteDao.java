package edu.elp.mHuamani.Dao;

import edu.elp.mHuamani.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {

    Estudiante findByCodigo(String codigo);

}
