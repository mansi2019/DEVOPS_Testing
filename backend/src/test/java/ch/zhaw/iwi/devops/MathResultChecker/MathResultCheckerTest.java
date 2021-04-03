package ch.zhaw.iwi.devops.MathResultChecker;

import org.junit.Assert;
import org.junit.Test;

public class MathResultCheckerTest {
    
    @Test
    public void testMathResultCheck(){
        MathResult mth = new MathResult();
        Assert.assertEquals(true, mth.resultCheck(5,30));
    }
}
