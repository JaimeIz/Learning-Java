package training.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PELICULA")
public class Pelicula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private int id;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "AÑO")
    private int año;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "RECAUDACION")
    private double recaudacion;

    @Column(name = "PRESUPUESTO")
    private double presupuesto;

    @ManyToOne
    @JoinColumn(name = "DIRECTOR")
    private Director director;

    @ManyToOne
    @JoinColumn(name = "PRODUCTORA")
    private Productora productora;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, int año, String genero, double recaudacion, double presupuesto,
            Director director, Productora productora) {
        super();
        this.id = id;
        this.titulo = titulo;
        this.año = año;
        this.genero = genero;
        this.recaudacion = recaudacion;
        this.presupuesto = presupuesto;
        this.director = director;
        this.productora = productora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public boolean equals(Object elOtro) {
        if (elOtro instanceof Pelicula) {
            Pelicula l = (Pelicula) elOtro;
            return this.id == l.id;
        }
        return false;
    }
}