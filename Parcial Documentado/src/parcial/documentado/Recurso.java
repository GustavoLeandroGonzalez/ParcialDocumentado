/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.documentado;

/**
 *
 * @author Usuario
 */
/**
 * La clase Recurso representa un recurso con un nombre y una cantidad disponible.
 */
public class Recurso {
    // Atributos
    private String nombre;    // Nombre del recurso
    private int cantidad;     // Cantidad disponible del recurso

    /**
     * Crea una nueva instancia de la clase Recurso con el nombre y la cantidad especificados.
     *
     * @param nombre   El nombre del recurso.
     * @param cantidad La cantidad disponible del recurso.
     */
    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el nombre del recurso.
     *
     * @return El nombre del recurso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la cantidad disponible del recurso.
     *
     * @return La cantidad disponible del recurso.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible del recurso.
     *
     * @param cantidad La nueva cantidad disponible del recurso.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

