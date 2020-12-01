import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void Check() {
        String result = FizzBuzzTranslate.main( 23);
        String expect = "Fizz";
        assertEquals( result, expect);
    }
}