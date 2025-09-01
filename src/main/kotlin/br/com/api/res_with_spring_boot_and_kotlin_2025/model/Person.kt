package br.com.api.res_with_spring_boot_and_kotlin_2025.model

data class Person(
    var id: Long = 0,
    var firstName: String,
    var lastName: String,
    var address: String,
    var gender: String
)