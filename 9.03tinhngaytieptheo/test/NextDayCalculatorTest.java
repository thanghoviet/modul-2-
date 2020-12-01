import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void getNextDay() {
        String result = NextDayCalculator.getNextDay(1, 2, 2020);
        String expect = "2/2/2020";
        assertEquals(result, expect);
    }

    @org.junit.jupiter.api.Test
    void getNextDay2() {
        String result = NextDayCalculator.getNextDay(31, 12, 2019);
        String expect = "1/1/2020";
        assertEquals(result, expect);
    }
}