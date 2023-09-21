package com.companhiaaerea.app.models;
public class CompanhiaAerea {

    private MeioTransporte transporte;
    private Cliente clientes;
    private Reserva reservas;

    public MeioTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(MeioTransporte transporte) {
        this.transporte = transporte;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Reserva getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reservas) {
        this.reservas = reservas;
    }
}