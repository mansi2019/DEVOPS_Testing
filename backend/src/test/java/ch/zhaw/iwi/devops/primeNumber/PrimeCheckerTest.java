package ch.zhaw.iwi.devops.primeNumber;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void PrimeChecker1() {

        PrimeChecker primeChecker = new PrimeChecker();
        Assert.assertEquals(false, primeChecker.checker(1));

    }
}
