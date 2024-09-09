
package formasgeometricaabstratas;


public class gerente extends funcionario {
    private double salario;
    private double adicional;
    private double salarioFinal;

    public gerente(double salario, double adicional) {
        this.salario = salario;
        this.adicional = adicional;
        this.salarioFinal = salario + adicional;
    }
    
    @Override
    public void calcularSalario(){
        System.out.println("Salário: " + salarioFinal);
    }
    
    
}
