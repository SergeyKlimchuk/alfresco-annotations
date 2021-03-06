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

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Stereotype annotation for defining a new action.
 *
 * Annotated class must extends {@link org.alfresco.repo.jscript.BaseScopableProcessorExtension}
 *
 * @author Andrea Como
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@ChildOf("baseJavaScriptExtension")
@DependsOn("javaScriptProcessor")
public @interface JsExtension {

    /**
     * Bean name and extension name
     *
     * @return bean name and extension name
     */
    String value();

}
