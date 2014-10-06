package Concordion;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ConcordionTestBase {

    public ConcordionData runTest(String fullName) {

        ConcordionData result = new ConcordionData();
        result.splitName(fullName);

        return result;
    }
}
