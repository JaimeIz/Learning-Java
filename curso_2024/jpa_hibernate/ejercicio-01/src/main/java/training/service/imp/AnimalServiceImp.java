package training.service.imp;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import training.model.Animal;
import training.service.GenericService;

public class AnimalServiceImp implements GenericService<Animal, Long> {

    private EntityManager em;

    public AnimalServiceImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public Animal create(Animal animal) {
        em.persist(animal);
        return animal;
    }

    @Override
    public Optional<Animal> findById(Long id) {
        return Optional.ofNullable(em.find(Animal.class, id));
    }

    @Override
    public boolean remove(Animal animal) {
        if (animal == null)
            return false;

        em.remove(animal);
        return true;
    }    

    @Override
    public Optional<Animal> removeById(Long id) {
        if (id == null)
            return Optional.empty();
        
        Optional<Animal> animal = this.findById(id);

        if (animal.isEmpty())
            return Optional.empty();
        
        return this.remove(animal.get()) ? animal : Optional.empty();
    }

    @Override
    public Optional<Animal> update(Animal animal) {
        if (animal == null)
            return Optional.empty();
            
        Optional<Animal> old_animal = this.findById(animal.getId());

        if (old_animal.isEmpty())
            return Optional.empty();

        em.persist(animal);
        return Optional.of(animal);
    }

    public List<String> getNombres() {
        return this.em.createNamedQuery("Animal.nombre", String.class).getResultList();
    } 
}
