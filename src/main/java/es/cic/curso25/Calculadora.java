package es.cic.curso25;

public class Calculadora extends Object {
    private double total;

    public double getTotal() {
        return total;
    }

    public void reiniciarTotal(){
        total =0;
    }

    public void sumar(double valor) {
        total = total + valor;
    }

    public void restar(double valor) {
        total = total - valor;
    }

     public void multiplicar(double valor) {
        total = total * valor;
    }

    public void dividir(double valor) {
        try {
            total = total /valor;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
