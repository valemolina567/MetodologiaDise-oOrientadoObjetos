/**
 * Representa un rectángulo. Hereda de Figura e implementa
 * los cálculos usando base y altura.
 *
 * Fórmulas:
 *   Perímetro = 2 * (base + altura)
 *   Área      = base * altura
 */
public class Rectangulo extends Figura {

    private int base   = 0;
    private int altura = 0;

    public Rectangulo() {}

    public Rectangulo(int base, int altura) {
        this.base   = base;
        this.altura = altura;
    }

    @Override
    public Long perimetro() {
        return Long.valueOf(2 * (base + altura));
    }

    @Override
    public Long area() {
        return Long.valueOf(base * altura);
    }

    @Override
    public void setDefaultParams() {
        base   = 6;
        altura = 3;
    }

    @Override
    public String getNombre() {
        return "Rectángulo (base=" + base + ", altura=" + altura + ")";
    }
}
