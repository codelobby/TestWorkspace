package RegExTest;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

public class RegExTest {

    @Test
    public void shouldDoSomething() throws IOException {
        String string = IOUtils.toString(this.getClass().getClassLoader().getResource("CmsTemplate.txt"), "UTF-8");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        System.out.println(stringBuilder.toString().replaceAll("\\\\\\\\\\\\\\\\\\\\\\\\", "bull").replaceAll("\\\\\"","bull"));
    }
}
