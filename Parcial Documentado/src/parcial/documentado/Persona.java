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
 * La clase Persona representa a una persona con nombre, apellido, edad y estado activo/inactivo.
 */
public class Persona {
    // Atributos
    private String nombre;    // Nombre de la persona
    private String apellido;  // Apellido de la persona
    private int edad;         // Edad de la persona
    private boolean activo;   // Estado activo/inactivo de la persona

    /**
     * Crea una nueva instancia de la clase Persona con los atributos especificados.
     *
     * @param nombre   El nombre de la persona.
     * @param apellido El apellido de la persona.
     * @param edad     La edad de la persona.
     * @param activo   Indica si la persona está activa o inactiva.
     */
    public Persona(String nombre, String apellido, int edad, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.activo = activo;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return El apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido El nuevo apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la edad de la persona.
     *
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     *
     * @param edad La nueva edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Comprueba si la persona está activa.
     *
     * @return true si la persona está activa, false si está inactiva.
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Establece el estado activo/inactivo de la persona.
     *
     * @param activo true para activar a la persona, false para desactivarla.
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}

/**
 * La clase Profesional representa a un profesional de la salud que hereda de la clase Persona.
 */
class Profesional extends Persona {
    // Atributos adicionales
    private String especialidad; // Especialidad del profesional

    /**
     * Crea una nueva instancia de la clase Profesional con los atributos especificados.
     *
     * @param nombre       El nombre del profesional.
     * @param apellido     El apellido del profesional.
     * @param edad         La edad del profesional.
     * @param activo       Indica si el profesional está activo o inactivo.
     * @param especialidad La especialidad del profesional.
     */
    public Profesional(String nombre, String apellido, int edad, boolean activo, String especialidad) {
        super(nombre, apellido, edad, activo);
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la especialidad del profesional.
     *
     * @return La especialidad del profesional.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del profesional.
     *
     * @param especialidad La nueva especialidad del profesional.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

/**
 * La clase Paciente representa a un paciente de la salud que hereda de la clase Persona.
 */
class Paciente extends Persona {
    // Atributos adicionales
    private String obraSocial;   // Obra social del paciente
    private String especialidad; // Especialidad del paciente

    /**
     * Crea una nueva instancia de la clase Paciente con los atributos especificados.
     *
     * @param nombre       El nombre del paciente.
     * @param apellido     El apellido del paciente.
     * @param edad         La edad del paciente.
     * @param activo       Indica si el paciente está activo o inactivo.
     * @param obraSocial   La obra social del paciente.
     * @param especialidad La especialidad del paciente.
     */
    public Paciente(String nombre, String apellido, int edad, boolean activo, String obraSocial, String especialidad) {
        super(nombre, apellido, edad, activo);
        this.obraSocial = obraSocial;
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la obra social del paciente.
     *
     * @return La obra social del paciente.
     */
    public String getObraSocial() {
        return obraSocial;
    }

    /**
     * Establece la obra social del paciente.
     *
     * @param obraSocial La nueva obra social del paciente.
     */
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    /**
     * Obtiene la especialidad del paciente.
     *
     * @return La especialidad del paciente.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del paciente.
     *
     * @param especialidad La nueva especialidad del paciente.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}

