package org.silnith.example.osgi.thing.impl.cdi;

import javax.inject.Inject;

import org.osgi.service.cdi.ServiceScope;
import org.osgi.service.cdi.annotations.Bean;
import org.osgi.service.cdi.annotations.Service;
import org.osgi.service.cdi.annotations.ServiceInstance;
import org.osgi.service.log.Logger;
import org.silnith.example.osgi.thing.Thing;

/**
 * Implementation of {@link Thing} using CDI.
 */
@Bean
@Service({Thing.class,})
@ServiceInstance(ServiceScope.SINGLETON)
public class ThingImpl implements Thing {

    private final Logger logger;

    /**
     * Creates a new {@link Thing} implementation.
     * 
     * @param logger a logger
     */
    @Inject
    public ThingImpl(final Logger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public Object doThing(final String input) {
        logger.trace("Entering doThing({})", input);
        
        final String result = "CDI Thing";
        
        logger.trace("Returning {} from doThing({})", result, input);
        return result;
    }

}
