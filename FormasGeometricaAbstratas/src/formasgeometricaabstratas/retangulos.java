
package formasgeometricaabstratas;


public class retangulos extends FormaGeometrica {
    int base;
    int altura;
    int resultado;

    public retangulos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public void calculararea(){
        resultado = base*altura;
        System.out.println("Área do retângulo: " + resultado);
    }
    
    
    
    
}
