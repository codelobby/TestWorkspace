package EnumsTest;

import org.junit.Test;
import Enums.Enum;

import static org.junit.Assert.assertEquals;

public class EnumTest {

    @Test
    public void shouldEqualBenEnumAge() {

        int benAge = Enum.BEN.getAge();
        int expectedValue = 23;

        assertEquals(expectedValue, benAge);

    }

    @Test
    public void shouldEqualBenEnumDesc() {

        String benDesc = Enum.BEN.getDesc();
        String expectedValue = "Good-Looking";

        assertEquals(expectedValue, benDesc);

    }
}
