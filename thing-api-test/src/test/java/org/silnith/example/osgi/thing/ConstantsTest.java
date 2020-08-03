package org.silnith.example.osgi.thing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests that the constants in {@link Constants} are correct.
 * 
 * <p>This is in case the class is refactored but somebody forgets to update the constant.
 */
public class ConstantsTest {
    
    /**
     * Tests that {@link Constants#thingClassName} matches the name of {@link Thing}.
     */
    @Test
    public void testClassName() {
        assertEquals(Thing.class.getName(), Constants.thingClassName);
    }
    
}
