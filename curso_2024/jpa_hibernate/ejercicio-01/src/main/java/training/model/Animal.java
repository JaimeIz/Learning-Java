package training.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "Animal.nombre", query = "SELECT a.nombre FROM Animal a"),
})
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre, clase, habitat;

    public Animal() {}

    public Animal(String nombre, String clase, String habitat) {
        this.nombre = nombre;
        this.clase = clase;
        this.habitat = habitat;
    }

    public Animal(Long id, String nombre, String clase, String habitat) {
        this(nombre, clase, habitat);
        this.id = id;
    }

    @Override
	public int hashCode() {
		return Objects.hash(clase, habitat, id, nombre);
	}

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(clase, other.clase) && Objects.equals(habitat, other.habitat)
				&& Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

    @Override
    public String toString() {
        return "Animal [id=" + id + ", nombre=" + nombre + ", clase=" + clase + ", habitat=" + habitat + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

}
