package edu.elp.mHuamani.entidades;


import javax.persistence.*;

@Entity
@Table(name="estudiante")
public class Estudiante{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idestudiante;

    @Column(name = "codigo",length = 111, nullable = false)
    private String codigo;

  @Column(name = "serie")
    private String serie;

    public Estudiante() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Long getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Long idestudiante) {
        this.idestudiante = idestudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", serie='" + serie + '\'' +
                '}';
    }
}
