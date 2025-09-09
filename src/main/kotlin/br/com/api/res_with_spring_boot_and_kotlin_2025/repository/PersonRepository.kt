package br.com.api.res_with_spring_boot_and_kotlin_2025.repository

import br.com.api.res_with_spring_boot_and_kotlin_2025.model.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<Person, Long?>