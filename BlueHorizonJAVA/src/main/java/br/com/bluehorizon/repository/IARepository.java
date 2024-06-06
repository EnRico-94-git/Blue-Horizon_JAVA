package br.com.bluehorizon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bluehorizon.model.IA;

@Repository
public interface IARepository extends JpaRepository<IA, Long> {
}