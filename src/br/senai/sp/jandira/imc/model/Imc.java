package br.senai.sp.jandira.imc;

import javax.swing.*;

public class Imc {
    int peso;
    double altura;
    double imc;
    String nomeAluno;

    public boolean setAltura(double novoValor){
        if (novoValor >= 1 && novoValor <= 2.5){
            altura = novoValor;
            return true;
        } else {
            return false;
        }
    }

    private void calcularIMC(){
        imc = peso / Math.pow(altura, 2.0);
    }

    public void definirEstadoImc(){
        String estado = "Calculando resultado...";
    }

    public void exibirDados(){
        System.out.println("-------------------------");
        System.out.printf("Nome: %s\n", nomeAluno);
        System.out.printf("Peso: %s\n", peso);
        System.out.printf("Altura: %s\n", altura );
        calcularIMC();
        System.out.printf("IMC: %s\n", imc);
    }
}
