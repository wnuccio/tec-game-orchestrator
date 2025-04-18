package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    @Test
    void testMain() {
        // Call the main method of the Main class
        Main main = new Main();

        assertNotNull(main);
    }
}