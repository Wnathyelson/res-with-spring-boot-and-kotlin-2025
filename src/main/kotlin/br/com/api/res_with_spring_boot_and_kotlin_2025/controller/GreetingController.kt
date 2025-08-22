package br.com.api.res_with_spring_boot_and_kotlin_2025.controller

import br.com.api.res_with_spring_boot_and_kotlin_2025.entity.GreetingEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam("name", defaultValue = "Kotlin") name: String?): GreetingEntity {
        return GreetingEntity(
            counter.incrementAndGet(),
            "Hello, $name!"
        )
    }
}