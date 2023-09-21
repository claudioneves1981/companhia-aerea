package com.companhiaaerea.app.models;

public class Helicoptero extends MeioTransporte {

    private String tipoVoo;

    public String getTipoVoo() {
        return tipoVoo;
    }

    public void setTipoVoo(String tipoVoo) {
        this.tipoVoo = tipoVoo;
    }

    @Override
    public void setAutonomia(double autonomia) {
        super.setAutonomia(400);
    }
}
