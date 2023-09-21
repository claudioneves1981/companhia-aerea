package com.companhiaaerea.app.models;

public class Aviao extends MeioTransporte {

    private float capacidadeCarga;

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void setAutonomia(double autonomia) {
        super.setAutonomia(1000);
    }
}