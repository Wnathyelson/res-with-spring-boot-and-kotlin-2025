package br.com.api.res_with_spring_boot_and_kotlin_2025.service

import br.com.api.res_with_spring_boot_and_kotlin_2025.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()

    private val logger = java.util.logging.Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Finding one person!")

        val person = Person(
            id = counter.incrementAndGet(),
            firstName = "Teste",
            "1",
            "rua",
            "male"
        )

        return person
    }
}