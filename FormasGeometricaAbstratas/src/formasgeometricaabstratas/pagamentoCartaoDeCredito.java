
package formasgeometricaabstratas;


public class pagamentoCartaoDeCredito extends pagamento {
    private double compra1;
    private double compra2;
    private double valor;

    public pagamentoCartaoDeCredito(double compra1, double compra2) {
        this.compra1 = compra1;
        this.compra2 = compra2;
    }
    
    @Override
    public void CalcularValor(){
    valor = compra1 + compra2;
        System.out.println("Valor a pagar: " + valor);
    }
}
