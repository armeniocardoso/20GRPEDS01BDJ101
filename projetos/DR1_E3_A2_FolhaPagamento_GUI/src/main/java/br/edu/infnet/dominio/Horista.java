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
        //----------------------------------------------------------------------
        //Específico do Horista
        double pagamento = this.valorHora * this.totalHoras;
        System.out.println("Pag. Bruto...." + formatador.format(pagamento));
        double imposto = this.calcularImposto(pagamento);
        System.out.println("Imposto......." + formatador.format(imposto));
        double liquido = pagamento - imposto;
        System.out.println("Pag. Liquido.." + formatador.format(liquido));
        //----------------------------------------------------------------------
    }  

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }
}
