package br.com.bluehorizon.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.bluehorizon.model.IA;
import br.com.bluehorizon.repository.IARepository;

@Service
public class IAService {

    @Autowired
    private IARepository iaRepository;

    public Page<IA> findAll(Pageable pageable) {
        return iaRepository.findAll(pageable);
    }

    public Optional<IA> findById(Long id) {
        return iaRepository.findById(id);
    }

    public IA save(IA ia) {
        return iaRepository.save(ia);
    }

    public void deleteById(Long id) {
        iaRepository.deleteById(id);
    }
}