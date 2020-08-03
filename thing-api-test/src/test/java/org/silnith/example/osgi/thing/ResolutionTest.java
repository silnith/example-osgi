package org.silnith.example.osgi.thing;

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
                mavenBundle("org.silnith", "thing-api", "0.0.1-SNAPSHOT"),
                cleanCaches(true));
    }
    
    /**
     * Tests that the {@link org.silnith.example.osgi.thing.Thing} interface
     * resolves properly inside of an OSGi container.
     * 
     * @throws ClassNotFoundException if the test failed
     */
    @Test
    public void testExists() throws ClassNotFoundException {
        final Class<?> clazz = Class.forName(Constants.thingClassName);
        
        assertNotNull(clazz);
    }
    
}
