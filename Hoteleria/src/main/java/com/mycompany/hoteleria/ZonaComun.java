/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author Carlo
 */
public class ZonaComun {

    private String idZonaComun;
    private String cedulaHuesped;
    private String fechaReservada;
    private String zonaComunReservada;
    private int numeroPersonasInvitadas;

    public ZonaComun(String idZonaComun, String cedulaHuesped, String fechaReservada, String zonaComunReservada,
            int numeroPersonasInvitadas) {
        this.idZonaComun = idZonaComun;
        this.cedulaHuesped = cedulaHuesped;
        this.fechaReservada = fechaReservada;
        this.zonaComunReservada = zonaComunReservada;
        this.numeroPersonasInvitadas = numeroPersonasInvitadas;
    }

    public String getIdZonaComun() {
        return idZonaComun;
    }

    public void setIdZonaComun(String idZonaComun) {
        this.idZonaComun = idZonaComun;
    }

    public String getCedulaHuesped() {
        return cedulaHuesped;
    }

    public void setCedulaHuesped(String cedulaHuesped) {
        this.cedulaHuesped = cedulaHuesped;
    }

    public String getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(String fechaReservada) {
        this.fechaReservada = fechaReservada;
    }

    public String getZonaComunReservada() {
        return zonaComunReservada;
    }

    public void setZonaComunReservada(String zonaComunReservada) {
        this.zonaComunReservada = zonaComunReservada;
    }

    public int getNumeroPersonasInvitadas() {
        return numeroPersonasInvitadas;
    }

    public void setNumeroPersonasInvitadas(int numeroPersonasInvitadas) {
        this.numeroPersonasInvitadas = numeroPersonasInvitadas;
    }
}
