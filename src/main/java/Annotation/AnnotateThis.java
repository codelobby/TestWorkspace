package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by ben_lai58 on 30/09/2014.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AnnotateThis {
    public enum AnnotationEnum{
        LOW, MEDIUM, HIGH
    }

    AnnotationEnum enumValue();


}
