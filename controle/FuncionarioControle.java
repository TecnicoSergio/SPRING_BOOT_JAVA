package com.exercicioFuncionario.ExercicioFuncionario.controle;

import com.exercicioFuncionario.ExercicioFuncionario.beans.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import com.exercicioFuncionario.ExercicioFuncionario.repositorio.FuncionarioRepositorio;
import org.springframework.web.bind.annotation.*;
import  java.util.List;
@RestController
@RequestMapping("/api")

public class FuncionarioControle {
    @Autowired
    private FuncionarioRepositorio acoes;

    @RequestMapping(value="/funcionario",method=RequestMethod.GET)
public @ResponseBody
List<Funcionario>listar(){return acoes.findAll();}

@RequestMapping(value="/funcionario",method=RequestMethod.POST)
public @ResponseBody
Funcionario cadastrar( @RequestBody Funcionario funcionario){
return acoes.save(funcionario);
}
}