package com.myProject;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
@Listeners({MyTestListenerAdapter.class})
public class AppTest {
    @Test(retryAnalyzer=MyRetryAnalyzer.class)
    public void testSum(){
        MyClass c = new MyClass();
        Assert.assertEquals(c.sum(2, 3), 5);
    }
}
