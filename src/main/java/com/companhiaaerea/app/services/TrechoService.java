package com.companhiaaerea.app.services;


import com.companhiaaerea.app.models.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TrechoService {

    public boolean validarTrecho(String origem, String destino) {
        // aqui vc faz o calculo pode ser que vc precisa usar alguma api para pagar a localização de origem e destino
        // extrair os valores e fazer o calculo da distancia. Mas segue um exemplo de possivel implementação.
        double distancia = 0.0;
        if(Objects.equals(origem, "São Paulo") && Objects.equals(destino, "Rio de Janeiro")){
            distancia = 400.0;
        }

        if(distancia >= 400){
            MeioTransporte aviao = new Aviao();
            return true;
        }else{
            MeioTransporte helicoptero = new Helicoptero();
            return true;
        }
    }

    public void registrarTrecho(boolean isReservaPaga) {
       // provavelmente será dessa forma que vc fara o registro na classe anac.
        ANAC anac = new ANAC();
        Reserva reserva = new Reserva();
        if(isReservaPaga){
            anac.setTrecho(validarTrecho(reserva.getOrigemViagem(), reserva.getDestinoViagem()));
        }
        //com o parametro retornando verdadeiro,  pegar o getOrigem e o getDestino, calular o trecho e settar com o setTrecho da classe ANAC
    }
}
