
package com.academix;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitivesTest {
    @Test
    public void testMain() {
        try {
            String[] args = {};
            Primitives.main(args);
        } catch (Exception e) {
            fail("Primitives.main() threw an exception: " + e.getMessage());
        }
    }
}