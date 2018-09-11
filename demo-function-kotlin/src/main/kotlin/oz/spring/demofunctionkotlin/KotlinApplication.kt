/*
 * Copyright 2018 the original author or authors.
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

package oz.spring.demofunctionkotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.function.context.FunctionCatalog
import org.springframework.cloud.function.core.FluxConsumer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import java.util.function.Consumer

/**
 * @author Oleg Zhurakousky
 */
@SpringBootApplication
open class KotlinApplication {
    @Bean
    open fun kotlinFunction(): (String) -> String {
        return { it.toUpperCase() }
    }
}
fun main(args: Array<String>) {
    SpringApplication.run(KotlinApplication::class.java, *args)
}


