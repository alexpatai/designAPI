package com.patai.designapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplementaryColorTests {

    @Test
    public void test_getComplementaryColor(){
        ComplementaryColor c = new ComplementaryColor();

        Assertions.assertEquals("red", c.getComplementaryColor("green"));

        Assertions.assertEquals("green", c.getComplementaryColor("red"));

        Assertions.assertEquals("yellow", c.getComplementaryColor("purple"));

        Assertions.assertEquals("purple", c.getComplementaryColor("yellow"));

        Assertions.assertEquals("blue", c.getComplementaryColor("orange"));

        Assertions.assertEquals("orange", c.getComplementaryColor("blue"));

    }
}
