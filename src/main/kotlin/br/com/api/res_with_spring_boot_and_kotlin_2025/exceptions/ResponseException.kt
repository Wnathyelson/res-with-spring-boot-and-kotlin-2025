package br.com.api.res_with_spring_boot_and_kotlin_2025.exceptions

import java.util.*

class ResponseException(
    val timestamp: Date,
    val message: String?,
    val details: String
)