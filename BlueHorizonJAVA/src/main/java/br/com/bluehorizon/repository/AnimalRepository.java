package br.com.bluehorizon.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bluehorizon.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}