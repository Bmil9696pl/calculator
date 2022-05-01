import shuntingYard.shuntingYard;
import calculate.calculate;

public class Main {
    public static void main(String[] args) {
        String string = shuntingYard.infixToRpn("(8+(2.5+3.7)*3)-7");
        System.out.println(string);
        System.out.println(calculate.calculate(string));
    }
}
