package com.companhiaaerea.app.models;

public class Cliente {
    private String nome;
    private int cpf;
    private int dataNasc;
    private Endereco endereco;
    private int fone;
    private String email;
    private Reserva reservaCliente;
    private boolean reservaEfetuada;
    private boolean reservaPaga;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Reserva getReservaCliente() {
        return reservaCliente;
    }

    public void setReservaCliente(Reserva reservaCliente) {
        this.reservaCliente = reservaCliente;
    }

    public boolean isReservaEfetuada() {
        return reservaEfetuada;
    }

    public void setReservaEfetuada(boolean reservaEfetuada) {
        this.reservaEfetuada = reservaEfetuada;
    }

    public boolean isReservaPaga() {
        return reservaPaga;
    }

    public void setReservaPaga(boolean reservaPaga) {
        this.reservaPaga = reservaPaga;
    }

    public void pagarReserva() {
        setReservaPaga(true);
    }

    public void efetuarReserva() {
        setReservaEfetuada(true);
    }
}