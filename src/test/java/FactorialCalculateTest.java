import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactorialCalculateTest {

    @Test
    void resultOfFactorialCalculationShouldBeCorrect(){
        //given
        int factorialBase = 5;
        int result = 120;

        //when
        //then
        assertEquals(FactorialCalculation.factorial(factorialBase),result);

    }


}
