package edu.elp.mHuamani.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="persona")
public class Persona {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idpersona;

    @Column(name="nombre", length=20, nullable = false)
     private String nombre;

    @Column(name="apellido", length=40, nullable = false)
     private  String apellido;
    @Column(name="email")
     private String email;

    @OneToMany(targetEntity = Direccion.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "idpersona",referencedColumnName = "idpersona")
    private List<Direccion> direccion;

    @OneToOne(targetEntity = Profesor.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "idprofesor",referencedColumnName = "idprofesor")
    private Profesor profesor;

    @OneToOne(targetEntity = Estudiante.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "idestudiante",referencedColumnName = "idestudiante")
    private Estudiante estudiante;

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Direccion> getDireccion() {
        return direccion;
    }

    public void setDireccion(List<Direccion> direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idpersona=" + idpersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
