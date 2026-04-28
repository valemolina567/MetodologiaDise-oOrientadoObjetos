/**
 * Representa un triángulo. Hereda de Figura e implementa
 * los cálculos usando tres lados y la altura.
 *
 * Fórmulas:
 *   Perímetro = lado1 + lado2 + lado3
 *   Área      = (base * altura) / 2
 *
 * Para el caso por defecto se usa un triángulo equilátero de lado 4.
 */
public class Triangulo extends Figura {

    private int lado1  = 0;
    private int lado2  = 0;
    private int lado3  = 0;
    private int altura = 0;

    public Triangulo() {}

    /**
     * Constructor para triángulo equilátero (los tres lados iguales).
     * La altura se calcula automáticamente con: h = (√3 / 2) * lado
     */
    public Triangulo(int lado) {
        this.lado1  = lado;
        this.lado2  = lado;
        this.lado3  = lado;
        this.altura = (int) Math.round((Math.sqrt(3) / 2) * lado);
    }

    /**
     * Constructor para triángulo escaleno (todos los lados diferentes).
     * @param lado1  primer lado
     * @param lado2  segundo lado
     * @param lado3  tercer lado (también es la base)
     * @param altura altura perpendicular a lado3
     */
    public Triangulo(int lado1, int lado2, int lado3, int altura) {
        this.lado1  = lado1;
        this.lado2  = lado2;
        this.lado3  = lado3;
        this.altura = altura;
    }

    @Override
    public Long perimetro() {
        return Long.valueOf(lado1 + lado2 + lado3);
    }

    @Override
    public Long area() {
        return Math.round((double) (lado3 * altura) / 2);
    }

    @Override
    public void setDefaultParams() {
        // Triángulo equilátero de lado 4
        lado1  = 4;
        lado2  = 4;
        lado3  = 4;
        altura = (int) Math.round((Math.sqrt(3) / 2) * 4); // ≈ 3
    }

    @Override
    public String getNombre() {
        return "Triángulo (lados=" + lado1 + "," + lado2 + "," + lado3
                + ", altura=" + altura + ")";
    }
}
