package br.edu.infnet.dominio;

public class Horista extends Funcionario {
    
    private double valorHora;
    private int totalHoras;

    public Horista(int matricula, String nome, String cargo, 
            double valorHora, int totalHoras) {
        
        super(matricula, nome, cargo);
        this.valorHora = valorHora;
        this.totalHoras = totalHoras;
    }

    @Override
    public void calcularSalario() {
        
        this.mostrarCabecalho();
        System.out.println("Valor Hora...." + formatador.format(this.valorHora));
        System.out.println("Total Horas..." + this.totalHoras);
        double bruto = valorHora * totalHoras;
        System.out.println("Sal. Bruto...." + formatador.format(bruto));
        double imposto = this.calcularImposto(bruto);
        System.out.println("Imposto......." + formatador.format(imposto));
        double liquido = bruto - imposto;
        System.out.println("Sal. Liquido.." + formatador.format(liquido));
    }
}
