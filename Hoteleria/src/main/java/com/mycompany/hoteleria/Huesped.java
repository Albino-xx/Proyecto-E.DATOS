/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author jossanchez
 */
public class Huesped extends Persona {
    private int edad;
    private String pais;
    private String nacionalidad;
    private String telefono;

    public Huesped(String cedula, String nombre, int edad, String pais, String nacionalidad, String telefono) {
        super(cedula, nombre);
        this.edad = edad;
        this.pais = pais;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
