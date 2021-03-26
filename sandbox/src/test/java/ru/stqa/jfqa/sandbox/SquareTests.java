package ru.stqa.jfqa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea() {
        Square s = new Square(5.0);
        Assert.assertEquals(s.area(),24.0);
    }
}
