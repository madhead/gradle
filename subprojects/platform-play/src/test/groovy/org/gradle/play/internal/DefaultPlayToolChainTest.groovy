/*
 * Copyright 2014 the original author or authors.
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

package org.gradle.play.internal

import org.gradle.internal.jvm.Jvm
import spock.lang.Specification

class DefaultPlayToolChainTest extends Specification {
    DefaultPlayToolChain toolChain = new DefaultPlayToolChain("2.3.5", "2.11.1")

    def "provides meaningful name"() {
        expect:
        toolChain.getName() == "PlayFramework2.3.5"
    }

    def "provides meaningful displayname"() {
        def javaVersion = Jvm.current().javaVersion
        expect:
        toolChain.getDisplayName() == "Play Framework 2.3.5 / Scala 2.11.1 / JDK ${javaVersion.majorVersion} ($javaVersion)"
    }
}
