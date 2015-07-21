package com.massfords.maven.spel;

import javax.annotation.Generated;
import java.lang.annotation.Annotation;

/**
 * Models the configuration of an annotation that we want to validate.
 * Each annotation includes the fully qualified name of the annotation and the
 * attribute that holds the spring expression.
 *
 * @author markford
 */
public class SpelAnnotation {

    /**
     * The fully qualified name of the annotation that we're scanning for
     */
    private String name;

    /**
     * The name of the attribute on the annotation that contains the spring
     * expression.
     */
    private String attribute = "value";

    /**
     * Cached instance of the Annotation class.
     */
    private Class<? extends Annotation> clazz;

    @Generated("generated by IDE")
    public String getName() {
        return name;
    }

    @Generated("generated by IDE")
    public SpelAnnotation setName(String name) {
        this.name = name;
        return this;
    }

    @Generated("generated by IDE")
    public String getAttribute() {
        return attribute;
    }

    @Generated("generated by IDE")
    public SpelAnnotation setAttribute(String attribute) {
        this.attribute = attribute;
        return this;
    }

    @Generated("generated by IDE")
    public Class<? extends Annotation> getClazz() {
        return clazz;
    }

    @Generated("generated by IDE")
    public void setClazz(Class<? extends Annotation> clazz) {
        this.clazz = clazz;
    }
}
