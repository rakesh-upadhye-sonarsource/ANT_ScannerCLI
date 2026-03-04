package com.example;

import com.example.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAddition() {
        assertEquals("Simple math should work", 4, 2 + 2);
    }

    @Test
    public void testMultiplication() {
        new Main().multiply(2,4);;
    }

    @Test
    public void helloWorld() {
        new Main().helloWorld();
    }

}
