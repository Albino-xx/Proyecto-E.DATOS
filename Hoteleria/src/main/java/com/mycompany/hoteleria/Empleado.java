/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author jossanchez
 */
public class Empleado extends Persona {
    private String tipoEmpleado;
    private String observaciones;
    private String estado;

    public Empleado(String cedula, String nombre, String tipoEmpleado, String observaciones, String estado) {
        super(cedula, nombre);
        this.tipoEmpleado = tipoEmpleado;
        this.observaciones = observaciones;
        this.estado = estado;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}