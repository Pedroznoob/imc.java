package br.senai.sp.jandira.imc.model;

public class Imc {
    private double imc;

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getStatus() {
        if (getImc() <= 18.5){
            this.status = "Abaixo do Peso";
        } else if (getImc() > 18.5 && getImc() < 25.0) {
            this.status = "Peso Normal";
        } else {
            this.status = "Acima do Peso";
        }

        return status;
    }

    private String status;
    private Aluno aluno;

    public Imc(Aluno aluno){
        this.aluno = aluno;
    }

    public Imc(){

    }

    public void calcularIMC(){
        imc = aluno.getPeso() / Math.pow(aluno.getAltura(), 2.0);
    }

    public void definirEstadoImc(){
        status = "Calculando resultado...";
    }

    public void exibirDados(){
        System.out.println("-------------------------");
        System.out.printf("Nome: %s\n", aluno.getNome());
        System.out.printf("Peso: %skg\n", aluno.getPeso());
        System.out.printf("Altura: %sm\n", aluno.getAltura() );
        System.out.printf("Email: %s\n", aluno.getEmail() );
        System.out.printf("Celular: %s\n", aluno.getCelular() );
        System.out.printf("Data de Nascimento: %s\n", aluno.getDataNascimento());
        calcularIMC();
        System.out.printf("IMC: %.2f\n", imc);
    }
}
