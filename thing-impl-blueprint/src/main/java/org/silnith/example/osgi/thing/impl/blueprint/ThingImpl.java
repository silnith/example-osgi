package org.silnith.example.osgi.thing.impl.blueprint;

import org.osgi.service.log.Logger;
import org.silnith.example.osgi.thing.Thing;


/**
 * Implementation of {@link Thing} using Blueprint.
 */
public class ThingImpl implements Thing {

    private final Logger logger;

    /**
     * Creates a new {@link Thing} implementation.
     * 
     * @param logger a logger
     */
    public ThingImpl(final Logger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public Object doThing(final String input) {
        logger.trace("Entering doThing({})", input);
        
        final String result = "Blueprint Thing";
        
        logger.trace("Returning {} from doThing({})", result, input);
        return result;
    }

}
