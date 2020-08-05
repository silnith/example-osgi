package org.silnith.example.osgi.thing.impl.declarative;

import static org.junit.Assert.*;
import static org.ops4j.pax.exam.CoreOptions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ops4j.pax.exam.Configuration;
import org.ops4j.pax.exam.Option;
import org.ops4j.pax.exam.junit.PaxExam;
import org.ops4j.pax.exam.spi.reactors.ExamReactorStrategy;
import org.ops4j.pax.exam.spi.reactors.PerMethod;

/**
 * A test that starts up an OSGi container and loads the API bundle, then runs the tests inside of the container.
 */
@RunWith(PaxExam.class)
@ExamReactorStrategy(PerMethod.class)
public class ResolutionTest {
    
    /**
     * Configuration required by the {@link PaxExam} runner.
     * 
     * @return configuration for the OSGi container
     */
    @Configuration
    public Option[] configuration() {
        return options(
                junitBundles(),
                mavenBundle("org.apache.felix", "org.apache.felix.log"),
                mavenBundle("org.apache.felix", "org.apache.felix.scr"),
                mavenBundle("org.osgi", "org.osgi.service.log"),
                mavenBundle("org.osgi", "org.osgi.util.function"),
                mavenBundle("org.osgi", "org.osgi.util.promise"),
                mavenBundle("org.osgi", "org.osgi.util.pushstream"),
                mavenBundle("org.silnith", "thing-api"),
                mavenBundle("org.silnith", "thing-impl-declarative-services"),
                cleanCaches(true));
    }
    
    /**
     * Tests that the {@link org.silnith.example.osgi.thing.impl.declarative.ThingImpl} class
     * does <em>not</em> resolve inside of an OSGi container.
     * 
     * @throws ClassNotFoundException if the test passed
     */
    @Test(expected = ClassNotFoundException.class)
    public void testExists() throws ClassNotFoundException {
        @SuppressWarnings("unused")
        final Class<?> clazz = Class.forName(Constants.thingImplClassName);
        
        fail();
    }
    
}
