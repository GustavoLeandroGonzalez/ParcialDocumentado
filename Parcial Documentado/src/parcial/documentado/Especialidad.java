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
 * La clase Especialidad representa una entidad que contiene información sobre una especialidad médica.
 */
public class Especialidad {
    // Atributos
    private int codigo;   // Código único de la especialidad
    private String nombre; // Nombre de la especialidad

    /**
     * Crea una nueva instancia de la clase Especialidad con el código y nombre especificados.
     *
     * @param codigo El código único de la especialidad.
     * @param nombre El nombre de la especialidad.
     */
    public Especialidad(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    /**
     * Obtiene el código único de la especialidad.
     *
     * @return El código único de la especialidad.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código único de la especialidad.
     *
     * @param codigo El nuevo código único de la especialidad.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre de la especialidad.
     *
     * @return El nombre de la especialidad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la especialidad.
     *
     * @param nombre El nuevo nombre de la especialidad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

