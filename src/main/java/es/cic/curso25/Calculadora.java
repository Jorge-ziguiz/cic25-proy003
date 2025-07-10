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

        // en caso de no usar un bloque try catch throw new ArithmeticException ("no es valido la division por 0"); si no en un if 
        try {

            total = total /valor;
            
        } catch (ArithmeticException e) {
           
        }
    }
}
