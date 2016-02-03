/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.cosenonjaviste.alfresco.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to reference an xml-declared value.
 * <p>
 * Behaves like bean-value attribute. All properties are inherited.
 * <p>
 * To enable the corresponding ChildOfConfigurer, add it to your spring configuration. For Example like this:
 * <p>
 * <code>
 * &lt;bean class="it.omniagroup.ecm.internal.utils.ChildOfConfigurer"/&gt;
 * </code>
 *
 * @author Jan Esser
 * @editor Andrea Como
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ChildOf {

    /**
     * Parent bean name
     *
     * @return parent bean name
     */
    String value();
}
