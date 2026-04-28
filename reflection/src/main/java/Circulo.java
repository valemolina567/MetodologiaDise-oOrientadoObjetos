/**
 * Representa un círculo. Hereda de Figura e implementa
 * los cálculos específicos usando el radio.
 *
 * Fórmulas:
 *   Perímetro (circunferencia) = 2 * π * radio
 *   Área                       = π * radio²
 *
 * Nota: Los resultados se redondean a Long para mantener
 *       consistencia con la interfaz IFigura.
 */
public class Circulo extends Figura {

    private int radio = 0;

    public Circulo() {}

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public Long perimetro() {
        return Math.round(2 * Math.PI * radio);
    }

    @Override
    public Long area() {
        return Math.round(Math.PI * radio * radio);
    }

    @Override
    public void setDefaultParams() {
        radio = 5;
    }

    @Override
    public String getNombre() {
        return "Círculo (radio=" + radio + ")";
    }
}
