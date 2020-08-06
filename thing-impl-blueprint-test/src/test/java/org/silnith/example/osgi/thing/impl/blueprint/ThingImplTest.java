package org.silnith.example.osgi.thing.impl.blueprint;

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
import org.silnith.example.osgi.thing.Thing;

@RunWith(PaxExam.class)
@ExamReactorStrategy(PerMethod.class)
public class ThingImplTest {
    
    @Inject
    public Thing thing;
    
    @Configuration
    public Option[] configuration() {
        return options(
                junitBundles(),
                mavenBundle("org.apache.aries", "org.apache.aries.util"),
                mavenBundle("org.apache.aries.blueprint", "org.apache.aries.blueprint"),
                mavenBundle("org.apache.aries.proxy", "org.apache.aries.proxy"),
                mavenBundle("org.apache.felix", "org.apache.felix.log"),
                mavenBundle("org.apache.felix", "org.apache.felix.scr"),
                mavenBundle("org.osgi", "org.osgi.service.cm"),
                mavenBundle("org.osgi", "org.osgi.service.log"),
                mavenBundle("org.osgi", "org.osgi.util.function"),
                mavenBundle("org.osgi", "org.osgi.util.promise"),
                mavenBundle("org.osgi", "org.osgi.util.pushstream"),
                mavenBundle("org.silnith", "thing-api"),
                mavenBundle("org.silnith", "thing-impl-blueprint"),
                cleanCaches(true));
    }
    
    @Test
    public void testThingExists() {
        assertNotNull(thing);
    }
    
    @Test
    public void testThingIsBlueprintImplementation() {
        final Object aThing = thing.doThing("input");
        
        assertEquals("Blueprint Thing", aThing);
    }

}
