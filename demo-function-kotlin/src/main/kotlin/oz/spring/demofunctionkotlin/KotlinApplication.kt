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


