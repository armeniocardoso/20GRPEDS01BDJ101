package br.edu.infnet.dominio;

import java.text.NumberFormat;

public class Funcionario {

    protected int matricula;
    protected String nome;
    protected String cargo;
    protected double salario;
    protected NumberFormat formatador = NumberFormat.getCurrencyInstance();

    public Funcionario(int matricula, String nome, String cargo, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public void calcularSalario() {
        
        this.mostrarCabecalho();
        double imposto = this.calcularImposto(this.salario);
        System.out.println("Imposto......." + formatador.format(imposto));
        double liquido = this.salario - imposto;
        System.out.println("Sal. Liquido.." + formatador.format(liquido));
    }

    protected void mostrarCabecalho() {
        
        System.out.println("------------------------------");
        System.out.println("    Infnet - Contracheque");
        System.out.println("------------------------------");
        System.out.println("Matricula....." + this.matricula);
        System.out.println("Nome.........." + this.nome);
        System.out.println("Cargo........." + this.cargo);
        System.out.println("Sal. Bruto...." + formatador.format(this.salario));
    }
    
    protected double calcularImposto(double valor) {
        
        double imposto = 0;
        if(valor > 1000 && valor <= 3000) {
            
            imposto = valor * 0.05;
        } else if(valor > 3000 && valor <= 5000) {
            
            imposto = valor * 0.2;
        } else if(valor > 5000) {
            
            imposto = valor * 0.27;
        }
        return imposto;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
