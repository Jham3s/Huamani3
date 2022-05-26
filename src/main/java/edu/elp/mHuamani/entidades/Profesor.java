package edu.elp.mHuamani.entidades;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="profesor")
public class Profesor{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprofesor;
    @Column(name="salario", length=2000, nullable = false)
     private BigDecimal salario;
    public Profesor() {
    }

    public Long getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(Long idprofesor) {
        this.idprofesor = idprofesor;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }


}
