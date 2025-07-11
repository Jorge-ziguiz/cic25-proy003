package es.cic.curso25;

public class Vehiculo {

    protected Calculadora calculadora;

    protected int Velocidad = 0;

    protected static final double COMSUMO_INSTANTANEO = 4.3d;

    public Vehiculo() {

        this.calculadora = new Calculadora();
    }

    public int acelerar(int IncrementarVelocidad) {
        this.calculadora.reiniciarTotal();
        this.calculadora.sumar(IncrementarVelocidad);
        this.calculadora.sumar(Velocidad);
        this.Velocidad = (int) Math.round(this.calculadora.getTotal());
        return this.Velocidad;
    }

    public int frenar(int DecrementarVelocidad) {
        this.calculadora.reiniciarTotal();
        this.calculadora.sumar(Velocidad);
        this.calculadora.restar((double) DecrementarVelocidad);
        this.Velocidad = (int) Math.round(this.calculadora.getTotal());
        return this.Velocidad;
    }

    protected double getConsumo() {
        this.calculadora.reiniciarTotal();
        this.calculadora.sumar(this.Velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(COMSUMO_INSTANTANEO);
        double ConsumoTotal = this.calculadora.getTotal();
        return ConsumoTotal;

    }

    protected int getVelocidad() {
        return this.Velocidad;
    }

}
