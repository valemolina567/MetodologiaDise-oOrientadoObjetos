/**
 * Interfaz que define el contrato común para todas las figuras geométricas.
 * Cualquier figura debe ser capaz de calcular su perímetro, área y
 * configurar sus parámetros por defecto.
 */
public interface IFigura {

    /**
     * Calcula el perímetro de la figura.
     * @return perímetro como Long
     */
    Long perimetro();

    /**
     * Calcula el área de la figura.
     * @return área como Long
     */
    Long area();

    /**
     * Establece los parámetros por defecto de la figura.
     */
    void setDefaultParams();

    /**
     * Retorna el nombre descriptivo de la figura.
     * @return nombre de la figura
     */
    String getNombre();
}
