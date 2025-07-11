package es;

import org.junit.jupiter.api.Test;

import es.cic.curso25.Camion;
import es.cic.curso25.Coche;
import es.cic.curso25.GruaDelPuerto;
import es.cic.curso25.Vehiculo;

public class PreubasTest {

    @Test
    void lanzame() {

        Camion camion = new Camion();
        GruaDelPuerto gruaDelPuerto = new GruaDelPuerto();

    }
    @Test
    public void acelerarRemotamente(Vehiculo vehiculo, int Incremento) {
        vehiculo.acelerar(Incremento);
    }

}
