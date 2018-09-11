## Kotlin Lambdas as Spring Cloud Functions
This simple demo demonstrates the capabilities of [Spring Cloud Function](https://cloud.spring.io/spring-cloud-function/) 
to recognize Kotlin lambdas that _effectively_ match to one of Java's `Supplier`, `Function` or `Consumer`.

That is:
```$kotlin
@Bean
open fun kotlinFunction(): (String) -> String {
    return  { it.toUpperCase() }
}

@Bean
open fun kotlinConsumer(): (String) -> Unit {
    return  { println(it) }
}

@Bean
open fun kotlinSupplier(): () -> String {
    return  { "Hello" }
}

```

### Build/Run
For quick start this demo uses Web support provided with Spring Cloud Function - that is the ability to delegate/map 

Run `KotlinApplication` . . .

and then access the following URL: `http://localhost:8080/kotlinFunction/foo` and you should see upper-cased `FOO` as 
your response.

Enjoy!
