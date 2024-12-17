package training;

import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityManagerFactory;

import jakarta.persistence.Persistence;

import training.model.Animal;
import training.service.imp.AnimalServiceImp;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa.animal");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();

        AnimalServiceImp service = new AnimalServiceImp(em);

        Animal hippo = service.create(new Animal("Hippop", "Mamífero", "Sabana"));
        
        service.create(new Animal("Horse", "Mamífero", "Sabana"));
        service.create(new Animal("Rabit", "Mamífero", "Sabana"));
        service.create(new Animal("Bird", "", "Sabana"));

        Animal encontrado = service.findById(1L).get();
        System.out.println(encontrado);

        if (service.removeById(1L).isPresent())
            System.out.println("Animal eliminado");
        else
            System.out.println("Error al eliminar");

        hippo.setHabitat("Rios y lagos");
        service.update(hippo);

        System.out.println(service.getNombres());
        
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}