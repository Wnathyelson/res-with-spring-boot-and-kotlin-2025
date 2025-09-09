package br.com.api.res_with_spring_boot_and_kotlin_2025.model

import jakarta.persistence.*

@Entity
@Table(name = "person")
data class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0,
    @Column(name = "first_name", nullable = false)
    var firstName: String,
    @Column(name = "last_name", nullable = false)
    var lastName: String,
    @Column(name = "address", nullable = false)
    var address: String,
    @Column(name = "gender", nullable = false)
    var gender: String
)