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
 * La clase Turno representa una cita médica con un número de turno, un paciente, una fecha y un secretario.
 */
public class Turno {
    // Atributos
    private int numeroTurno;    // Número de turno
    private Paciente paciente;  // Paciente que tiene la cita
    private String fecha;       // Fecha de la cita
    private String secretario;  // Secretario que registra la cita

    /**
     * Crea una nueva instancia de la clase Turno con el número de turno, el paciente, la fecha y el secretario especificados.
     *
     * @param numeroTurno El número de turno.
     * @param paciente    El paciente que tiene la cita.
     * @param fecha       La fecha de la cita.
     * @param secretario  El secretario que registra la cita.
     */
    public Turno(int numeroTurno, Paciente paciente, String fecha, String secretario) {
        this.numeroTurno = numeroTurno;
        this.paciente = paciente;
        this.fecha = fecha;
        this.secretario = secretario;
    }

    /**
     * Obtiene el número de turno.
     *
     * @return El número de turno.
     */
    public int getNumeroTurno() {
        return numeroTurno;
    }

    /**
     * Establece el número de turno.
     *
     * @param numeroTurno El nuevo número de turno.
     */
    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    /**
     * Obtiene el paciente que tiene la cita.
     *
     * @return El paciente que tiene la cita.
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Establece el paciente que tiene la cita.
     *
     * @param paciente El nuevo paciente que tiene la cita.
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Obtiene la fecha de la cita.
     *
     * @return La fecha de la cita.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la cita.
     *
     * @param fecha La nueva fecha de la cita.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el secretario que registra la cita.
     *
     * @return El secretario que registra la cita.
     */
    public String getSecretario() {
        return secretario;
    }

    /**
     * Establece el secretario que registra la cita.
     *
     * @param secretario El nuevo secretario que registra la cita.
     */
    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }
}

