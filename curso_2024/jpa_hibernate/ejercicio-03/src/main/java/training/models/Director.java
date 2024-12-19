package training.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIRECTOR")
public class Director implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "NACIONALIDAD")
    private String nacionalidad;

    @OneToMany(mappedBy = "director", cascade = CascadeType.PERSIST)
    private List<Pelicula> peliculas = new ArrayList<Pelicula>();

    public Director() {
    }

    public Director(int id, String nombre, String nacionalidad) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Director)) return false;

        Director director = (Director) object;
        return this.id == director.id;
    }

    @Override
    public int hashCode() {
        return (int) this.id;
    }

    @Override
    public String toString() {
        return "Director [id_director=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
    }
}