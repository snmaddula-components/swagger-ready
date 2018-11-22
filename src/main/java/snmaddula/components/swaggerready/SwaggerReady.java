package snmaddula.components.swaggerready;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Enabler annotation to make the application swagger ready.
 * 
 * @author snmaddula
 *
 */
@Configuration
@Import(SwaggerContext.class)
public @interface SwaggerReady {

}
