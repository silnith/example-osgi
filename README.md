# OSGi Examples

An example of using OSGi to do neat stuff.

This contains several example OSGi bundles built using Maven and tested in
Apache Felix.

## Building

```sh
mvn clean install verify site
```

For your normal debug cycle, you can omit `site`.  Only `install` and `verify`
are required, in that order.

## Techniques

* Building in Maven.
* Testing
    * unit testing
    * OSGi interface testing
    * OSGi implementation testing
    * OSGi encapsulation testing

The testing of the OSGi functionality uses Pax Exam, which is the primary tool
available for testing OSGi bundles.
