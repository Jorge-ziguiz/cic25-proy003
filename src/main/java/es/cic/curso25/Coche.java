package es.cic.curso25;

public class Coche {

    private int Velocidad = 0;
    public static final double COMSUMO_INSTANTANEO = 4.3d;
    private Calculadora calculadora;

    public Coche() {
        this.calculadora = new Calculadora();
    }

    public int frenar(int DecrementarVelocidad) {
        this.calculadora.reiniciarTotal();
        this.calculadora.sumar(this.Velocidad);
        this.calculadora.restar( DecrementarVelocidad);
        this.Velocidad = (int) Math.round(this.calculadora.getTotal());
        return this.Velocidad;
    }

    public int acelerar(int IncrementarVelocidad) {
        this.calculadora.reiniciarTotal();
        this.calculadora.sumar(IncrementarVelocidad);
        this.calculadora.sumar(Velocidad);
        this.Velocidad = (int) Math.round(this.calculadora.getTotal());
        return this.Velocidad;
    }

    public double getConsumo() {
        this.calculadora.reiniciarTotal();
        this.calculadora.sumar(this.Velocidad);
        this.calculadora.dividir(100);
        this.calculadora.multiplicar(COMSUMO_INSTANTANEO);
        double ConsumoTotal = this.calculadora.getTotal();
        return ConsumoTotal;

    }

    public int getVelocidad() {
        return this.Velocidad;
    }

}
