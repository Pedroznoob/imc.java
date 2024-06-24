package br.senai.sp.jandira.imc.model;

import javax.swing.*;
import java.awt.*;

public class TelaImc {

    private JPanel painelTitulo = new JPanel();
    private JLabel labelTitulo = new JLabel("Índice de Massa Corporal - IMC");

    private JLabel lblTituloResultadoImc = new JLabel("Resultado do IMC");
    private JLabel lblResultadoImc = new JLabel("25,00");
    private JLabel lblStatusImc = new JLabel("Normal");

    private  JLabel lblPeso = new JLabel("Peso:");
    private JTextField txtPeso = new JTextField();

    private  JLabel lblAltura = new JLabel("Altura:");
    private JTextField txtAltura = new JTextField();

    private  JButton btnCalcular = new JButton("Calcular");
    private  JButton btnLimpar = new JButton("Limpar");


    public TelaImc(){
        criarTela();
    }

    public void criarTela(){
        JFrame tela = new JFrame();
        tela.setSize(500,300);
        tela.setTitle("Calculo de IMC");
        tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

//        DEFINIR OPAINEL DE TITULO
        painelTitulo.setBounds(0,0,500,50);
        painelTitulo.setBackground(new Color(0, 132, 255));
        painelTitulo.setLayout(null);

        labelTitulo.setBounds(10,10,200,30);
        painelTitulo.add(labelTitulo);

        // COMPONENTES TELA
        lblPeso.setBounds(10,70,150,30);
        txtPeso.setBounds(10,100,150,35);
        txtPeso.setFont(new Font("Arial", Font.BOLD, 24));

        lblAltura.setBounds(10, 130,150,30);
        txtAltura.setBounds(10,160, 150,35);
        txtAltura.setFont(new Font("Arial", Font.BOLD, 24));


        lblTituloResultadoImc.setBounds(225,70,250,30);
        lblTituloResultadoImc.setForeground(Color.BLUE);
        lblTituloResultadoImc.setFont(new Font("Arial", Font.BOLD,24));
        lblTituloResultadoImc.setHorizontalAlignment(JLabel.CENTER);

        lblResultadoImc.setBounds(225,100,250,30);
        lblResultadoImc.setFont(new Font("Arial", Font.BOLD, 38));
        lblResultadoImc.setForeground(Color.RED);
        lblResultadoImc.setHorizontalAlignment(JLabel.CENTER);

        lblStatusImc.setBounds(225, 135, 250,30);
        lblStatusImc.setFont(new Font("Arial", Font.BOLD, 24));
        lblStatusImc.setForeground(Color.GRAY);
        lblStatusImc.setHorizontalAlignment(JLabel.CENTER);

        btnCalcular.setBounds(10,210,150,30);
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 20));
        btnLimpar.setBounds(180,210,150,30);
        btnLimpar.setFont(new Font("Arial", Font.BOLD, 20));


        tela.getContentPane().add(painelTitulo);
        tela.getContentPane().add(lblPeso);
        tela.getContentPane().add(txtPeso);
        tela.getContentPane().add(lblAltura);
        tela.getContentPane().add(txtAltura);
        tela.getContentPane().add(lblResultadoImc);
        tela.getContentPane().add(lblTituloResultadoImc);
        tela.getContentPane().add(lblStatusImc);
        tela.getContentPane().add(btnCalcular);
        tela.getContentPane().add(btnLimpar);
        tela.setVisible(true);
    }
}
