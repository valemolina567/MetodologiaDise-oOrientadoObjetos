/**
 * Clase abstracta que implementa IFigura y sirve como base
 * para todas las figuras geométricas concretas.
 *
 * Aplica el principio de abstracción: define la estructura común
 * y delega los cálculos específicos a las subclases.
 */
public abstract class Figura implements IFigura {

    public Figura() {}

    /**
     * Muestra en consola la información completa de la figura.
     * Este método es concreto y reutilizable por todas las subclases (herencia).
     */
    public void mostrarInfo() {
        System.out.println("=============================");
        System.out.println("Figura : " + getNombre());
        System.out.println("Perímetro : " + perimetro());
        System.out.println("Área      : " + area());
        System.out.println("=============================");
    }
}
