
package formasgeometricaabstratas;


public class triangulo extends FormaGeometrica{
    private double base;
    private double altura;
    private double resultado;

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calculararea(){
    resultado = base * altura / 2;
        System.out.println("Área triângulo: " + resultado);
    }
}
