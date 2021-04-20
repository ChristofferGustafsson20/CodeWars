package Kuy8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class WillWeMakeItTest {


        @Test
        public void testSomething() {
            assertTrue(WillWeMakeIt.zeroFuel(50, 25, 2));
            assertFalse(WillWeMakeIt.zeroFuel(100, 50, 1));


    }
}
