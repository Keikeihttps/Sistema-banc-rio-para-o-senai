package com.senai.infoa.segundo_projeto.models;

public class Conta {

    private int id;
    private String cpf;
    private String numConta;
    private String tipoConta;
    private double saldo;
    private String nome;
    private String agencia;
    private String senha;

    public Conta() {
    }

    public Conta(String cpf, String numConta, String tipoConta, double saldo, String nome, String agencia,
            String senha) {
        this.cpf = cpf;
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.nome = nome;
        this.agencia = agencia;
        this.senha = senha;
    }

    // get e set

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

}
