package Calculator;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String ... args) {
        Calculator calc = new Calculator();
        System.out.println(calc.calculate("*", 5, 5));
        foo foo = new foo() {
            @Override
            public double plus(int a, int b) {
                return 0;
            }

            @Override
            public double minus(int a, int b) {
                return 0;
            }
        };
    }
}

class Calculator{
    Map<String, calculable> map = new HashMap<>();

    public Calculator() {
        fill();
    }

    private void fill(){
        map.put("+", new Addition());
        map.put("-", (b) -> b[0] - b[1]);
        map.put("*", (b) -> b[0] * b[1]);
        calculable calculable = args -> args[0] / args[1];
        //calculable calculable = (op, b) -> map.get(op).calculate(op, b[0], b[1]);
        /*calculable calculable = new calculable() {
            @Override
            public double calculate(String op, double... args) {
                return 0;
            }
        };*/
    }
    public double add(int a, int b){
        return a + b;
    }
    public double subsrct(int a, int b){
        return a - b;
    }
    public double multi(int a, int b){
        return a * b;
    }
    public double calculate(String op, int a, int b){
        return map.get(op).calculate(a, b);
    }
}

class Addition implements calculable{

    @Override
    public double calculate(double ... args) {
        if (args.length < 2) throw new RuntimeException("Не получится братан :(");
        return args[0] + args[1];
    }
}

interface calculable{
    double calculate(double ... args);
}

interface foo{
    double plus(int a, int b);
    double minus(int a, int b);
}