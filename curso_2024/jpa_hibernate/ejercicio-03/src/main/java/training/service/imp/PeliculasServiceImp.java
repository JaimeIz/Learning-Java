package training.service.imp;

import java.util.Optional;

import jakarta.persistence.EntityManager;
import training.models.Pelicula;
import training.service.GenericService;

public class PeliculasServiceImp implements GenericService<Pelicula, Integer> {

    private EntityManager em;

    public PeliculasServiceImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public Pelicula create(Pelicula pelicula) {
        em.persist(pelicula);
        return pelicula;
    }

    @Override
    public Optional<Pelicula> findById(Integer id) {
        if (id < 0 || id == null) return Optional.empty();

        Pelicula pelicula = em.find(Pelicula.class, id);

        return pelicula != null ? Optional.of(pelicula) : Optional.empty();
    }

    @Override
    public boolean remove(Pelicula pelicula) {
        if (pelicula == null) return false;

        em.remove(pelicula);
        return true;
    }

    @Override
    public Optional<Pelicula> removeById(Integer id) {
        Optional<Pelicula> pelicula = this.findById(id);

        if (pelicula.isPresent() && this.remove(pelicula.get()))
            return pelicula;

        return Optional.empty();
    }

    @Override
    public Optional<Pelicula> update(Pelicula pelicula) {
        Optional<Pelicula> old_pelicula = this.findById(pelicula.getId());

        if (old_pelicula.isEmpty()) return Optional.empty();
            
        em.persist(pelicula);            
        return Optional.of(pelicula);
    }

}
