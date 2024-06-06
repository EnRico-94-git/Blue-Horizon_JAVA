package br.com.bluehorizon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.bluehorizon.model.Registro;
import br.com.bluehorizon.repository.RegistroRepository;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository registroRepository;

    public Page<Registro> findAll(Pageable pageable) {
        return registroRepository.findAll(pageable);
    }

    public Optional<Registro> findById(Long id) {
        return registroRepository.findById(id);
    }

    public Registro save(Registro registro) {
        return registroRepository.save(registro);
    }

    public void deleteById(Long id) {
        registroRepository.deleteById(id);
    }
}