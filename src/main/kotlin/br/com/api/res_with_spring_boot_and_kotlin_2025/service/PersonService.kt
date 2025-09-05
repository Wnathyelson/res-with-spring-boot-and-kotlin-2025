package br.com.api.res_with_spring_boot_and_kotlin_2025.service

import br.com.api.res_with_spring_boot_and_kotlin_2025.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()

    private val logger = java.util.logging.Logger.getLogger(PersonService::class.java.name)

    fun create(person: Person) = person

    fun update(person: Person) = person
    
    fun delete(id: Long) {}

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

    fun findAll(): List<Person> {
        logger.info("Finding persons!")

        val persons: MutableList<Person> = ArrayList()
        for (i in 0..7) {
            val person = mockPerson(i)
            persons.add(person)
        }

        return persons
    }

    private fun mockPerson(i: Int): Person {
        val person = Person(
            id = counter.incrementAndGet(),
            firstName = "Teste $i",
            "1 $i",
            "rua",
            "male"
        )

        return person
    }
}