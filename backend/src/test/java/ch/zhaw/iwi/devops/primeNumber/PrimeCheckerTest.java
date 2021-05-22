package ch.zhaw.iwi.devops.primeNumber;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class PrimeCheckerTest {

    @Test
    public void PrimeChecker1() {

        PrimeChecker primeChecker = new PrimeChecker();
        Assert.assertEquals(false, primeChecker.checker(1));

    }
    @Test
    public void PrimeChecker3() {

        PrimeChecker primeChecker = new PrimeChecker();
        Assert.assertEquals(true, primeChecker.checker(3));
    }

    @Test
    public void PrimeCheckerRandom() {

        PrimeChecker primeChecker = new PrimeChecker();
        int random_int = (int)Math.floor(Math.random()*2);  //jede Zahl multipliziert mit 2 sollte keine Primzahl ergeben
        Assert.assertEquals(false, primeChecker.checker(random_int));
    }
    
}
