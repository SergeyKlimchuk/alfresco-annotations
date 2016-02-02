package it.cosenonjaviste.alfresco.annotations;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import org.alfresco.repo.policy.Behaviour.NotificationFrequency;

/**
 * Stereotype annotation for defining a new behaviour.
 *
 * Annotated class should extends one child of {@link org.alfresco.repo.policy.ClassPolicy}
 *
 * <p>
 * NB: since Alfresco 5.0, <code>Behaviour</code> and <code>BehaviourBean</code> are present
 * </p>
 *
 * @author Andrea Como
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@DependsOn({"policyComponent", "NamespaceService"})
public @interface Behaviour {

    /**
     * Bean name
     *
     * @return bean name
     */
    String value();

    /**
     * Must be a QName in <code>prefix:localName</code> or <code>{namespaceURI}localName</code> format
     *
     * @return QName as string
     */
    String type();

    /**
     * Defines when trigger this behaviour. Default is {@link NotificationFrequency#TRANSACTION_COMMIT}
     *
     * @see NotificationFrequency
     *
     * @return notification frequency
     */
    NotificationFrequency frequency() default NotificationFrequency.TRANSACTION_COMMIT;

}
