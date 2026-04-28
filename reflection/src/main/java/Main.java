import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal. Demuestra polimorfismo al tratar todas las figuras
 * como instancias de Figura, sin importar su tipo concreto.
 *
 * El sistema carga cada clase por nombre, la instancia dinámicamente
 * y llama a sus métodos de forma uniforme gracias a la herencia.
 */
public class Main {

    public static void main(String[] args) {

        // Lista de nombres de clases de figuras disponibles
        List<String> todasLasClases = new ArrayList<>();
        todasLasClases.add("Cuadrado");
        todasLasClases.add("Circulo");
        todasLasClases.add("Rectangulo");
        todasLasClases.add("Triangulo");

        System.out.println("=== Sistema de Figuras Geométricas ===\n");

        try {
            for (String nombreClase : todasLasClases) {
                // Carga la clase en tiempo de ejecución (reflexión)
                Class<?> clazz = Class.forName(nombreClase);

                // Instancia la clase dinámicamente
                // El polimorfismo permite tratarla siempre como Figura
                Figura fg = (Figura) clazz.getDeclaredConstructor().newInstance();

                // Establece valores por defecto y muestra la información
                fg.setDefaultParams();
                fg.mostrarInfo();
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Error al cargar la figura: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
