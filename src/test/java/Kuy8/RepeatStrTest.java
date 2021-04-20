package Kuy8;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatStrTest {

    @Test
    public void test4a() {
        assertEquals("aaaa", RepeatStr.repeatStr(4, "a"));
    }
    @Test public void test3Hello() {
        assertEquals("HelloHelloHello", RepeatStr.repeatStr(3, "Hello"));
    }
    @Test public void test5empty() {
        assertEquals("", RepeatStr.repeatStr(5, ""));
    }
    @Test public void test0kata() {
        assertEquals("", RepeatStr.repeatStr(0, "kata"));
    }
}
