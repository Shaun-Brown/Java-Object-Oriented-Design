package lib;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModuloCounterTest {

    @Test
    public void testDefaultConstructor() {
        ModuloCounter modulo = new ModuloCounter();

        assertEquals("The modulo counter should be initialised at 0", 0, modulo.getCount());
    }

    @Test
    public void testCustomConstructor() {
        ModuloCounter modulo = new ModuloCounter(7);

        assertEquals("The Modulo counter should return the value assigned, and loop round after 4", 2, modulo.getCount());
    }

//    @Test
//    public void testCustomConstructorNegative() {
//        ModuloCounter modulo = new ModuloCounter(-3);
//
//        assertEquals("The Modulo counter should never return a negative integer", 2, modulo.getCount());
//    }

    @Test
    public void testCustomConstructorHigher() {
        ModuloCounter modulo = new ModuloCounter(8);

        assertEquals("The Modulo counter should never return a higher value than 4", 3, modulo.getCount());
    }

    @Test
    public void testSetAndGetCounter() {
        ModuloCounter modulo = new ModuloCounter();
        modulo.setCount(4);

        assertEquals("Set and get the modulo counter within the range 0 - 4", 4, modulo.getCount());
    }

    @Test
    public void testIncrement() {
        ModuloCounter modulo = new ModuloCounter(0);
        modulo.increment();

        assertEquals("The Modulo counter should decrement by 1", 1, modulo.getCount());
    }

//    @Test
//    public void testDecrement() {
//        ModuloCounter modulo = new ModuloCounter(0);
//        modulo.decrement();
//
//        assertEquals("The Modulo counter should increment by 1", 4, modulo.getCount());
//    }

    @Test
    public void testCycle() {
        ModuloCounter modulo = new ModuloCounter();
        modulo.increment();
        modulo.increment();
        modulo.increment();
        modulo.increment();
        modulo.increment();

        assertEquals("The Modulo cycles should increment each time the counter makes a full loop", 1, modulo.getCycles());
    }

    @Test
    public void testToString() {
        ModuloCounter modulo = new ModuloCounter(0);
        String toStr = modulo.toString();

        assertTrue("The toString method should be in the standard conventional format",
                toStr.startsWith("ModuloCounter:") && toStr.endsWith(modulo.getCount() + "]"));
    }

}
