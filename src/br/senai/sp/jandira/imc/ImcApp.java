package br.senai.sp.jandira.imc;

import br.senai.sp.jandira.imc.model.Aluno;
import br.senai.sp.jandira.imc.model.Imc;
import br.senai.sp.jandira.imc.view.TelaImc;

import java.time.LocalDate;
import java.util.Scanner;

public class ImcApp {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Iniciando a aplicação...");

        new TelaImc();

        Aluno maria = new Aluno();
        maria.setNome("Maria Conceição");
        maria.setDataNascimento(LocalDate.of(1998,8,22));
        maria.setEmail("maria@gmail.com");
        maria.setCelular("(11)95144-6542");
        maria.setPeso(50);
        maria.setAltura(1.65);

        Imc imcMaria = new Imc(maria);

        Aluno joao = new Aluno();
        joao.setNome("João Pereira");
        joao.setDataNascimento(LocalDate.of(1999,5,15));
        joao.setEmail("joao@gmail.com");
        joao.setCelular("(11)96369-9987");
        joao.setPeso(57);
        joao.setAltura(1.72);

        Imc imcJoao = new Imc(joao);

        imcMaria.exibirDados();
        imcJoao.exibirDados();
    }
}
