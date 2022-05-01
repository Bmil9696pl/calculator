import org.junit.jupiter.api.*;
import shuntingYard.shuntingYard;
import calculate.calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {
    @Test
    public void testCalculate(){
        assertEquals(19.6, calculate.calculate(shuntingYard.infixToRpn("(8+(2.5+3.7)*3)-7")));
        assertEquals(122.79, calculate.calculate(shuntingYard.infixToRpn("(5.23*23)+10/4")));
        assertEquals(6.4, calculate.calculate(shuntingYard.infixToRpn("4.2/0.5-2")));
        assertEquals(90, calculate.calculate(shuntingYard.infixToRpn("(4+6)*3*3")));
        assertEquals(59.8, calculate.calculate(shuntingYard.infixToRpn("(3/5+7)*8-1")));
    }
}
