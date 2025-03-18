package com.exemple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    public void testMessage() {
        String message = getMessage();
        assertEquals("Hello World!", message);
    }

    // Exemple d'une méthode testée, qui pourrait être une méthode de votre application
    public String getMessage() {
        return "Hello World!";
    }
}
