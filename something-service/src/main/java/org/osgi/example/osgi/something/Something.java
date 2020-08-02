package org.osgi.example.osgi.something;

import javax.json.bind.annotation.JsonbProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Some thing.
 */
@XmlRootElement(name = "something")
public class Something {
    
    /**
     * The identifier for this something.
     */
    @JsonbProperty("id")
    @XmlElement(name = "id")
    @NotNull
    @Size(min = 1)
    public String identifier;

}
