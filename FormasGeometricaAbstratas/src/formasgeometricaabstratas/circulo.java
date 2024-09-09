
package formasgeometricaabstratas;


public class circulo extends FormaGeometrica {
    private int raio;
    private double pi = 3.14;
    private double resultado;

    public circulo(int raio) {
        this.raio = raio;
    }
    
    @Override
    public void calculararea(){
        resultado = pi * (raio^2);
        System.out.println("Área circulo: " + resultado);
    }
    
}
