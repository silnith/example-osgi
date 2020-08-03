package org.silnith.example.osgi.thing;

import static org.junit.Assert.*;
import static org.ops4j.pax.exam.CoreOptions.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerMethod;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerMethod.class)
public class ThingImplATest {
    
    @Inject
    public Thing thing;
    
    @Configuration
    public Option[] configuration() {
        return options(
                junitBundles(),
                mavenBundle("org.silnith", "thing-api", "0.0.1-SNAPSHOT"),
                mavenBundle("org.silnith", "thing-impl-a", "0.0.1-SNAPSHOT"),
                cleanCaches(true)
                );
    }
    
    @Test
    public void testThingExists() {
        assertNotNull(thing);
    }
    
    @Test
    public void testThingIsImplementationA() {
        final Object aThing = thing.doThing("input");
        
        assertEquals("Thing of type B", aThing);
    }

}
