package com.bsimm.projetoponto.service;

import com.bsimm.projetoponto.model.JornadaTrabalho;
import com.bsimm.projetoponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    private JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return this.jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return this.jornadaRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long id) {
        return this.jornadaRepository.findById(id);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return this.jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteById(Long id) {
        this.jornadaRepository.deleteById(id);
    }
}
