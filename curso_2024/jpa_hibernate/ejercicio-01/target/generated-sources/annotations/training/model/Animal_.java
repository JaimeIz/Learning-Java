package training.model;

import jakarta.persistence.TypedQueryReference;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link training.model.Animal}
 **/
@StaticMetamodel(Animal.class)
public abstract class Animal_ {

	
	/**
	 * @see #habitat
	 **/
	public static final String HABITAT = "habitat";
	
	/**
	 * @see #_Animal_nombre_
	 **/
	public static final String QUERY_ANIMAL_NOMBRE = "Animal.nombre";
	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #clase
	 **/
	public static final String CLASE = "clase";

	
	/**
	 * Static metamodel for attribute {@link training.model.Animal#habitat}
	 **/
	public static volatile SingularAttribute<Animal, String> habitat;
	
	/**
	 * The query named {@value QUERY_ANIMAL_NOMBRE}
	 * <pre>
	 * SELECT a.nombre FROM Animal a
	 * </pre>
	 *
	 * @see training.model.Animal
	 **/
	public static volatile TypedQueryReference<String> _Animal_nombre_;
	
	/**
	 * Static metamodel for attribute {@link training.model.Animal#id}
	 **/
	public static volatile SingularAttribute<Animal, Long> id;
	
	/**
	 * Static metamodel type for {@link training.model.Animal}
	 **/
	public static volatile EntityType<Animal> class_;
	
	/**
	 * Static metamodel for attribute {@link training.model.Animal#nombre}
	 **/
	public static volatile SingularAttribute<Animal, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link training.model.Animal#clase}
	 **/
	public static volatile SingularAttribute<Animal, String> clase;

}

