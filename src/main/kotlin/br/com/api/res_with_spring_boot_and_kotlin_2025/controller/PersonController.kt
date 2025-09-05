package br.com.api.res_with_spring_boot_and_kotlin_2025.controller

import br.com.api.res_with_spring_boot_and_kotlin_2025.model.Person
import br.com.api.res_with_spring_boot_and_kotlin_2025.service.PersonService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/person")
class PersonController(
    val service: PersonService
) {

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): Person {
        return service.findById(id)
    }

    @PostMapping
    fun create(person: Person): Person {
        return service.create(person)
    }

    @PutMapping
    fun update(person: Person): Person {
        return service.update(person)
    }

    @GetMapping
    fun delete(id: Long) {
        return service.delete(id)
    }

}