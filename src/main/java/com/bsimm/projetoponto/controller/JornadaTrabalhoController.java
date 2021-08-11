package com.bsimm.projetoponto.controller;

import com.bsimm.projetoponto.model.JornadaTrabalho;
import com.bsimm.projetoponto.service.JornadaService;
import org.apache.catalina.LifecycleState;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    private JornadaService jornadaService;

    @Autowired
    public JornadaTrabalhoController(JornadaService jornadaService) {
        this.jornadaService = jornadaService;
    }

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("id") Long id) throws Exception {
        if (jornadaService.getById(id).isPresent()){
            return ResponseEntity.ok(jornadaService.getById(id).get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteJornada(@PathVariable("id") Long id){
        jornadaService.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
