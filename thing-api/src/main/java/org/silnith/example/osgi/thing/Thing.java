package org.silnith.example.osgi.thing;

import org.osgi.annotation.versioning.ProviderType;

/**
 * A service that does a thing.
 */
@ProviderType
public interface Thing {
    
    /**
     * Do a thing.
     * 
     * @param input input to the thing
     * @return a thing
     */
    Object doThing(String input);
    
}
