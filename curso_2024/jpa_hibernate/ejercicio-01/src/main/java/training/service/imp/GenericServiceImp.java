package training.service.imp;

import java.util.Optional;

import training.service.GenericService;

public class GenericServiceImp<E, I> implements GenericService<E, I> {

    @Override
    public E create(E entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEtity'");
    }

    @Override
    public Optional<E> findById(I id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEtity'");
    }

    @Override
    public boolean remove(E entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Optional<E> removeById(I id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeEtity'");
    }

    @Override
    public Optional<E> update(E entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEtity'");
    }
    
}
