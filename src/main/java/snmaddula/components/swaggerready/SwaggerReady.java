package snmaddula.components.swaggerready;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import org.springframework.context.annotation.Import;

/**
 * Enabler annotation to make the application swagger ready.
 * 
 * @author snmaddula
 *
 */
@Retention(RUNTIME)
@Import(SwaggerContext.class)
public @interface SwaggerReady {

}
