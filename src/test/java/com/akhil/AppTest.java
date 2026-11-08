package com.akhil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void greetReturnsExpectedMessage() {
        App app = new App();
        assertEquals("Hello, Akhil!", app.greet("Akhil"));
    }
}
