/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author jossanchez
 */
public class Cancelacion extends Reserva{
     private int cedulaHuesped;
    private String idCancelacion;
    private String motivoCancelacion;

    public Cancelacion(String idCancelacion, int cedulaHuesped, String motivoCancelacion, String idReserva,
                       String descripcionReserva, String tipoReserva, String fechaInicio, String fechaFinal,
                       String fechaCreacion, int numeroPersonas) {
        super(idReserva, descripcionReserva, tipoReserva, fechaInicio, fechaFinal, fechaCreacion, numeroPersonas, "Cancelada");
        this.idCancelacion = idCancelacion;
        this.cedulaHuesped = cedulaHuesped;
        this.motivoCancelacion = motivoCancelacion;
    }


    public String getIdCancelacion() {
        return idCancelacion;
    }

    public void setIdCancelacion(String idCancelacion) {
        this.idCancelacion = idCancelacion;
    }

    public int getCedulaHuesped() {
        return cedulaHuesped;
    }

    public void setCedulaHuesped(int cedulaHuesped) {
        this.cedulaHuesped = cedulaHuesped;
    }

    public String getMotivoCancelacion() {
        return motivoCancelacion;
    }

    public void setMotivoCancelacion(String motivoCancelacion) {
        this.motivoCancelacion = motivoCancelacion;
    }

}
