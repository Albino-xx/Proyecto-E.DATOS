/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hoteleria;

/**
 *
 * @author jossanchez
 */
public class Recibo {
    
    private String idReserva;
    private String cedulaHuesped;
    private String observaciones;
    private String fecha;
    private double monto;
    private double impuesto;
    private double descuento;

    public Recibo(String idReserva, String cedulaHuesped, String observaciones, String fecha,
                  double monto, double impuesto, double descuento) {
        this.idReserva = idReserva;
        this.cedulaHuesped = cedulaHuesped;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.monto = monto;
        this.impuesto = impuesto;
        this.descuento = descuento;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getCedulaHuesped() {
        return cedulaHuesped;
    }

    public void setCedulaHuesped(String cedulaHuesped) {
        this.cedulaHuesped = cedulaHuesped;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
