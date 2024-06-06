package br.com.bluehorizon.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bluehorizon.model.Registro;

@Repository
public interface RegistroRepository extends JpaRepository<Registro, Long> {
}