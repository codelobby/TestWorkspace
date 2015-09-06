package DebuggingWorkshop;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DebuggingTest {

    @Test
    public void shouldAddTwoNumbers() {

        int numberOne = 1;
        int numberTwo = 2;
        int expectedResult = 3;

        Calculator calculator = new Calculator();
        int actualResult = calculator.add(numberOne, numberTwo);
        assertEquals(expectedResult, actualResult);

        System.out.println("We have reached the end of the test");
    }
}
