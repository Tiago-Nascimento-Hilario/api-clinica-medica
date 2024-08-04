package br.com.tiago.api.controller;


import br.com.tiago.api.medico.CadastroMedico;
import br.com.tiago.api.medico.DadosListagemMedico;
import br.com.tiago.api.medico.Medico;
import br.com.tiago.api.medico.MedicoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private MedicoRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody CadastroMedico dados){
        repository.save(new Medico(dados));
    }
    @GetMapping
    public List<DadosListagemMedico> listar(){
        return  repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
