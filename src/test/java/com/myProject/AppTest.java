package com.myProject;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testSum(){
        MyClass c = new MyClass();
        Assert.assertEquals(c.sum(2, 3), 5);
    }
}
