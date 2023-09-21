package com.companhiaaerea.app.models;

public class Reserva {
    private MeioTransporte transporte;
    private Cliente cliente;
    private int dataViagem;
    private String origemViagem;
    private String destinoViagem;

    public MeioTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(MeioTransporte transporte) {
        this.transporte = transporte;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDataViagem() {
        return dataViagem;
    }

    public void setDataViagem(int dataViagem) {
        this.dataViagem = dataViagem;
    }

    public String getOrigemViagem() {
        return origemViagem;
    }

    public void setOrigemViagem(String origemViagem) {
        this.origemViagem = origemViagem;
    }

    public String getDestinoViagem() {
        return destinoViagem;
    }

    public void setDestinoViagem(String destinoViagem) {
        this.destinoViagem = destinoViagem;
    }

}
