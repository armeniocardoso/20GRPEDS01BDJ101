package br.edu.infnet.dominio;

public class Mensalista extends Funcionario {

    protected double salario;

    public Mensalista(int matricula, String nome, String cargo, double salario) {
        super(matricula, nome, cargo);
        this.salario = salario;
    }

    @Override
    public void calcularSalario() {

        this.mostrarCabecalho();
        System.out.println("Sal. Bruto...." + formatador.format(this.salario));
        double imposto = this.calcularImposto(this.salario);
        System.out.println("Imposto......." + formatador.format(imposto));
        double liquido = this.salario - imposto;
        System.out.println("Sal. Liquido.." + formatador.format(liquido));
    }
}
