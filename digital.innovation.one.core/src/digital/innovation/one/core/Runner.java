package digital.innovation.one.core;

import digital.innovation.one.utils.operacao.Calculadora;
public class Runner {
    public static void main(String arg[]){
        Calculadora calc = new Calculadora();
        System.out.println(calc.sum(5,3));
        System.out.println(calc.sub(5,3));
        System.out.println(calc.multi(5,3));
        System.out.println(calc.div(5,3));
    }
}
