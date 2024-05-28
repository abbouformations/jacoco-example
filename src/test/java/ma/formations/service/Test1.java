package ma.formations.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @Test
    public void testNameNotEmpty() {
        ServiceImpl obj = new ServiceImpl();
        assertEquals("Hello ABBOU", obj.getMessage("ABBOU"));
    }
}


