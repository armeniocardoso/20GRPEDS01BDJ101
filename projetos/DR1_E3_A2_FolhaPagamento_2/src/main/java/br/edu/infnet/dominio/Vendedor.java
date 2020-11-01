package br.edu.infnet.dominio;

public class Vendedor extends Mensalista {

    private double comissao;
    private double totalVendas;

    public Vendedor(int matricula, String nome, double salario,
            double comissao, double totalVendas) {
        
        super(matricula, nome, "Vendedor", salario);
        this.comissao = comissao;
        this.totalVendas = totalVendas;
    }

    @Override
    public void calcularSalario() {
        
        this.mostrarCabecalho();
        double valorComissao = this.comissao * this.totalVendas;
        System.out.println("Comissao......" + formatador.format(valorComissao));
        double imposto = this.calcularImposto(this.salario + valorComissao);
        System.out.println("Imposto......." + formatador.format(imposto));
        double liquido = this.salario + valorComissao - imposto;
        System.out.println("Sal. Liquido.." + formatador.format(liquido));
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
