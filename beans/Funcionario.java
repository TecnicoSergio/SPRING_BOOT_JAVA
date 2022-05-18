package com.exercicioFuncionario.ExercicioFuncionario.beans;

import javax.persistence.*;
@Entity
@Table(name="funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="codigo")
    private  int codigo;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    @Column(name="nome")
    private String nome;

    @Column(name="setor")
    private String setor;

    @Column(name="salario")
    private double salario;


}
