
package formasgeometricaabstratas;


public class pagamentoBoleto extends pagamento {
    private double compra;
    private double valor;

    public pagamentoBoleto(double compra) {
        this.compra = compra;
        this.valor = compra;
    }
    @Override
    public void CalcularValor(){
        System.out.println("Valor a pagar: " + valor);
    }
    
    
    
    
}
