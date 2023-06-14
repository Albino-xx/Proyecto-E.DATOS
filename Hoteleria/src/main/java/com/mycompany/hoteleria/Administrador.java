/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author jossanchez
 */
public class Administrador extends Empleado {
    private String tipoAdministrador;
    private String funciones;

    public Administrador(String cedula, String nombre, String tipoEmpleado, String observaciones, String estado,
                         String tipoAdministrador, String funciones) {
        super(cedula, nombre, tipoEmpleado, observaciones, estado);
        this.tipoAdministrador = tipoAdministrador;
        this.funciones = funciones;
    }


    public String getTipoAdministrador() {
        return tipoAdministrador;
    }

    public void setTipoAdministrador(String tipoAdministrador) {
        this.tipoAdministrador = tipoAdministrador;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }
}
