package br.com.bluehorizon.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.bluehorizon.model.Organizacao;

@Repository
public interface OrganizacaoRepository extends JpaRepository<Organizacao, Long> {
}