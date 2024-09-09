
package formasgeometricaabstratas;

public class ContaCorrente extends ContaBancaria{
    
    private int deposito;
    private int saque;
    private int saldofinal = 0;

    public ContaCorrente(int deposito, int saque) {
        this.deposito = deposito;
        this.saque = saque;
        this.saldofinal = deposito - saque;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public int getSaque() {
        return saque;
    }

    public void setSaque(int saque) {
        this.saque = saque;
    }
    
    @Override
    public void sacar(){
        System.out.println("Saque: " + getSaque());
    }
    
    @Override
    public void depositar(){
        System.out.println("Depósito: " + getDeposito());
    
    }
    

}
