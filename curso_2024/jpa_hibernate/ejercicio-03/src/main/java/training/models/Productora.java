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
@Table(name = "PRODUCTORA")
public class Productora implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PAIS")
    private String pais;

    @OneToMany(mappedBy = "productora", cascade = CascadeType.PERSIST)
    private List<Pelicula> peliculas = new ArrayList<>();

    public Productora() {}

    public Productora(int id, String nombre, String pais) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public boolean equals(Object laOtra) {
        if (laOtra instanceof Productora) {
            Productora p = (Productora) laOtra;
            return this.id == p.id;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return (int) this.id;
    }

    @Override
    public String toString() {
        return "Productora [id=" + id + ", nombre=" + nombre + ", pais=" + pais + "]";
    }
}
