package com.juliana.unit.test.maven;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathServiceTest {
    MathService mathService;

    @Before
    public void setup(){
        mathService = new MathService(); //create an obj of mathService before every &Test
    }

    @Test
    public void doubleNum(){
        Assert.assertEquals(8, mathService.doubleNum(4)); //this should fail as 4+4 = 8
        Assert.assertEquals(-6, mathService.doubleNum(-3)); //this should fail as 4+4 = 8
    }

    @Test(expected = IllegalArgumentException.class) //par deals with negative test case for factorial()
    public void factorial(){
        Assert.assertEquals(720,mathService.factorial(6));
        Assert.assertEquals(1,mathService.factorial(0));
        mathService.factorial(-3);
    }





}
