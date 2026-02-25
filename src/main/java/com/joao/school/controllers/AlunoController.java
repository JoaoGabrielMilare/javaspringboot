package com.joao.school.controllers;

import com.joao.school.models.AlunoModel;
import com.joao.school.services.AlunoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController {
    @Autowired
    private AlunoServices alunoServices;


    @PostMapping
    public AlunoModel criarAluno (@RequestBody AlunoModel alunoModel){
        return alunoServices.criarAluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> buscarTodosAlunos(){
        return alunoServices.findAll();
    }
    @DeleteMapping( "/{id}")
    public void deletarAluno(@PathVariable Long id){
        alunoServices.deletarAluno(id);
    }


}
