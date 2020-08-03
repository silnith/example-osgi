package org.silnith.example.osgi.thing.impl.a;

import org.osgi.service.component.annotations.Component;
import org.silnith.example.osgi.thing.Thing;

/**
 * Implementation of Thing API using A.
 */
@Component
public class ThingImpl implements Thing {

    @Override
    public Object doThing(final String input) {
        return "Thing of type A";
    }

}
