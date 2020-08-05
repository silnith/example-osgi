package org.silnith.example.osgi.thing.impl.declarative;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.log.Logger;
import org.osgi.service.log.LoggerFactory;
import org.silnith.example.osgi.thing.Thing;


/**
 * Implementation of {@link Thing} using Declarative Services.
 */
@Component(scope = ServiceScope.SINGLETON)
public class ThingImpl implements Thing {

    private final Logger logger;

    /**
     * Creates a new {@link Thing} implementation.
     * 
     * @param logger a logger
     */
    @Activate
    public ThingImpl(@Reference(service = LoggerFactory.class, cardinality = ReferenceCardinality.MANDATORY) final Logger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public Object doThing(final String input) {
        logger.trace("Entering doThing({})", input);
        
        final String result = "Declarative Services Thing";
        
        logger.trace("Returning {} from doThing({})", result, input);
        return result;
    }

}
