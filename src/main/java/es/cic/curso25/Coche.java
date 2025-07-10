package es.cic.curso25;

public class Coche {

    private int Velocidad = 0;
    public static final double COMSUMO_INSTANTANEO = 4.3d;

    public int frenar(int DecrementarVelocidad) {
        this.Velocidad -= DecrementarVelocidad;
        return DecrementarVelocidad;
    }

    public int acelerar(int IncrementarVelocidad) {
        this.Velocidad += IncrementarVelocidad;
        return this.Velocidad;
    }

    public double getConsumo() {
        double ConsumoTotal = this.Velocidad / 100.0 * COMSUMO_INSTANTANEO;
        return ConsumoTotal;

    }

    public int getVelocidad() {
        return this.Velocidad;
    }

}
