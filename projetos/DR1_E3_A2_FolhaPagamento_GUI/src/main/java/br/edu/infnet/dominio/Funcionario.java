package br.edu.infnet.dominio;

import java.text.NumberFormat;

public abstract class Funcionario {

    protected int matricula;
    protected String nome;
    protected String cargo;
    protected NumberFormat formatador = NumberFormat.getCurrencyInstance();
    
    public Funcionario(int matricula, String nome, String cargo) {
        
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
    }
    
    public abstract void calcularSalario();

    protected void mostrarCabecalho() {
        
        System.out.println("------------------------------");
        System.out.println("   Infnet - Contracheques");
        System.out.println("------------------------------");
        System.out.println("Matricula....." + this.matricula);
        System.out.println("Nome.........." + this.nome);
        System.out.println("Cargo........." + this.cargo);
    }
    
    protected double calcularImposto(double valor) {
        
        double retorno = 0;
        if(valor > 1000 && valor <= 3000) {
            
            retorno = valor * 0.05;
        } else if(valor > 3000 && valor <= 5000) {
            
            retorno = valor * 0.2;
        } else {
            
            retorno = valor * 0.27;
        }
        return retorno;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
