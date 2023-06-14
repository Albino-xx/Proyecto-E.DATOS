/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author jossanchez
 */
public class Cancelacion {
    private String idCancelacion;
    private String cedulaHuesped;
    private String motivoCancelacion;
    private String idReserva;
    private String descripcionReserva;
    private String tipoReserva;
    private String fechaInicio;
    private String fechaFinal;
    private String fechaCreacion;
    private int numeroPersonas;

    public Cancelacion(String idCancelacion, String cedulaHuesped, String motivoCancelacion, String idReserva,
                       String descripcionReserva, String tipoReserva, String fechaInicio, String fechaFinal,
                       String fechaCreacion, int numeroPersonas) {
        this.idCancelacion = idCancelacion;
        this.cedulaHuesped = cedulaHuesped;
        this.motivoCancelacion = motivoCancelacion;
        this.idReserva = idReserva;
        this.descripcionReserva = descripcionReserva;
        this.tipoReserva = tipoReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaCreacion = fechaCreacion;
        this.numeroPersonas = numeroPersonas;
    }

    public String getIdCancelacion() {
        return idCancelacion;
    }

    public void setIdCancelacion(String idCancelacion) {
        this.idCancelacion = idCancelacion;
    }

    public String getCedulaHuesped() {
        return cedulaHuesped;
    }

    public void setCedulaHuesped(String cedulaHuesped) {
        this.cedulaHuesped = cedulaHuesped;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getDescripcionReserva() {
        return descripcionReserva;
    }

    public void setDescripcionReserva(String descripcionReserva) {
        this.descripcionReserva = descripcionReserva;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
}
