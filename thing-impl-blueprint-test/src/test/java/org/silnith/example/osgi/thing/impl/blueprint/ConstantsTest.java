package org.silnith.example.osgi.thing.impl.blueprint;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * Tests that the constants in {@link Constants} are correct.
 * 
 * <p>This is in case the class is refactored but somebody forgets to update the constant.
 */
public class ConstantsTest {
    
    /**
     * Tests that {@link Constants#thingImplClassName} matches the name of {@link ThingImpl}.
     */
    @Test
    public void testClassName() {
        assertEquals(ThingImpl.class.getName(), Constants.thingImplClassName);
    }
    
}
