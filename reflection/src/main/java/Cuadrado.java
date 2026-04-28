/**
 * Representa un cuadrado. Hereda de Figura e implementa
 * los cálculos específicos de esta figura.
 *
 * Fórmulas:
 *   Perímetro = lado * 4
 *   Área      = lado * lado
 */
public class Cuadrado extends Figura {

    private int lado = 0;

    public Cuadrado() {}

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public Long perimetro() {
        return Long.valueOf(lado * 4);
    }

    @Override
    public Long area() {
        return Long.valueOf(lado * lado);
    }

    @Override
    public void setDefaultParams() {
        lado = 4;
    }

    @Override
    public String getNombre() {
        return "Cuadrado (lado=" + lado + ")";
    }
}
