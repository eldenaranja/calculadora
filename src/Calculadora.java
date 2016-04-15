/**
 * Víctor García Aldariz & Sergio Ceán
 * @author dam125 & dam127
 */
public class Calculadora {
    public double suma(double x, double y){
        return x+y;
    }
    public double resta(double x,double y){
        return x-y;
    }
    public double multiplicacion(double x,double y){
        return x*y;
    }
    public double division(double x,double y){
        return x/y;
    }
    public double potencia(double x,double y){
        return Math.pow(x, y);
    }
    public double raiz(double x,double y){
        return Math.pow(x,1/y);
    }
    public double logaritmo10(double x){
        return Math.log10(x);
    }
}