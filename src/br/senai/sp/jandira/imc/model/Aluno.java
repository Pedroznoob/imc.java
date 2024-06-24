package br.senai.sp.jandira.imc.model;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String celular;
    private int peso;
    private double altura;

    // Métodos de acesso get e set

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public boolean setAltura(double novoValor){
        if (novoValor >= 1 && novoValor <= 2.5){
            altura = novoValor;
            return true;
        } else {
            return false;
        }
    }

}
