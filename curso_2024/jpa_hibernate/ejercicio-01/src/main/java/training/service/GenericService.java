package training.service;

import java.util.Optional;

public interface GenericService<E, I> {
    public E create(E entity);
    public Optional<E> findById(I id);
    public boolean remove(E entity);
    public Optional<E> removeById(I id);
    public Optional<E> update(E entity);
}
