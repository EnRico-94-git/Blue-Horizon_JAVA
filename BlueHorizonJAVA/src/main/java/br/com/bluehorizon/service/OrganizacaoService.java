package br.com.bluehorizon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import br.com.bluehorizon.model.Organizacao;
import br.com.bluehorizon.repository.OrganizacaoRepository;

@Service
public class OrganizacaoService {

    @Autowired
    private OrganizacaoRepository organizacaoRepository;

    public Page<Organizacao> findAll(Pageable pageable) {
        return organizacaoRepository.findAll(pageable);
    }

    public Optional<Organizacao> findById(Long id) {
        return organizacaoRepository.findById(id);
    }

    public Organizacao save(Organizacao organizacao) {
        return organizacaoRepository.save(organizacao);
    }

    public void deleteById(Long id) {
        organizacaoRepository.deleteById(id);
    }
}
