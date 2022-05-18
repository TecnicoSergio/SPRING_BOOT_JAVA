package com.exercicioFuncionario.ExercicioFuncionario.repositorio;

import com.exercicioFuncionario.ExercicioFuncionario.beans.Funcionario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
public interface FuncionarioRepositorio extends CrudRepository<Funcionario, Integer>{

    List<Funcionario>findAll();

    Funcionario findByCodigo(int codigo);

    void delete(Funcionario funcionario);

    <FuncionarioMod extends Funcionario> FuncionarioMod save(FuncionarioMod funcionario);
}
